package TercerTrimestre.Recuperacion.Recuperacion6;

public class Maquina extends Articulo {
    private double precioHora;
    private int kmInicio;
    private int kmFin;

    // Constructor por defecto
    public Maquina() {
        super();
        this.precioHora = 0.0;
        this.kmInicio = 0;
        this.kmFin = 0;
    }

    // Constructor por parámetros
    public Maquina(String codigo, boolean alquilado, double precioHora, int kmInicio, int kmFin) {
        super(codigo, alquilado);
        this.precioHora = precioHora;
        this.kmInicio = kmInicio;
        this.kmFin = kmFin;
    }

    // Constructor copia
    public Maquina copiaMaquina() {
        return new Maquina(getCodigo(), isAlquilado(), precioHora, kmInicio, kmFin);
    }

    // Getters y Setters
    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public int getKmInicio() {
        return kmInicio;
    }

    public void setKmInicio(int kmInicio) {
        this.kmInicio = kmInicio;
    }

    public int getKmFin() {
        return kmFin;
    }

    public void setKmFin(int kmFin) {
        this.kmFin = kmFin;
    }

    // toString
    public String toString() {
        return super.toString() + ", Precio por hora: " + precioHora + 
               ", Km inicio: " + kmInicio + 
               ", Km fin: " + kmFin;
    }
}
