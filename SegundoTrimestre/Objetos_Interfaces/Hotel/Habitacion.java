package SegundoTrimestre.Objetos_Interfaces.Hotel;

public abstract class Habitacion {
    protected int numero;
    protected double precioPorNoche;
    protected boolean disponible;

    public Habitacion(int numero, double precioPorNoche, boolean disponible) {
        this.numero = numero;
        this.precioPorNoche = precioPorNoche;
        this.disponible = disponible;
    }

    public abstract double calcularPrecioTotal(int noches);

    public int getNumero() {
        return numero;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Habitación N°: " + numero + ", Precio por noche: " + precioPorNoche +
               ", Disponible: " + (disponible ? "Sí" : "No");
    }
}
