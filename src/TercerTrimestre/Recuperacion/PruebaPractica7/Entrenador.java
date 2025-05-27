package TercerTrimestre.Recuperacion.PruebaPractica7;

public class Entrenador extends Persona implements Basico {
    private int idFederacion;

    // Constructor por defecto
    public Entrenador() {
        super();
        this.idFederacion = 0;
    }

    // Constructor con parámetros
    public Entrenador(int id, String nombre, String apellido, int edad, double altura, double peso, int idFederacion) {
        super(id, nombre, apellido, edad, altura, peso);
        this.idFederacion = idFederacion;
    }

    // Constructor de copia
    public Entrenador(Entrenador copia) {
        super(copia);
        this.idFederacion = copia.idFederacion;
    }

    // Getter y Setter
    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    // IMC para entrenador (>= 25 se considera sobrepeso)
    public boolean tieneSobrepeso() {
        double imc = peso / (altura * altura);
        return imc >= 25;
    }

    // Implementación de la interfaz Basico
    @Override
    public void comer() {
        System.out.println("Comer del entrenador: " + this.nombre);
    }

    @Override
    public void dormir() {
        System.out.println("Dormir del entrenador: " + this.nombre);
    }

    @Override
    public String toString() {
        return "[ENTRENADOR] " + nombre + " " + apellido + " | Federación: " + idFederacion +
               " | Edad: " + edad + " | Altura: " + altura + " | Peso: " + peso;
    }
}
