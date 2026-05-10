package E5SistemaDePagos;

public class TarjetaCredito extends MetodoPago{
    private String fechaExpiracion;
    private int cvv;

    public TarjetaCredito(String titular, String fechaExpiracion, int cvv){
        super(titular);
        this.cvv = cvv;
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("\nProcesando El Pago con $" + monto + " con Tarjeta De Credito");
        imprimirRecibo(monto);
    }
}
