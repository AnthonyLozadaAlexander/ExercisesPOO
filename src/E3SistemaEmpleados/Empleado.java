package E3SistemaEmpleados;

public class Empleado {

    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, Double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre(){
        return nombre;
    }

    double calcularPago(){
        return salarioBase;
    }

    String mostrarDatos(){
        return "Datos Personales Del Empleado: \n" +
                 "Nombre: " + getNombre() + "\n" +
                 "Salario: " + calcularPago() + "\n";
    }
}
