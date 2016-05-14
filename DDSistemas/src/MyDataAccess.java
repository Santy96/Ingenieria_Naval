import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDataAccess {

 private String _usuario="root";
 private String _pwd= "root";
 private static String _bd="dds";
 static String _url = "jdbc:mysql://localhost:3306/"+_bd;
 private Connection conn;
 
 public MyDataAccess() {
  
   try{
     Class.forName("com.mysql.jdbc.Connection");
     conn = (Connection)DriverManager.getConnection(_url, _usuario, _pwd);
     if(conn != null)
     {
       System.out.println("Conexi-n a base de datos "+_url+" . . . Ok");
     }
   }
   catch(SQLException ex)
   {
      System.out.println("Hubo un problema al intentar conecarse a la base de datos"+_url);
   }
   catch(ClassNotFoundException ex)
   {
      System.out.println(ex);
   }  
 }
 
 //para un select que devuelve la tabla 
 public ResultSet getQuery(String _query)
 {
    Statement state = null;
    ResultSet resultado = null;
    try{
      state = (Statement) conn.createStatement();
      resultado = state.executeQuery(_query);
    }
    catch(SQLException e)
    {
      e.printStackTrace();
    }
    return resultado;
 }
 
 //Para hacer update, insert, delete
 public void setQuery(String _query){

    Statement state = null;
  
    try{   
      state=(Statement) conn.createStatement();
      state.executeUpdate(_query);

    }catch (SQLException e){
      e.printStackTrace();
    }
 }
}