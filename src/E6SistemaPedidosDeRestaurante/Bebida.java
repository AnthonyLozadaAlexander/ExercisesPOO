package E6SistemaPedidosDeRestaurante;

public class Bebida implements Consumible {
    private String nombre;
    private double precioBase;
    private String tipo;

    public Bebida(String nombre, Double precioBase, String tipo){
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.tipo = tipo;
    }


    @Override
    public double getPrecio(){

        switch(tipo) {
            case "pequeña" -> {
                return precioBase;
            }

            case "Mediana" -> {
                return precioBase + 1.5;
            }

            case "Grande" -> {
                return precioBase + 3.0;
            }

        }

        return -1;
    }

    @Override
    public String getDescripcion() {
        return "\nBebida: " + "[" + nombre + "]\n" +
                "Tamaño: " + "[ " + tipo + "]";
    }
}
