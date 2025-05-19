package PrimerTrimestre.Clases.Herencia;

public class Charmander extends Pokemon {
    
    private int multiplicarDanyo;

    public Charmander(String nombre) {

        super(nombre, "Fuego");
        this.multiplicarDanyo = 3;
    }

    public int getMultiplicarDanyo() {
        return multiplicarDanyo;
    }

    public void setMultiplicarDanyo(int multiplicarDanyo) {
        this.multiplicarDanyo = multiplicarDanyo;
    }

    @Override
    public void atacar(Pokemon otro) {

        if (otro instanceof Squirtle) {
            if (!otro.defendiendo) {
                otro.ps -= (100 * this.multiplicarDanyo);
            } else {
                otro.ps -= 50;
            }
        } else {
            otro.ps -= (100 * this.multiplicarDanyo); 
        }
    }
}
