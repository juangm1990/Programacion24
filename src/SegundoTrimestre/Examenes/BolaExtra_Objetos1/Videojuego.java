package SegundoTrimestre.Examenes.BolaExtra_Objetos1;

public abstract class Videojuego {
    protected int id;
    protected String titulo;
    protected double precio;
    protected String genero;

    public Videojuego(int id, String titulo, double precio, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.genero = genero;
    }

    public abstract double calcularPrecioFinal();

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Precio base: " + precio + ", Género: " + genero;
    }
}
