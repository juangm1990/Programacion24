package SegundoTrimestre.Objetos_Interfaces.Hotel;

public class HabitacionDoble extends Habitacion {

    public HabitacionDoble(int numero, double precioPorNoche, boolean disponible) {
        super(numero, precioPorNoche, disponible);
    }

    @Override
    public double calcularPrecioTotal(int noches) {
        // Por ejemplo, la habitación doble tiene un 10% de descuento si son más de 3 noches
        if (noches > 3) {
            return (precioPorNoche * noches) * 0.9;
        }
        return precioPorNoche * noches;
    }

    @Override
    public String toString() {
        return super.toString() + " [Tipo: Doble]";
    }
}
