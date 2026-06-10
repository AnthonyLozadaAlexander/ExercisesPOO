package E9SistemaGestionVeterinaria;

import java.util.ArrayList;

public abstract class Animal {
    String nombre;
    int edad;
    TipoAnimal tipo;
    ArrayList<Consulta> historial;

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
}
