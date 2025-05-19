package TercerTrimestre.CRUD.GestorCine;

public class Pelicula {
    private int id;
    private String titulo;
    private String genero;
    private int duracion;

    // Constructor con ID
    public Pelicula(int id, String titulo, String genero, int duracion) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    // Constructor sin ID (para insertar)
    public Pelicula(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula [ID=" + id + ", Título=" + titulo + ", Género=" + genero + ", Duración=" + duracion + " min]";
    }
}
