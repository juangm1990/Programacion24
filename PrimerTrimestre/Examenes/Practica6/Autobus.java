package PrimerTrimestre.Examenes.Practica6;

public class Autobus extends Vehiculo {
    
    private double precioKm;
    private double cantidadKmAlquilar;
    private double cantidadKmDevolver;

    public Autobus(String m, boolean a, double pK, double cKA, double cKD) {
        super(m, a);
        this.precioKm = pK;
        this.cantidadKmAlquilar = cKA;
        this.cantidadKmDevolver = cKD;
    }

    public Autobus() {
        super();
        this.precioKm = 1;
        this.cantidadKmAlquilar = 1000;
        this.cantidadKmDevolver = 1000;
    }

    public Autobus(Autobus copia) {
        super(copia);
        this.precioKm = copia.precioKm;
        this.cantidadKmAlquilar = copia.cantidadKmAlquilar;
        this.cantidadKmDevolver = copia.cantidadKmDevolver;
    }

    public double getPrecioKm() {
        return precioKm;
    }

    public void setPrecioKm(double pK) {
        this.precioKm = pK;
    }

    public double getCantidadKmAlquilar() {
        return cantidadKmAlquilar;
    }

    public void setCantidadKmAlquilar(double cKA) {
        this.cantidadKmAlquilar = cKA;
    }

    public double getCantidadKmDevolver() {
        return cantidadKmDevolver;
    }

    public void setCantidadKmDevolver(double cKD) {
        this.cantidadKmDevolver = cKD;
    }

    @Override
    public String alquilar() {
        if (!this.alquilado) {
            this.alquilado = true;

            this.cantidadKmAlquilar = this.cantidadKmDevolver;

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

            this.cantidadKmDevolver += x;

            return "El Vehículo ha sido devuelto. El importe a pagar es de: " + this.precioKm * (cantidadKmDevolver - cantidadKmAlquilar);
        }
        else {
            return "El vehículo no está alquilado, no se puede devolver";
        }
    }

    public String obtenerPrecioAlquiler(double km) {

        return "El coste sería de " + this.precioKm *  km + " euros";
    }

    @Override
    public String toString() {
        return "Autobus [precioKm=" + precioKm + ", cantidadKmAlquilar=" + cantidadKmAlquilar + ", cantidadKmDevolver="
                + cantidadKmDevolver + "]";
    }
}

