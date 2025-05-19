package TercerTrimestre.Colecciones.TreeSet.TreeSet_Comparable_ComparateTo;

public class Fruta implements Comparable<Fruta> {
    private String nombre;

    public Fruta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Fruta otrafruta) {
        return this.nombre.compareTo(otrafruta.nombre); // Orden alfabético ASCII
    }

    @Override
    public String toString() {
        return nombre;
    }
}