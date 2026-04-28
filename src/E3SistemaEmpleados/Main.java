package E3SistemaEmpleados;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Empleado[] e = new Empleado[3];
        Empleado empleado = new Empleado("Hector", 120.0);
        Gerente gerente = new Gerente("Francisco", 400.0, 100.0);
        Vendedor vendedor = new Vendedor("Mario", 140.0, 20);

        e[0] = empleado;
        e[1] = gerente;
        e[2] = vendedor;

        vendedor.RegistrarVentas();
        vendedor.RegistrarVentas();
        vendedor.RegistrarVentas();
        vendedor.RegistrarVentas();

        for (int i = 0; i < e.length; i++) {
             // Polimorfismo
            e[i].calcularPago();
            e[i].mostrarDatos();
        }

        sb.append("Empleado: " + "\n" + empleado.mostrarDatos() + "\n").append("Gerente: " + "\n" + gerente.mostrarDatos() + "\n").append("Vendedor: " + "\n" + vendedor.mostrarDatos());

        System.out.println(sb.toString());
    }
}
