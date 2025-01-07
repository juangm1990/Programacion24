package PrimerTrimestre.Examenes.BolaExtra6;

public class Camion extends Vehiculo{
    

    private double tara; // Peso del camión vacío (kg)
    private double carga; // Peso de la carga (kg)

    // Constructor por defecto
    public Camion() {
        super(); // Llama al constructor por defecto de Vehiculo
        this.tara = 0.0;
        this.carga = 0.0;
    }

    // Constructor por parámetros
    public Camion(String matricula, String modelo, int potencia, double tara, double carga) {
        super(matricula, modelo, potencia); // Llama al constructor de Vehiculo
        this.tara = tara;
        this.carga = carga;
    }

    // Constructor de copia
    public Camion(Camion otro) {
        super(otro); // Llama al constructor de copia de Vehiculo
        this.tara = otro.tara;
        this.carga = otro.carga;
    }

    // Método para calcular la masa máxima autorizada (MMA)
    public double calcularMMA() {
        return tara + carga;
    }

    // Métodos de acceso (getters y setters)
    public double getTara() {
        return tara;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    // Implementación del método entradaVehiculo()
    @Override
    public boolean entradaVehiculo() {
        if (getNumVehiculos() < MAXVEHICULOS) {
            setNumVehiculos(getNumVehiculos() + 1);
            System.out.println("Camión ingresado correctamente.");
            return true;
        }
        System.out.println("No se puede ingresar más camiones. Límite alcanzado.");
        return false;
    }

    // Implementación del método salidaVehiculo()
    @Override
    public boolean salidaVehiculo() {
        if (getNumVehiculos() > 0) {
            setNumVehiculos(getNumVehiculos() - 1);
            System.out.println("Camión salido correctamente.");
            return true;
        }
        System.out.println("No hay camiones registrados.");
        return false;
    }
}
