package PrimerTrimestre.Clases.Unidireccional;

public class Persona2 {

    private int edad;

    public Persona2(int e) {

        if (validarEdad(e)) {
            this.edad = e;
        }
    }

    public int getEdad() {

        return this.edad;
    }

    public void setEdad(int e) {

        if (e >= 0 && e <= 140) {
            this.edad = e;
        }
    }

    public String toString() {

        return "Edad: " + this.edad;
    }

    private boolean validarEdad(int ed) {

        if (ed >= 0 && ed <= 150) {
            return true;
        }
           
        return false;
    }
}
