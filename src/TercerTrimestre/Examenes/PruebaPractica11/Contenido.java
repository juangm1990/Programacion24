package TercerTrimestre.Examenes.PruebaPractica11;

public class Contenido {

    private int id;
    private String titulo;
    private String tipo;
    private String genero;
    private int duracion;
    private int estreno;
    private double valoracion;

    // Constructor con ID (para actualizar)
    public Contenido(int id, String titulo, String tipo, String genero, int duracion, int estreno, double valoracion) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.genero = genero;
        this.duracion = duracion;
        this.estreno = estreno;
        this.valoracion = valoracion;
    }

    // Constructor sin ID (para insertar)
    public Contenido(String titulo, String tipo, String genero, int duracion, int estreno, double valoracion) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.genero = genero;
        this.duracion = duracion;
        this.estreno = estreno;
        this.valoracion = valoracion;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEstreno() {
        return estreno;
    }

    public double getValoracion() {
        return valoracion;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    // toString
    @Override
    public String toString() {
        return "Contenido [ID=" + id +
               ", Título=" + titulo +
               ", Tipo=" + tipo +
               ", Género=" + genero +
               ", Duración=" + duracion + " min" +
               ", Estreno=" + estreno +
               ", Valoración=" + valoracion + "]";
    }
}
