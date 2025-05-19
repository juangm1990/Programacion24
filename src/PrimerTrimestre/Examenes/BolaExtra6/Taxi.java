package PrimerTrimestre.Examenes.BolaExtra6;


public class Taxi extends Vehiculo {
    
    private int numLicencia; // Número de licencia del taxi

    // Constructor por defecto
    public Taxi() {
        super(); // Llama al constructor por defecto de Vehiculo
        this.numLicencia = 0;
    }

    // Constructor por parámetros
    public Taxi(String matricula, String modelo, int potencia, int numLicencia) {
        super(matricula, modelo, potencia); // Llama al constructor de Vehiculo
        this.numLicencia = numLicencia;
    }

    // Constructor de copia
    public Taxi(Taxi otro) {
        super(); // Llama al constructor de copia de Vehiculo
        this.numLicencia = otro.numLicencia;
    }

    // Métodos de acceso (getters y setters)
    public int getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }

    // Implementación del método entradaVehiculo()
    @Override
    public boolean entradaVehiculo() {
        if (getNumVehiculos() < MAXVEHICULOS) {
            setNumVehiculos(getNumVehiculos() + 1);
            System.out.println("Taxi ingresado correctamente.");
            return true;
        }
        System.out.println("No se puede ingresar más taxis. Límite alcanzado.");
        return false;
    }

    // Implementación del método salidaVehiculo()
    @Override
    public boolean salidaVehiculo() {
        if (getNumVehiculos() > 0) {
            setNumVehiculos(getNumVehiculos() - 1);
            System.out.println("Taxi salido correctamente.");
            return true;
        }
        System.out.println("No hay taxis registrados.");
        return false;
    }
}
