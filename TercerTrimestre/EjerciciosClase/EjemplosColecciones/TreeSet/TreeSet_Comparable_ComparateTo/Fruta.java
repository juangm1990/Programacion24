package TercerTrimestre.EjerciciosClase.EjemplosColecciones.TreeSet.TreeSet_Comparable_ComparateTo;

public class Fruta implements Comparable<Fruta> {
    private String nombre;

    public Fruta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Fruta otra) {
        return this.nombre.compareTo(otra.nombre); // Orden alfabético
    }

    @Override
    public String toString() {
        return nombre;
    }
}