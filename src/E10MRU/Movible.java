package E10MRU;

public interface Movible {

    void mover(double tiempo); // mover objeto
    double calcularTiempo(double distancia); // calcular el tiempo de recorrer esa distancia
    String descripcion(); // descripcion del vehiculo
}
