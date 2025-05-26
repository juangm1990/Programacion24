package TercerTrimestre.Recuperacion.MenuOpciones.Normal;

public class Persona {
    protected int id;
    protected String nombre;
    protected String apellidos;

    public Persona() {
        this.id = 0;
        this.nombre = "";
        this.apellidos = "";
    }

    public Persona(int id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona(Persona copia) {
        this.id = copia.id;
        this.nombre = copia.nombre;
        this.apellidos = copia.apellidos;
    }

        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

        @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
    }



}
