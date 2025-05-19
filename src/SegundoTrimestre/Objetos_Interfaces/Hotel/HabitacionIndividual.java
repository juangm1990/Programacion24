package SegundoTrimestre.Objetos_Interfaces.Hotel;

public class HabitacionIndividual extends Habitacion {

    public HabitacionIndividual(int numero, double precioPorNoche, boolean disponible) {
        super(numero, precioPorNoche, disponible);
    }

    @Override
    public double calcularPrecioTotal(int noches) {
        return precioPorNoche * noches;
    }

    @Override
    public String toString() {
        return super.toString() + " [Tipo: Individual]";
    }
}
