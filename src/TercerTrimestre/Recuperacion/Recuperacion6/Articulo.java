package TercerTrimestre.Recuperacion.Recuperacion6;

public class Articulo {
    private String codigo;
    private boolean alquilado;

    // Constructor por defecto
    public Articulo() {
        this.codigo = "";
        this.alquilado = false;
    }

    // Constructor por parámetros
    public Articulo(String codigo, boolean alquilado) {
        this.codigo = codigo;
        this.alquilado = alquilado;
    }

    // Constructor copia
    public Articulo copiaArticulo() {
        return new Articulo(this.codigo, this.alquilado);
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    // toString
    public String toString() {
        return "Código: " + codigo + ", Alquilado: " + alquilado;
    }
}
