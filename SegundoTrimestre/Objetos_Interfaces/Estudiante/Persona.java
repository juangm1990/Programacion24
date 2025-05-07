package SegundoTrimestre.Objetos_Interfaces.Estudiante;

public abstract class Persona {
    protected int id;
    protected String nombre;
    protected String email;

    public Persona(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void mostrar();
}
