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
        materias[cantMaterias] = nuevaMateria;
        cantMaterias = cantMaterias + 1;
    }
}
