package E2CarritoCompras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String op; boolean des=false;
        Persona Cliente = new Persona("Pedro", 19, "0745839211");

        Carrito carrito = new Carrito(5);
        Producto Tablet = new Producto(23, "Samsung S12", 450.00);
        Producto Telefono = new Producto(45, "IPhone 12", 567.00);
        Producto Empanadas = new Producto(23, "Empanadas De Queso", 256.00);
        Producto Hamburguesa = new Producto(56, "Hamburguesa con Queso", 2.50);
        Producto Gaseosa = new Producto(78, "Gaseosa Coca-Cola", 1.30);

       carrito.agregarProducto(Tablet);
       carrito.agregarProducto(Telefono);
       carrito.agregarProducto(Empanadas);
       carrito.agregarProducto(Hamburguesa);
       carrito.agregarProducto(Gaseosa);

        carrito.calcularTotal();
        System.out.println(Cliente.datosPersonales());
        System.out.println("--------Lista De Productos---------");
        System.out.println(carrito.mostrarTicket(des));
        System.out.println("¿Desea Aplicar Un Descuento? (S/N)");
        op = input.nextLine();
        if(op.equalsIgnoreCase("S")){
            des = true;
            carrito.aplicarDescuento();
            System.out.println("    Descuento Aplicado Del 15%");
        }

        System.out.println(carrito.mostrarTicket(des));

    }
}
