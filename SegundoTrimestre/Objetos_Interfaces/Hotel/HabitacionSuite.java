package SegundoTrimestre.Objetos_Interfaces.Hotel;

public class HabitacionSuite extends Habitacion implements Reservable {

    public HabitacionSuite(int numero, double precioPorNoche, boolean disponible) {
        super(numero, precioPorNoche, disponible);
    }

    @Override
    public double calcularPrecioTotal(int noches) {
        // Las suites tienen un suplemento del 20%
        return (precioPorNoche * noches) * 1.2;
    }

    @Override
    public void hacerReserva(String nombreCliente, String fechaEntrada, int noches) {
        if (disponible) {
            System.out.println("Reserva realizada para " + nombreCliente + " en la suite N° " + numero +
                               " desde " + fechaEntrada + " por " + noches + " noches.");
            this.disponible = false;
        } else {
            System.out.println("La suite N° " + numero + " no está disponible.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " [Tipo: Suite]";
    }
}
