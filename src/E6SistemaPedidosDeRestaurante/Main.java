package E6SistemaPedidosDeRestaurante;

public class Main {
    public static void main(String[] args) {

        Plato p1 = new Plato("Arroz Atun", 23.4, false);
        Bebida b1 = new Bebida("Coca Cola", 1.50, "Mediana");

        Pedido pedido1  = new Pedido(2);
        pedido1.agregarItem(p1);
        pedido1.agregarItem(b1);
        pedido1.calcularTotal();
        pedido1.mostrarRecibo();

    }
}
