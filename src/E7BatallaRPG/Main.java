package E7BatallaRPG;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String respuesta = "";
        Guerrero guerrero = new Guerrero("Thorfin", 100, 10, 5);
        Mago mago = new Mago("Gardalf", 50, 15, 3, 3);

        System.out.println("------------------------------------------------");
        System.out.println("        Informacion De Los Personajes");
        System.out.println("------------------------------------------------");
        System.out.println(guerrero.mostrarInfo());
        System.out.println("------------------------------------------------");
        System.out.println(mago.mostrarInfo());
        System.out.println("------------------------------------------------");

        System.out.println(" Desea Iniciar Un Combate Entre Los Personajes? ");
        respuesta = input.nextLine();
        if(respuesta.equalsIgnoreCase("si")){
            while(guerrero.estaVivo() && mago.estaVivo()){
                guerrero.atacar(mago);
                if(mago.estaVivo()){
                    mago.atacar(guerrero);
                }
            }
        }else{
            System.out.println("El Combate Se Cancelo");
        }

        if(guerrero.estaVivo() && !(mago.estaVivo())){
            System.out.println("El Ganador Fue " + guerrero.getNombre());
        }else{
            System.out.println("El Ganador Fue " + mago.getNombre());
        }

        input.close();

    }
}
