package TercerTrimestre.Recuperacion.PruebaPractica6A;

public class Autobus extends Vehiculo {
    private double precioKilometro;
    private double kmInicio;
    private double kmFinal;

    // Constructor por defecto
    public Autobus() {
        super();
        this.precioKilometro = 0;
        this.kmInicio = 0;
        this.kmFinal = 0;
    }

    // Constructor con parámetros
    public Autobus(String matricula, double precioKilometro) {
        super(matricula, false);
        this.precioKilometro = precioKilometro;
        this.kmInicio = 0;
        this.kmFinal = 0;
    }

    // Constructor de copia
    public Autobus(Autobus copia) {
        super(copia);
        this.precioKilometro = copia.precioKilometro;
        this.kmInicio = copia.kmInicio;
        this.kmFinal = copia.kmFinal;
    }

    // Getter y Setter de precioKilometro
    public double getPrecioKilometro() {
        return precioKilometro;
    }

    public void setPrecioKilometro(double precioKilometro) {
        this.precioKilometro = precioKilometro;
    }

    // Getter y Setter de kmInicio
    public double getKmInicio() {
        return kmInicio;
    }

    public void setKmInicio(double kmInicio) {
        this.kmInicio = kmInicio;
    }

    // Getter y Setter de kmFinal
    public double getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(double kmFinal) {
        this.kmFinal = kmFinal;
    }

    // Método alquilar
    public void alquilar(double kmInicio) {
        if (!alquilado) {
            this.kmInicio = kmInicio;
            this.alquilado = true;
        } else {
            System.out.println("El autobús ya está alquilado.");
        }
    }

    // Método devolver
    public double devolver(double kmFinal) {
        if (alquilado) {
            this.kmFinal = kmFinal;
            this.alquilado = false;
            return (kmFinal - kmInicio) * precioKilometro;
        } else {
            System.out.println("El autobús no estaba alquilado.");
            return 0;
        }
    }

    // toString
    public String toString() {
        return super.toString() + ", Precio/km: " + precioKilometro;
    }
}


