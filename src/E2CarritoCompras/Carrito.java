package E2CarritoCompras;

public class Carrito {

    private Producto[] productos;
    private int cantActual;
    private int capacidadMax;

    Carrito(int capacidadMax){
        this.capacidadMax = capacidadMax;
        productos = new Producto[capacidadMax];
        cantActual = 0;
    }

    void agregarProducto(Producto producto){
             if(cantActual < capacidadMax){
                 productos[cantActual] = producto;
                 cantActual++;
             }

             if(cantActual == capacidadMax){
                 System.out.println("Carrito Lleno, No se puede agregar el producto ["+ producto.getNombre()+"]");
             }
    }

    double calcularTotal(){
        double total = 0.0;
        for (int i = 0; i < capacidadMax; i++) {
            total = total + productos[i].getPrecio();
        }

        return total;
    }

    double calcularPorcentaje(int porcentaje ){
        return calcularTotal()*(porcentaje/100);
    }

    double aplicarDescuento(double porcentaje){
        return calcularTotal() - (porcentaje * calcularTotal()/100);
    }

    String mostrarTicket(){
        StringBuilder sbInfo = new StringBuilder();
        sbInfo.append("********** TICKET DE COMPRA **********\n");
        for (int i = 0; i < cantActual;i++) {
           sbInfo.append(productos[i].mostrarDetalle()).append("\n");
        }

        sbInfo.append("Total A Pagar: " + calcularTotal()).append("\n");

        return sbInfo.toString();
    }
}
