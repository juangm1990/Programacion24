package PrimerTrimestre.Clases.Unidireccional;


public class Contador {
    
    private int numero;

    public Contador() {

        this.numero = 0;
    }

    public void sumar () {
        this.numero += 20;
    }

    public String toString() {

        return "Número: " + this.numero;
    }
}
