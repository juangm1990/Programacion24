package SegundoTrimestre.Examenes.BolaExtra_Objetos3;

public abstract class Personaje {
    protected int id;
    protected String nombre;
    protected int nivel;
    protected String rol;

    public Personaje(int id, String nombre, int nivel, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public String getRol() {
        return rol;
    }

    public abstract int calcularPoder();

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Nivel: " + nivel + ", Rol: " + rol;
    }
}
