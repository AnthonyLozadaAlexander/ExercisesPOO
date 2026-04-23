package E2CarritoCompras;

class Producto {

    private Integer id;
    private String nombre;
    private Double precio;

    Producto(Integer id, String nombre, Double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    Integer getId(){
        return id;
    }

    String getNombre(){
        return nombre;
    }

    Double getPrecio(){
        return precio;
    }

    String mostrarDetalle(){
        return "[ID: "+getId()+"] \n" +
                "Nombre Producto: " + getNombre() + "\n" +
                "$Precio: " + getPrecio() + "\n";
    }
}
