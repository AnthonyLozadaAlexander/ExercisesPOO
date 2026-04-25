package E3SistemaEmpleados;

public class Gerente extends Empleado{
    private double bono;

    public Gerente(String nombre, Double salarioBase, double Bono){
        super(nombre, salarioBase); // inicializa el constructor del padre Empleado
        this.bono = bono;
    }

    @Override
    double calcularPago(){
        return salarioBase + bono;
    }
}
