package E7BatallaRPG;

public abstract class Personaje implements Atacante{
    protected String nombre;
    protected int vida;
    protected int puntosAtaque;

    public Personaje(String nombre, int puntosVida, int puntosAtaque){
        this.nombre = nombre;
        this.vida = puntosVida;
        this.puntosAtaque = puntosAtaque;
    }

    public String getNombre(){
        return nombre;
    }

    public int getVida(){
        return vida;
    }

    public void recibirDano(int dano){
        vida = vida - dano;
        if(vida <= 0){
            System.out.println("\n [" + nombre + "] ha sido derrotado!");
        }
    }

    public boolean estaVivo(){
        if(vida > 0){
            return true;
        }
        return false;
    }

    public String mostrarInfo(){
        return "\nNombre: " + nombre +
                "\nVida: " + vida +
                "\nPuntos Ataque: " + puntosAtaque +
                "\n";
    }
}
