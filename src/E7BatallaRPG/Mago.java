package E7BatallaRPG;

public class Mago extends Personaje{
    private int poderMagico;
    private int mana;
    private int puntosAtaque;

    public Mago(String nombre, int vida, int poderMagico,int puntosAtaque, int Mana){
        super(nombre, vida, puntosAtaque);
        this.poderMagico = poderMagico;
        this.mana = Mana;
    }

    @Override
    public void atacar(Personaje objetivo){
        int danioTotal;
        if(mana > 0){
            danioTotal = puntosAtaque + poderMagico;
            objetivo.recibirDano(danioTotal);
            mana = mana - 1;
            System.out.println("\n["+nombre+"] lanza un hechizo  a ["+objetivo.getNombre()+"] por " + danioTotal + " Dano!");
            System.out.println("Mana Restante: " + mana);
        }
        else if(mana == 0){
            danioTotal = puntosAtaque;
            objetivo.recibirDano(danioTotal);
            System.out.println("[" + nombre + "] se quedo sin mana y golpea a ["+objetivo.getNombre() + "] por " + danioTotal + " Danio!");
        }

        System.out.println("[" + objetivo.getNombre() + "] Vida Actual: " + objetivo.getVida());
    }

    @Override
    public String mostrarInfo(){
        return "\nPersonaje Tipo: Mago" + super.mostrarInfo();
    }
}
