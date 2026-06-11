package E9SistemaGestionVeterinaria;

import java.util.ArrayList;

public abstract class Animal {
    private String nombre;
    private int edad;
    private TipoAnimal tipo;
    private ArrayList<Consulta> historial;

    public Animal(String nombre, int edad, TipoAnimal tipo){
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        historial = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public TipoAnimal getTipo(){
        return tipo;
    }

    public void agregarConsulta(Consulta c){
        historial.add(c);
    }

    public double calcularCostoTotal(){
        double total = 0.0;
        for (int i = 0; i < historial.size(); i++) {
            total = total + historial.get(i).getCosto();
        }

        return total;
    }

    public abstract String hacerSonido();

    public String mostrarInfo(){
        return "Informacion\n" +
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Tipo: " + tipo + "\n" +
                "Costo Total: " + calcularCostoTotal();
    }
}
