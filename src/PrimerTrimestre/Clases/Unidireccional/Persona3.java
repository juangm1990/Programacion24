package PrimerTrimestre.Clases.Unidireccional;

public class Persona3 {

    private String nombre;
    private int edad;

    public Persona3() {

        this.nombre = "Pepe";
        this.edad = 18;
    }

    public Persona3(String n, int e) {

        this.nombre = n;
        this.edad = e;
    }

    public String getNombre() {

        return this.nombre;
    }

    public void setNombre(String n) {

        this.nombre = n;
    }

    public int getEdad() {

        return this.edad;
    }

    public void setEdad(int e) {

        this.edad = e;
    }

    public String toString() {

        return "Edad: " + this.edad;
    }
}
