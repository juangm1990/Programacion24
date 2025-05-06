package SegundoTrimestre.Objetos_Interfaces.Pokemon;

public class Pokemon {

    protected int ps;
    protected String tipo;
    protected int nivel;
    protected String nombre;
    protected boolean defendiendo;

    // Constructor principal
    public Pokemon(String nombre, String tipo) {
        this.ps = 1000;
        this.nombre = nombre;
        this.nivel = 1;
        this.tipo = tipo;
        this.defendiendo = false;
    }

    // Getters y Setters
    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDefendiendo() {
        return defendiendo;
    }

    public void setDefendiendo(boolean defendiendo) {
        this.defendiendo = defendiendo;
    }

    // Métodos comunes
    public void atacar(Pokemon otro) {
        if (!otro.defendiendo) {
            otro.ps = otro.ps - 100;
        } else {
            otro.ps = otro.ps - 50;
        }
    }

    public void defender(boolean estado) {
        this.defendiendo = estado;
        System.out.println(nombre + (estado ? " está defendiendo." : " ha dejado de defender."));
    }

    @Override
    public String toString() {
        return "Pokemon [Nombre = " + nombre + ", Tipo = " + tipo + ", PS = " + ps + ", Nivel = " + nivel + ", Defendiendo = " + defendiendo + "]";
    }
}
