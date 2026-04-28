package E4SistemaBiblioteca;

class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    String getTitulo(){
        return titulo;
    }

     String getAutor(){
        return autor;
    }

     boolean getDisponible(){
        return disponible;
    }

     void prestar(){
        this.disponible = false;
    }

     void devolver(){
        this.disponible = true;
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Disponible: " + disponible + "\n";
    }


}
