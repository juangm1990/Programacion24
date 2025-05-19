package SegundoTrimestre.Examenes.BolaExtra_Objetos1;

public class JuegoDigital extends Videojuego {
    protected double tamanoGB;
    protected String plataforma;

    public JuegoDigital(int id, String titulo, double precio, String genero, double tamanoGB, String plataforma) {
        super(id, titulo, precio, genero);
        this.tamanoGB = tamanoGB;
        this.plataforma = plataforma;
    }

    @Override
    public double calcularPrecioFinal() {
        return precio * 0.90; // 10% de descuento
    }

    public double getTamanoGB() {
        return tamanoGB;
    }

    public String getPlataforma() {
        return plataforma;
    }

    @Override
    public String toString() {
        return super.toString() + ", Formato: Digital, Tamaño: " + tamanoGB + " GB, Plataforma: " + plataforma;
    }
}
