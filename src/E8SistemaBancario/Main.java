package E8SistemaBancario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double monto = 0;
        CuentaBancaria.mostrarTotalCuentas();
        CuentaBancaria c1 = new CuentaBancaria("Alicia", 500.0);
        CuentaBancaria c2 = new CuentaBancaria("Bob", 100.0);
        System.out.println("--------------------------------------------------");
        System.out.println("                Transferencias                    ");
        System.out.println("--------------------------------------------------");
        System.out.print("Ingrese El Monto A Transferir a la Cuenta " + c2.getTitular() + ": ");
        monto = input.nextDouble();
        input.nextLine();
        c1.transferir(c2, monto);
        System.out.println("-------------------------------------------------");
        System.out.print("Ingrese El Monto A Transferir a la Cuenta " + c1.getTitular() + ": ");
        monto = input.nextDouble();
        input.nextLine();
        c1.transferir(c2,50.0, 5);
        System.out.println("------------------------------------------------");
        System.out.println("        Informacion De Las Cuentas");
        System.out.println("------------------------------------------------");
        System.out.println(c1.mostrarInfo());
        System.out.println(c2.mostrarInfo());
        System.out.println("------------------------------------------------");
    }
}
