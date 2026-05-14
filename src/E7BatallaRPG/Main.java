package E7BatallaRPG;

public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Thorfin", 100, 10, 5);
        Mago mago = new Mago("Gardalf", 5, 15, 3);

        while(guerrero.estaVivo() && mago.estaVivo()){
            guerrero.atacar(mago);
            if(mago.estaVivo()){
                mago.atacar(guerrero);
            }
        }

        if(guerrero.estaVivo() && !(mago.estaVivo())){
            System.out.println("El Ganador Fue " + guerrero.getNombre());
        }else{
            System.out.println("El Ganador Fue " + mago.getNombre());
        }


    }
}
