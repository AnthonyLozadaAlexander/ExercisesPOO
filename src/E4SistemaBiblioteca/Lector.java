package E4SistemaBiblioteca;

public class Lector {

    private String nombre;
    private Libro[] librosPrestados;
    private int cantLibros;

    public Lector(String nombre){
        this.nombre = nombre;
        this.librosPrestados = new Libro[3];
        this.cantLibros = 0; // inicializa la cantLibros en 0
    }

    void tomarPrestado(Libro libro){
        if(cantLibros == librosPrestados.length){ // si la cantLibros esta llena a la longitud del arreglo librosPrestados
            System.out.println("Lector no puede llevar mas libros");
            return;
        }

        if(!(libro.getDisponible())){ // si el libro no esta disponible
            System.out.println("El libro " + libro.getTitulo() + " no tiene disponibles");
        }

        libro.prestar();
        librosPrestados[cantLibros] = libro;
        cantLibros++;

        System.out.println(nombre + " ha tomado prestado el libro: " + libro.getTitulo());
    }

    void mostrarLibros(){
        if(cantLibros == 0){ // si cantidad de libros es igual a 0, es decir no hay libros aun
            System.out.println("No hay libros ingresados");
        }
        for (int i = 0; i < librosPrestados.length; i++) {
        if(librosPrestados[i] != null){
            System.out.println(librosPrestados[i].getTitulo());
        }
        }
    }


}
