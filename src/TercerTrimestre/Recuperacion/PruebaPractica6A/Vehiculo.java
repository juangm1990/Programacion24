package TercerTrimestre.Recuperacion.PruebaPractica6A;

public class Vehiculo {
    protected String matricula;
    protected boolean alquilado;

    // Constructor por defecto
    public Vehiculo() {
        this.matricula = "";
        this.alquilado = false;
    }

    // Constructor con parámetros
    public Vehiculo(String matricula, boolean alquilado) {
        this.matricula = matricula;
        this.alquilado = alquilado;
    }

    // Constructor de copia
    public Vehiculo(Vehiculo copia) {
        this.matricula = copia.matricula;
        this.alquilado = copia.alquilado;
    }

    // Getter y Setter de matricula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Getter y Setter de alquilado
    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    // toString
    public String toString() {
        return "Matrícula: " + matricula + ", Alquilado: " + alquilado;
    }
}
