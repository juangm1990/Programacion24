package PrimerTrimestre.Examenes.BolaExtra6;

public class Autobus extends Vehiculo {
    
    private int numPlazas; // Número de plazas disponibles en el autobús

    // Constructor por defecto
    public Autobus() {
        super(); // Llama al constructor por defecto de Vehiculo
        this.numPlazas = 0;
    }

    // Constructor por parámetros
    public Autobus(String matricula, String modelo, int potencia, int numPlazas) {
        super(); // Llama al constructor de Vehiculo
        this.numPlazas = numPlazas;
    }

    // Constructor de copia
    public Autobus(Autobus otro) {
        super(); // Llama al constructor de copia de Vehiculo
        this.numPlazas = otro.numPlazas;
    }

    // Métodos de acceso (getters y setters)
    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    // Implementación del método entradaVehiculo()
    @Override
    public boolean entradaVehiculo() {
        if (getNumVehiculos() < MAXVEHICULOS) {
            setNumVehiculos(getNumVehiculos() + 1);
            System.out.println("Autobús ingresado correctamente.");
            return true;
        }
        System.out.println("No se puede ingresar más autobuses. Límite alcanzado.");
        return false;
    }

    // Implementación del método salidaVehiculo()
    @Override
    public boolean salidaVehiculo() {
        if (getNumVehiculos() > 0) {
            setNumVehiculos(getNumVehiculos() - 1);
            System.out.println("Autobús salido correctamente.");
            return true;
        }
        System.out.println("No hay autobuses registrados.");
        return false;
    }
}
