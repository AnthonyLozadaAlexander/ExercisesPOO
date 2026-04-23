package E2CarritoCompras;


class Persona {
    private String nombre;
    private int edad;
    private String cedula;

    Persona(String nombre, int edad, String cedula){
        this.nombre = nombre;

        if(edad < 0){
            throw new IllegalArgumentException("Error: Edad Negativa");
        }else{
            this.edad = edad;
        }

        this.cedula = cedula;
    }

    String getNombre(){
        return nombre;
    }

    int getEdad(){
        return edad;
    }

    String getCedula(){
        return cedula;
    }

    String datosPersonales(){
        return "\nDatos Personales Del Cliente\n" +
                "Nombre: " + getNombre() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Cedula: " + getCedula() + "\n";
    }
}
