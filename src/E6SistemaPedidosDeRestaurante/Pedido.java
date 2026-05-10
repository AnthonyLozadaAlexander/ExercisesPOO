package E6SistemaPedidosDeRestaurante;

public class Pedido {
    Consumible[] items;
    private int cantidadItems;

    public Pedido(int cantidadMaxima){
        this.cantidadItems = 0;
        items = new Consumible[cantidadMaxima];
    }

    void agregarItem(Consumible item){
        if(cantidadItems < items.length){
        items[cantidadItems] = item;
        cantidadItems++;
        }else{
            System.out.println("\nPedido Completo\n");
        }
    }

    double calcularTotal(){
        double suma = 0;
        for (int i = 0; i < items.length; i++) {
            suma = suma + items[i].getPrecio();
        }
        return suma;
    }

    void mostrarRecibo(){
        System.out.println("/n------Recibo------");
        for (int i = 0; i < items.length; i++) {
            if(items[i] != null) {
                System.out.println(items[i].getDescripcion());
                System.out.println(items[i].getPrecio());
            }
        }
        System.out.println("\nTotal a Pagar: " + calcularTotal() + " $");
        System.out.println("-------------------\n");
    }


}
