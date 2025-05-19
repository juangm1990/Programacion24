package PrimerTrimestre.Clases.Herencia;

public class Pokemon {

    protected String nombre;
    protected String tipo;
    protected int nivel;
    protected int ps;
    protected boolean defendiendo;
    
    public Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = 1;
        this.ps = 1000;
        this.defendiendo = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public boolean isDefendiendo() {
        return defendiendo;
    }

    public void setDefendiendo(boolean defendiendo) {
        this.defendiendo = defendiendo;
    }

    @Override
    public String toString() {
        return "Pokemon [nombre=" + nombre + ", tipo=" + tipo + ", nivel=" + nivel + ", ps=" + ps + ", defendiendo="
                + defendiendo + "]";
    }

    public void atacar(Pokemon otro) {

        if (!otro.defendiendo) {
            otro.ps -= 100;
        } else {
            otro.ps -= 50;
        }
    }

    public void defender(boolean estado) {

        this.defendiendo = estado;
    }
}
