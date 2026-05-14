package E7BatallaRPG;

public class Guerrero extends Personaje{
    private int fuerzaExtra;

    public Guerrero(String nombre, int vida, int puntosAtaque, int fuerzaExtra){
    super(nombre, vida, puntosAtaque);
    this.fuerzaExtra = fuerzaExtra;
    }

    @Override
    public void atacar(Personaje Objetivo){
        int total = (puntosAtaque + fuerzaExtra);
        Objetivo.recibirDano(total);
        System.out.println("["+nombre+"] ataca con su espada a [" + Objetivo.getNombre() + "] haciendo ["+ total +"] de danio!");
    }
}
