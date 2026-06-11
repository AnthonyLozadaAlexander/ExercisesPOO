package E10MRU;

public abstract class Vehiculo implements Movible {
    protected String nombre;
    protected double velocidad;
    protected double posicion;
    protected TipoVehiculo tipo;

    public Vehiculo(String nombre, double velocidad, TipoVehiculo tipo){
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.tipo = tipo;
    }

    @Override
    public void mover(double tiempo){
        posicion = posicion + (velocidad * tiempo);
    }

    @Override
    public double calcularTiempo(double distancia){
        double tiempo = (distancia / velocidad);
        return tiempo;
    }

    public double calcularDistancia(double tiempo){
        double distancia = (velocidad * tiempo);
        return distancia;
    }

    public String mostrarEstado(){
        return  "Nombre: " + nombre + "\n" +
                "Tipo: "+ tipo + "\n" +
                "Velocidad: " + velocidad + "\n" +
                "Posicion: " + posicion + "\n";
    }

    public abstract String descripcion();



}
