package SegundoTrimestre.Examenes.BolaExtra_Objetos2;

public abstract class Vehiculo {
    protected String nombre;
    protected double precioPorDia;

    public Vehiculo(String nombre, double precioPorDia) {
        this.nombre = nombre;
        this.precioPorDia = precioPorDia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    // Método abstracto que deben implementar todas las subclases
    public abstract double calcularPrecioAlquiler(int dias);

    @Override
    public String toString() {
        return "Vehiculo: " + nombre + ", Precio por día: " + precioPorDia + " euros";
    }
}
