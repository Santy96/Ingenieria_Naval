public class Direccion{
    String calle_ppal;
    String calle1;
    String calle2;
    int altura;
    int piso;
    String dpto;
    int unidad;
    String cod_postal;
    String localidad;
    String barrio;
    String provincia;
    String pais;
           
    public void inicializar(String streetppal, String street1, String street2,
    		int num, int floor, String depto, int unid, String codpostal,
    		String localid, String barr, String prov, String country)
    {
      calle_ppal = streetppal;
      calle1 = street1;
      calle2 = street2;
      altura = num;
      piso = floor;
      dpto = depto;
      unidad = unid;
      cod_postal = codpostal;
      localidad = localid;
      barrio = barr;
      provincia = prov;
      pais = country;
    }
}
