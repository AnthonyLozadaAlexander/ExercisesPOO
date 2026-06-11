package E9SistemaGestionVeterinaria;

public class Veterinario {

    private String nombre;
    private String especialidad;
    private int totalConsultasRealizadas = 0;

    public Veterinario(String nombre, String especialidad) {
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

    public void atender(Animal animal, String motivo, String diagnostico, double costo) {
        Consulta c = new Consulta(motivo, diagnostico, costo);
        animal.agregarConsulta(c);
        totalConsultasRealizadas = totalConsultasRealizadas + 1;
        System.out.println(" Dr. " + getNombre() + " Atendio a " + animal.getNombre() + " por: " + motivo + "\n");
    }


    public String mostrarInfo() {
        return "Dr. " + getNombre() + " \n" +
                "Especialidad: " + getEspecialidad() + "\n" +
                "Total Consultas: " + totalConsultasRealizadas + "\n";
    }
}
