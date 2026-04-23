package E1SistemasEstudiantes;

class Estudiante {

    private String nombre;
    private String matricula;
    private Materia[] materias;
    private int cantMaterias;
    
    Estudiante(String nombre, String matricula){
    this.nombre = nombre;
    this.matricula = matricula;
    materias = new Materia[3];
    cantMaterias = 0;
    }

    String getNombre(){
        return nombre;
    }

    String getMatricula(){
        return matricula;
    }

    void agregarMateria(Materia nuevaMateria){
        if(cantMaterias == materias.length){
            System.out.println("Error: Ha Llegado Al Maximo De Materias");
            return;
        }

        materias[cantMaterias] = nuevaMateria;
        cantMaterias++;
    }

    double calcularPromedio(){
        double sumP=0, Prom = 0;
        for (int i = 0; i < materias.length; i++) {
            if (materias[i] != null) {
                sumP = sumP + materias[i].getCalificacion();
            }
        }
        return Double.parseDouble(String.format("%.2f", Prom = sumP/cantMaterias)); // redondea el promedio a 2 decimales
    }

    String mostrarInformacion(){
        StringBuilder info = new StringBuilder();
        for (int i = 0; i < materias.length; i++) {
            info.append(materias[i].getNombre()).append("\n").append(materias[i].getCalificacion()).append("\n").append(materias[i].estaAprobado() ? "Aprobado\n\n" : "Reprobado\n\n");

        }

        return "Estudiante: " + getNombre() + "\n"
                + "Matricula: " + getMatricula() + "\n" +
                "Promedio: " + calcularPromedio() + "\n\n"
                + info.toString();
    }
}
