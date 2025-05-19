package SegundoTrimestre.TareasPracticas.Tema12_FicherosTexto;


public class Persona {

    private String nombre;
    private String apellido;

    // CONSTRUCTOR POR DEFECTO
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellido = apellidos;
    }

    // CONSTRUCTOR POR PARÁMETROS
    public Persona() {
        this.nombre = null;
        this.apellido = null;
    }

    // CONSTRUCTOR DE COPIA
    public Persona(Persona copia) {
        this.nombre = copia.nombre;
        this.apellido = copia.apellido;
    }

    // MÉTODOS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apell) {
        this.apellido = apell;
    }

    @Override
    public String toString() {
        return "Nombre de la persona = " + nombre + " || Primer apellido = " + apellido  + "\n";
    }

}