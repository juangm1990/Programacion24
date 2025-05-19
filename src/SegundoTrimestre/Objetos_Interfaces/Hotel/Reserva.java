package SegundoTrimestre.Objetos_Interfaces.Hotel;


public class Reserva {
    private int id;
    private Cliente cliente;
    private Habitacion habitacion;
    private String fechaEntrada;
    private int noches;

    public Reserva(int id, Cliente cliente, Habitacion habitacion, String fechaEntrada, int noches) {
        this.id = id;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.noches = noches;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public int getNoches() {
        return noches;
    }

    public double getPrecioTotal() {
        return habitacion.calcularPrecioTotal(noches);
    }

    @Override
    public String toString() {
        return "Reserva ID: " + id +
               "\n" + cliente +
               "\n" + habitacion +
               "\nFecha de entrada: " + fechaEntrada +
               "\nNoches: " + noches +
               "\nPrecio total: " + getPrecioTotal();
    }
}
