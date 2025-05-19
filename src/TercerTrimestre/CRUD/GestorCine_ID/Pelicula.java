package TercerTrimestre.CRUD.GestorCine_ID;

public class Pelicula {
    private int id;
    private String titulo;
    private String genero;
    private int duracion;

    public Pelicula() {}

    public Pelicula(int id, String titulo, String genero, int duracion) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

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
        return "Pelicula{" +
               "id=" + id +
               ", titulo='" + titulo + '\'' +
               ", genero='" + genero + '\'' +
               ", duracion=" + duracion +
               '}';
    }
}
