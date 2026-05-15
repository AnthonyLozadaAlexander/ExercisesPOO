package E8SistemaBancario;

public class CuentaBancaria {
    private static int totalCuentasCreadas = 0; // comparte el mismo atributo para todas las cuentas
    private String titular;
    private int numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
        totalCuentasCreadas++; // Incrementa el contador cada vez que se crea una nueva cuenta
        this.numeroCuenta = totalCuentasCreadas;
    }

    public void depositar(double monto){
        double total = saldo + monto;
    }

    public void retirar(double monto){
        double total = 0.0;
        if(saldo > 0){
        total = saldo - monto;
        }else{
            System.out.println("Fondos Insuficientes");
        }
    }

    static void mostrarTotalCuentas(){
        System.out.println("Se han creado en el banco un total de: "+ totalCuentasCreadas);
    }

    void transferir(CuentaBancaria destino, double monto){
        double total = 0.0;
        if(this.saldo >= monto){
              total = saldo - monto;
              destino.depositar(monto);
        }
    }

    void transferir(CuentaBancaria destino, double monto, double comision){
        double total = 0.0;
        if(this.saldo >= monto){
            total = (saldo - monto) - comision;
            destino.depositar(monto);
        }
    }



}
