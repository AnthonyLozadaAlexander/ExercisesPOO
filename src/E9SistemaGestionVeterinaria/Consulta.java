package E9SistemaGestionVeterinaria;

public class Consulta {
    private String motivo;
    private String diagnostico;
    private double costo;

    public Consulta(String motivo, String diagnostico, double costo){
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.costo = costo;
    }

    public String getMotivo(){
        return motivo;
    }

    public String getDiagnostico(){
        return diagnostico;
    }

    public double getCosto(){
        return costo;
    }

    public String mostrarConsulta(){
        return "Consulta\n"
                + "Motivo: " + motivo + "\n" +
                "Diagnostico: " + diagnostico + "\n" +
                "Costo: " + costo + "\n";
    }
}
