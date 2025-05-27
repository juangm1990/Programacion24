package TercerTrimestre.Recuperacion.PruebaPractica7;

public class Futbolista extends Persona implements Deportista {
    private int dorsal;
    private String demarcacion;

    // Constructor por defecto
    public Futbolista() {
        super(); // Llama al constructor de Persona
        this.dorsal = 0;
        this.demarcacion = "";
    }

    // Constructor con parámetros
    public Futbolista(int id, String nombre, String apellido, int edad, double altura, double peso, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad, altura, peso);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    // Constructor de copia
    public Futbolista(Futbolista copia) {
        super(copia);
        this.dorsal = copia.dorsal;
        this.demarcacion = copia.demarcacion;
    }

    // Getters y Setters
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    // Implementación de la interfaz Deportista
    @Override
    public void entrenar() {
        System.out.println("Entrenando: " + this.nombre);
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugando partido: " + this.nombre);
    }

    // Método para saber si tiene sobrepeso (IMC >= 22)
    public boolean tieneSobrepeso() {
        double imc = peso / (altura * altura);
        return imc >= 22;
    }

    @Override
    public String toString() {
        return "[FUTBOLISTA] " + nombre + " " + apellido + " | Dorsal: " + dorsal +
               " | Demarcación: " + demarcacion + " | Edad: " + edad + " | Altura: " + altura + " | Peso: " + peso;
    }
}
