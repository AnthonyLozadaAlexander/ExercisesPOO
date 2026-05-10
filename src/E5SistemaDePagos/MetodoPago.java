package E5SistemaDePagos;

public abstract class MetodoPago implements Procesable {
    private String titular;
    private int numTransaccion;

    public MetodoPago(String titular){
        this.titular = titular;
        this.numTransaccion = (int) (Math.random() * 1000); // numero aleatorio de transaccion
    }

    void imprimirRecibo(double monto){
        System.out.println("--Numero De Transaccion ["+(numTransaccion+1)+"]--" + "\n" + "Nombre: " + titular + " \nMonto de $" + monto + "\n");

    }
}
