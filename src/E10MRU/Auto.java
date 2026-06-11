package E10MRU;

public class Auto extends Vehiculo{
    private int numeroPasajeros;

    public Auto(String nombre, double velocidad, int numeroPasajeros){
        super(nombre, velocidad, TipoVehiculo.AUTO);
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public String descripcion(){
        return "Auto["+nombre+"] | [" + numeroPasajeros + "] pasajeros | ["+velocidad+"] km/h";
    }
}
