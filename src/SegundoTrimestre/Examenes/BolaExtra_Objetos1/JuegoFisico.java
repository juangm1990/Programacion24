package SegundoTrimestre.Examenes.BolaExtra_Objetos1;

public class JuegoFisico extends Videojuego {
    private double gastosEnvio;

    public JuegoFisico(int id, String titulo, double precio, String genero, double gastosEnvio) {
        super(id, titulo, precio, genero);
        this.gastosEnvio = gastosEnvio;
    }

    @Override
    public double calcularPrecioFinal() {
        return precio + gastosEnvio;
    }

    public double getGastosEnvio() {
        return gastosEnvio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Formato: Físico, Gastos de envío: " + gastosEnvio;
    }
}
