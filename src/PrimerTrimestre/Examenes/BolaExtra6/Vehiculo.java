package PrimerTrimestre.Examenes.BolaExtra6;


public class Vehiculo {
    
    private String matricula;
    private String modelo;
    private int potencia;
    protected static final int MAXVEHICULOS = 100; // Máximo número de vehículos
    private static int numVehiculos = 0; // Número de vehículos registrados

    // Constructor por defecto
    public Vehiculo() {
        this.matricula = "Desconocida";
        this.modelo = "Desconocido";
        this.potencia = 0;
    }

    // Constructor por parámetros
    public Vehiculo(String matricula, String modelo, int potencia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    // Constructor de copia
    public Vehiculo(Vehiculo otro) {
        this.matricula = otro.matricula;
        this.modelo = otro.modelo;
        this.potencia = otro.potencia;
    }

    // Métodos
    public boolean entradaVehiculo() {
        if (numVehiculos < MAXVEHICULOS) {
            numVehiculos++;
            return true;
        }
        return false;
    }

    public boolean salidaVehiculo() {
        if (numVehiculos > 0) {
            numVehiculos--;
            return true;
        }
        return false;
    }

    public int obtenerNumVehiculos() {
        return numVehiculos;
    }

    // Métodos de acceso (getters y setters)
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public static int getNumVehiculos() {
        return numVehiculos;
    }

    public static void setNumVehiculos(int numVehiculos) {
        Vehiculo.numVehiculos = numVehiculos;
    }
}
