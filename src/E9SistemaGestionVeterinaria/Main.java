package E9SistemaGestionVeterinaria;

public class Main {
    public static void main(String[] args) {
        Veterinario v1 = new Veterinario("Ramirez", "Cirujano");
        Veterinario v2 = new Veterinario("Perez", "Anestesiologo");

        Perro p = new Perro("Jaime",  4, "Pug");
        Gato g = new Gato("Amarillo", 2, true);

        v1.atender(p, "Gripe", "Moquillo", 40);
        v1.atender(g, "Gripe", "Moquillo", 40);
        v2.atender(g, "Fiebre", "Deshidratacion", 30);

        System.out.println(p.mostrarInfo() + "\n");
        System.out.println(g.mostrarInfo() + "\n");

        System.out.println("Total Costo Acumulado De: " + p.getNombre() + "\n" +
                "Total: " + p.calcularCostoTotal());
        System.out.println("Total Costo Acumulado De: " + g.getNombre() + "\n" +
                "Total: " + g.calcularCostoTotal());

        System.out.println("\n" + p.hacerSonido());
        System.out.println(g.hacerSonido());

        System.out.println("\nInformacion De Los Veterinarios");
        System.out.println(v1.mostrarInfo());
        System.out.println(v2.mostrarInfo());
    }
}
