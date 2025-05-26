package TercerTrimestre.Recuperacion.PruebaPractica6;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Tractor extends Vehiculo {
    private double precioDia;
    private LocalDateTime fechaAlquiler;
    private LocalDateTime fechaDevolucion;

    // Constructor por defecto
    public Tractor() {
        super();
        this.precioDia = 0;
    }

    // Constructor con parámetros
    public Tractor(String matricula, double precioDia) {
        super(matricula, false);
        this.precioDia = precioDia;
    }

    // Constructor de copia
    public Tractor(Tractor copia) {
        super(copia);
        this.precioDia = copia.precioDia;
        this.fechaAlquiler = copia.fechaAlquiler;
        this.fechaDevolucion = copia.fechaDevolucion;
    }

    // Getter y Setter de precioDia
    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    // Método alquilar
    public void alquilar() {
        if (!alquilado) {
            this.fechaAlquiler = LocalDateTime.now();
            this.alquilado = true;
        } else {
            System.out.println("El tractor ya está alquilado.");
        }
    }

    // Método devolver
    public double devolver() {
        if (alquilado) {
            this.fechaDevolucion = LocalDateTime.now();
            this.alquilado = false;
            long dias = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
            return dias * precioDia;
        } else {
            System.out.println("El tractor no estaba alquilado.");
            return 0;
        }
    }

    // toString
    public String toString() {
        return super.toString() + ", Precio/día: " + precioDia;
    }
}
