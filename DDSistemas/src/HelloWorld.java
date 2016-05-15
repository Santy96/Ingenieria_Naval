import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.google.*;
import com.google.maps.*;
import com.google.maps.model.DistanceMatrix;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;
import com.squareup.okhttp.*;
import okio.*;
import com.google.gson.*;
import com.google.maps.internal.ApiConfig;
import com.google.maps.errors.ApiException;
import com.google.maps.internal.ApiResponse;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;
import org.joda.time.*;
import com.json.*;
import com.json.parsers.JSONParser;
import com.json.parsers.JsonParserFactory;
public class HelloWorld
{
	public static void main(String[] ar) throws Exception 
    {
		GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyBE5rzF-waR_NU3930wAfnML3BtdENltMs");
    	// Replace the API key below with a valid API key.
		/*
		GeocodingResult[] results =  GeocodingApi.geocode(context,"1600 Amphitheatre Parkway Mountain View, CA 94043").await();
			System.out.println(results[0].formattedAddress);
		
        DistanceMatrixApi.newRequest(context)
        .origins(new LatLng(-31.9522, 115.8589),
            new LatLng(-37.8136, 144.9631))
        .destinations(new LatLng(-25.344677, 131.036692),
            new LatLng(-13.092297, 132.394057))
        .awaitIgnoreError();
		*/
        String[] origins = new String[]{
                "Cordoba, Argentina", "Buenos Aires, Argentina", "Santa Fe, Argentina",
                
            };
            String[] destinations = new String[]{
                "Formosa, Argentina", "Santa Cruz, Argentina", "Entre Rios, Argentina",
            };
            DistanceMatrix matrix =
                DistanceMatrixApi.getDistanceMatrix(context, origins, destinations).await();

        String distancia = matrix.rows[0].elements[0].toString();
        System.out.println(distancia);
        /*
    	MyDataAccess conexion = new MyDataAccess();
    	ResultSet resultado;
    	String campo;
    	
    	//conexion.setQuery("insert into prueba values('jeje')");
    	resultado = conexion.getQuery("select * from prueba");
    	
    	
        try {
          while(resultado.next()){
          campo = resultado.getString("campo");
          System.out.println("campo: "+campo);
          }
        }catch (SQLException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }  
        */
        /*
        // Punto de Interes 1
        ParadaColectivo parada1 = new ParadaColectivo();
        Coordenada coordenada1 = new Coordenada();
        Direccion direc1 = new Direccion();
        
        // Punto de Interes 2        
        SucursalBanco sucursal1 = new SucursalBanco();
        Coordenada coordenada2 = new Coordenada();
        Direccion direc2 = new Direccion();
        
        coordenada1.inicializar(12, 15);
        coordenada2.inicializar(10, 16);
        direc1.inicializar("Av. Corrientes","Av. Federico Lacroze","Av. Forest", 7300 , 0,"",0 , "1682","", "Chacarita", "C.A.B.A","Argentina" );
        direc2.inicializar("Av. Peron", "Medrano","Mozart", 1023,0,"",0,"1678","","Almagro","C.A.B.A","Argentina");
        parada1.inicializar("Parada 328", coordenada1, direc1);
        sucursal1.inicializar("Galicia Bank", coordenada2, direc2);
    
        System.out.print("Punto de interes 1" + "\n");
        System.out.print("Latitud: "+ parada1.geocodificar().latitud + "\n");
        System.out.print("Longitud: "+ parada1.geocodificar().longitud + "\n");
        System.out.print("Nombre: "+ parada1.nombre + "\n");
        System.out.print("Calle: "+ parada1.getAddress().calle_ppal + " " + parada1.getAddress().altura + "\n");
    
        System.out.print("Punto de interes 2" + "\n");
        System.out.print("Latitud: "+ sucursal1.geocodificar().latitud + "\n");
        System.out.print("Longitud: "+ sucursal1.geocodificar().longitud + "\n");
        System.out.print("Nombre: "+ sucursal1.nombre + "\n");
        System.out.print("Calle: "+ sucursal1.getAddress().calle_ppal + " " + parada1.getAddress().altura + "\n");
        
        //Ver si se encuentran a menos de 100 metros
        int dist = 100;
        System.out.print("Se encuentran a menos de " + dist + " metros?" + "\n");
        System.out.print( parada1.distanciaMenorA(sucursal1, dist) + "\n"); 
        
        //Es valido?
        System.out.print("Es valido? " + "\n");
        System.out.print( parada1.soyValido() + "\n");
        */
    }
}
