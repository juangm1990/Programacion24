package SegundoTrimestre.Examenes.BolaExtra_Objetos3;

public class PersonajeAtaque extends Personaje {
    private int danoBase;

    public PersonajeAtaque(int id, String nombre, int nivel, int danoBase) {
        super(id, nombre, nivel, "ataque");
        this.danoBase = danoBase;
    }

    @Override
    public int calcularPoder() {
        return nivel * danoBase;
    }

    @Override
    public String toString() {
        return super.toString() + ", Daño base: " + danoBase;
    }
}
