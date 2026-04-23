package E1SistemasEstudiantes;

public class Main {
    public static void main(String[] args) {

        Estudiante E1 = new Estudiante("Karlos", "1234");

        Materia Matematicas = new Materia("Matematicas", 6.7);
        Materia Sociales = new Materia("Sociales", 7.4);
        Materia Quimica = new Materia("Quimica", 3.4);

        E1.agregarMateria(Matematicas);
        Matematicas.setCalificacion(3.2);

        E1.agregarMateria(Sociales);
        Sociales.setCalificacion(8.5);

        E1.agregarMateria(Quimica);
        Quimica.setCalificacion(9);

        // E1.agregarMateria(new Materia("Ingles", 8.2)); si se agrega una materia mas del arreglo[3] de materias, mandara un error

        System.out.println(E1.mostrarInformacion());

    }
}
