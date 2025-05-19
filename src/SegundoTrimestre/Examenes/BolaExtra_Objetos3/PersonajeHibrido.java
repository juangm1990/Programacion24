package SegundoTrimestre.Examenes.BolaExtra_Objetos3;

public class PersonajeHibrido extends PersonajeApoyo implements Activable {
    private int curacionExtra;
    private boolean habilidadActivada;

    public PersonajeHibrido(int id, String nombre, int nivel, int curacionBase, int curacionExtra) {
        super(id, nombre, nivel, curacionBase);
        this.curacionExtra = curacionExtra;
        this.habilidadActivada = false;
        this.rol = "hibrido"; // Sobrescribimos el rol
    }

    @Override
    public int calcularPoder() {
        if (habilidadActivada) {
            return nivel * (curacionBase + curacionExtra);
        } else {
            return nivel * curacionBase;
        }
    }

    @Override
    public void activarHabilidad() {
        if (!habilidadActivada) {
            habilidadActivada = true;
            System.out.println(nombre + " ha activado su habilidad especial.");
        } else {
            System.out.println("La habilidad ya estaba activada.");
        }
    }

    public boolean isHabilidadActivada() {
        return habilidadActivada;
    }

    @Override
    public String toString() {
        return super.toString() + ", Curación extra: " + curacionExtra + ", Habilidad activada: " + habilidadActivada;
    }
}
