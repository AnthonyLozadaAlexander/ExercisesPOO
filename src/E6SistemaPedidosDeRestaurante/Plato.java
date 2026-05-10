package E6SistemaPedidosDeRestaurante;

public class Plato implements Consumible{
    private String nombre;
    private Double precioBase;
    private Boolean esVegetariano;

    public Plato(String nombre, Double precioBase, Boolean esVegetariano){
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.esVegetariano = esVegetariano;
    }

    @Override
    public double getPrecio() {
        if(esVegetariano){
             return precioBase + 2.0;
        }else{
            return precioBase;
        }
    }

    @Override
    public String getDescripcion() {
        return "\nPlato: " + nombre + "\n" +
                "Vegetariano: " + esVegetariano + "\n";
    }
}
