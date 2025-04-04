package TercerTrimestre.EjerciciosClase.EjemplosColecciones.HashSet.HashSet_Comparable_ComparateTo;

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
        return this.nombre.compareToIgnoreCase(otra.nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Fruta)) return false;
        Fruta otra = (Fruta) obj;
        return this.nombre.equalsIgnoreCase(otra.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.toLowerCase().hashCode();
    }

    // Misma altura y nombre (duplicados en función de un criterio)
}
