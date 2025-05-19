package TercerTrimestre.CRUD.GestorBiblioteca_ID;

public class Libro {

    private int id;
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String genero;
    private boolean disponible;

    public Libro() {
    }

    public Libro(int id, String titulo, String autor, int añoPublicacion, String genero, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.genero = genero;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                ", genero='" + genero + '\'' +
                ", disponible=" + (disponible ? "Sí" : "No") +
                '}';
    }
}
