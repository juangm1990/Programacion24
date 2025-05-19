package SegundoTrimestre.Objetos_Interfaces.Pokemon;

public class Bulbasur extends Pokemon {

    public Bulbasur(String nombre) {
        super(nombre, "planta");
    }

    public void curar() {
        this.ps = this.ps + 50;
        System.out.println(nombre + " se ha curado +50 PS.");
    }
}
