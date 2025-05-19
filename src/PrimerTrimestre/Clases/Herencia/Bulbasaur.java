package PrimerTrimestre.Clases.Herencia;

public class Bulbasaur extends Pokemon {
    
    public Bulbasaur(String nombre) {

        super(nombre, "Planta");
    }

    public String toString() {

        return "Bulbasaur: " + super.toString();
    }

    public void curar() {

        super.ps += 50;
    }
}
