package E9SistemaGestionVeterinaria;

public class Perro extends Animal{
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad, TipoAnimal.PERRO); // instanciando los atributos heredados nombre/edad/tipo
        this.raza = raza;
    }

    @Override
    public String hacerSonido() {
        return "!Guau Guau!";
    }

    @Override
    public String mostrarInfo(){
        return super.mostrarInfo() + "\n" +
                    "Raza: " + raza;
    }
}
