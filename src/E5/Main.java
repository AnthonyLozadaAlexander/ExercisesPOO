package E5;

public class Main {
    public static void main(String[] args) {
        TarjetaCredito credito = new TarjetaCredito("Pepito", "2026", 2354);
        Paypal paypal = new Paypal("Juanito", "juanito@gmail.com");

        credito.procesarPago(200.41);
        paypal.procesarPago(120.43);
    }
}
