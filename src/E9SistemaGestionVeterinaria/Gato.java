package E9SistemaGestionVeterinaria;

public class Gato extends Animal{

    private boolean esDeInteriores; // por si el gato vive dentro de una casa o no, es decir indoor

    public Gato(String nombre, int edad, boolean esDeInteriores){
        super(nombre, edad, TipoAnimal.GATO);
        this.esDeInteriores = esDeInteriores;
    }

    @Override
    public String hacerSonido(){
        return "!Miau";
    }

    @Override
    public String mostrarInfo(){
        return super.mostrarInfo() + " Es Indoor? " + esDeInteriores;
    }
}
