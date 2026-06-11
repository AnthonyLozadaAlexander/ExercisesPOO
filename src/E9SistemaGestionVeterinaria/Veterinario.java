package E9SistemaGestionVeterinaria;

public class Veterinario{

    private String nombre;
    private String especialidad;
    private int totalConsultasRealizadas = 0;

    public Veterinario(String nombre, String especialidad){
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getTotalConsultasRealizadas() {
        return totalConsultasRealizadas;
    }


}
