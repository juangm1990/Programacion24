package TercerTrimestre.CRUD.GestorCine;

public class Sala {
    private int id;
    private String nombre;
    private int capacidad;

    // Constructor con ID (para modificar o mostrar)
    public Sala(int id, String nombre, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    // Constructor sin ID (para insertar)
    public Sala(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    // Getters y setters
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Sala [ID=" + id + ", Nombre=" + nombre + ", Capacidad=" + capacidad + "]";
    }
}
