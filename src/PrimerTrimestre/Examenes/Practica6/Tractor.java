package PrimerTrimestre.Examenes.Practica6;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Tractor extends Vehiculo {
    
    private double precioDia;
    private LocalDateTime fechaAlquiler;
    private LocalDateTime fechaDevolucion;

    public Tractor(String m, boolean a, double pD, LocalDateTime fA, LocalDateTime fD) {
        super(m, a);
        this.precioDia = pD;
        this.fechaAlquiler = fA;
        this.fechaDevolucion = fD;
    }
    public Tractor() {
        super();
        this.precioDia = 100;
        this.fechaAlquiler = null;
        this.fechaDevolucion = null;
    }

    public Tractor(Tractor copia) {
        super(copia);
        this.precioDia = copia.precioDia;
        this.fechaAlquiler = copia.fechaAlquiler;
        this.fechaDevolucion = copia.fechaDevolucion;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public LocalDateTime getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDateTime fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }
    
    public void setFechaDevolucion(LocalDateTime fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String alquilar() {
        if (!this.alquilado) {
            this.alquilado = true;

            this.fechaAlquiler = LocalDateTime.now();

            return "Ha alquilado el vehículo";
        }
        else {
            return "El vehículo ya se encuentra alquilado";
        }
    }

    @Override
    public String devolver(int x) {

        if (this.alquilado) {
            this.alquilado = false;

            this.fechaDevolucion = LocalDateTime.now();
            this.fechaDevolucion.plusDays(x);

            return "El Vehículo ha sido devuelto. El importe a pagar es de: " + ((int)ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion)) * precioDia;
        }
        else {
            return "El vehículo no está alquilado, no se puede devolver";
        }
    }

    public String obtenerPrecioAlquiler(int dias) {

        return "El coste sería de " + this.precioDia * dias + " euros";
    }

    @Override
    public String toString() {
        return "Tractor [precioDia=" + precioDia + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion="
                + fechaDevolucion + "]";
    }
}
