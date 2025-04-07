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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public abstract double calcularPrecioFinal();


    @Override
    public String toString() {
        return "Videojuego [id=" + id + ", titulo=" + titulo + ", precio=" + precio + ", genero=" + genero + "]";
    }
 
}

