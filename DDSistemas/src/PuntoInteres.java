import java.math.*;
public class PuntoInteres
{
    String nombre;
    Direccion address;
    Coordenada miCoordenada;
    
    public void inicializar(String name, Coordenada coordenada, Direccion add) 
    {
        nombre=name;
        miCoordenada = coordenada;
        address = add;
    }
    
    public double distanciaAPOI (PuntoInteres otroPunto)
    {
        double distancia = 0;
        Coordenada coordenada1 = new Coordenada();
        coordenada1 = otroPunto.geocodificar();
        
        distancia = Math.sqrt(Math.pow((coordenada1.latitud - this.geocodificar().latitud),2) + Math.pow((coordenada1.longitud - this.geocodificar().longitud),2));
        return distancia;
    }
    
    public Coordenada geocodificar()
    {
        return miCoordenada;
    }
    
    public Direccion getAddress()
    {
        return address;
    }
    
    public boolean distanciaMenorA (PuntoInteres unPunto, double dist)
    {
        boolean ok = false;
        ok = this.distanciaAPOI(unPunto) < dist;
        return ok;
    }
    
    
    public boolean soyValido()
    {
        if (this.nombre.equals("") || this.geocodificar().latitud < 0 || this.geocodificar().longitud < 0)
        {
            return false;
        }
        return true;
        
    }
}
