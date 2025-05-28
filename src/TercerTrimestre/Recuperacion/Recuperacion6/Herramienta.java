package TercerTrimestre.Recuperacion.Recuperacion6;

public class Herramienta extends Articulo {
    private double precioSemana;
    private int semanasAlquiladas;

    // Constructor por defecto
    public Herramienta() {
        super();
        this.precioSemana = 0.0;
        this.semanasAlquiladas = 0;
    }

    // Constructor por parámetros
    public Herramienta(String codigo, boolean alquilado, double precioSemana, int semanasAlquiladas) {
        super(codigo, alquilado);
        this.precioSemana = precioSemana;
        this.semanasAlquiladas = semanasAlquiladas;
    }

    // Constructor copia
    public Herramienta copiaHerramienta() {
        return new Herramienta(getCodigo(), isAlquilado(), precioSemana, semanasAlquiladas);
    }

    // Getters y Setters
    public double getPrecioSemana() {
        return precioSemana;
    }

    public void setPrecioSemana(double precioSemana) {
        this.precioSemana = precioSemana;
    }

    public int getSemanasAlquiladas() {
        return semanasAlquiladas;
    }

    public void setSemanasAlquiladas(int semanasAlquiladas) {
        this.semanasAlquiladas = semanasAlquiladas;
    }

    // toString
    public String toString() {
        return super.toString() + ", Precio por semana: " + precioSemana +
               ", Semanas alquiladas: " + semanasAlquiladas;
    }
}
