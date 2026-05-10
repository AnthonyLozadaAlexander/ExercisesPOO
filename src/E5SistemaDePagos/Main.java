package E5SistemaDePagos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean salir = false;
        String opc = "", titular = "", fechaExperiacion = "", correoElectronico = "";
        int cvv = 0;
        long Inicio = System.currentTimeMillis();
        System.out.println("Iniciando...");
        do {
            System.out.println("-----------------------------------------------");
            System.out.println("                 BIENVENIDO                    ");
            System.out.println("-----------------------------------------------");
            System.out.println("Elija el Metodo Para Procesar El Pago");
            System.out.println("1. Tarjeta De Credito");
            System.out.println("2. Paypal");
            System.out.println("3. Salir");
            System.out.println("-----------------------------------------------");
            opc = input.nextLine();
            switch(opc){
                case "1":
                    do {
                        System.out.print("Ingrese Su Nombre: ");
                        titular = input.nextLine();
                        System.out.print("Ingrese La Fecha De Experiacion: ");
                        fechaExperiacion = input.nextLine();
                        System.out.print("Ingrese Su Monto: ");
                        cvv = validarInt(input);
                        input.nextLine();

                    }while(cvv == -1);

                    TarjetaCredito credito = new TarjetaCredito(titular, fechaExperiacion, cvv);
                    credito.procesarPago(200.41);
                    break;
                case "2":
                    System.out.print("Ingrese Su Nombre: ");
                    titular = input.nextLine();
                    System.out.print("Ingrese Su Correo Electronico: ");
                    correoElectronico = input.nextLine();

                    Paypal paypal = new Paypal(titular, correoElectronico);
                    paypal.procesarPago(120.43);
                    break;
                case "3":
                    System.out.println("Gracias Por Usar El Sistema");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }while(salir == false);

        input.close();
        long fin = System.currentTimeMillis();
        long tiempoTotal = fin - Inicio;
        System.out.println("Tiempo Total: " + tiempoTotal + " ns");

    }

    static int validarInt(Scanner input){
        if(!input.hasNextInt()){
            System.out.println("Error: Formato Invalido");
            System.out.println("Presiona ENTER para continuar");
            input.nextLine();
            return -1;
        }
        return input.nextInt();
    }
}
