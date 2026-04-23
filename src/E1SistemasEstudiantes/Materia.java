package E1SistemasEstudiantes;

class Materia {

    private String nombre;
    private double calificacion;

    Materia(String nombre, double calificacion){
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    String getNombre(){
        return nombre;
    }

    Double getCalificacion(){
        return calificacion;
    }

    void setCalificacion(double calificacion){
        if(getCalificacion() >= 0 && getCalificacion() <= 10.0)
            this.calificacion = calificacion;
        else
            System.out.println("Error: La Calificacion No Esta Entre 0 y 10");
    }

    Boolean estaAprobado(){
        if(getCalificacion() >= 6)
            return true;

        return false;
    }
}
