package E8SistemaBancario;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria.mostrarTotalCuentas();
        CuentaBancaria c1 = new CuentaBancaria("Alicia", 500.0);
        CuentaBancaria c2 = new CuentaBancaria("Bob", 100.0);
        c1.transferir(c2, 50.0);
        c1.transferir(c2,50.0, 5);


    }
}
