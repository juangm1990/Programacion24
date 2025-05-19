package SegundoTrimestre.Objetos_Interfaces.Pokemon;

public class Charmander extends Pokemon {

    private int multiplicadornyo;

    public Charmander(String nombre) {
        super(nombre, "fuego");
        this.multiplicadornyo = 3;
    }

    @Override
    public void atacar(Pokemon otro) {
        if (otro instanceof Squirtel) {
            if (!otro.defendiendo) {
                otro.ps = otro.ps - (100 * multiplicadornyo);
            } else {
                otro.ps = otro.ps - 50;
            }
        } else {
            otro.ps = otro.ps - (100 * multiplicadornyo);
        }
    }
}
