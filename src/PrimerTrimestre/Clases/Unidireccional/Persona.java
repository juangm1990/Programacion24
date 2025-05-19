package PrimerTrimestre.Clases.Unidireccional;

public class Persona {

    private String nombre;
    private String fecha;

    public Persona( String nombre, String fecha) {

        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String toString() {

        return this.nombre + " " + this.fecha;
    }
}
