package TercerTrimestre.Colecciones.HashMap.HashMap_Comparable_ComparateTo;

public class Persona implements Comparable<Persona> {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Persona otra) {
        return this.nombre.compareToIgnoreCase(otra.nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Persona)) return false;
        Persona otra = (Persona) obj;
        return this.nombre.equalsIgnoreCase(otra.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.toLowerCase().hashCode();
    }
}
