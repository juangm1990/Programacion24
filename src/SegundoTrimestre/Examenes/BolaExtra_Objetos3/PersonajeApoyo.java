package SegundoTrimestre.Examenes.BolaExtra_Objetos3;

public class PersonajeApoyo extends Personaje {
    protected int curacionBase;

    public PersonajeApoyo(int id, String nombre, int nivel, int curacionBase) {
        super(id, nombre, nivel, "apoyo");
        this.curacionBase = curacionBase;
    }

    @Override
    public int calcularPoder() {
        return nivel * curacionBase;
    }

    @Override
    public String toString() {
        return super.toString() + ", Curación base: " + curacionBase;
    }
}
