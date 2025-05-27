package TercerTrimestre.Recuperacion.PruebaPractica7;

public class Fisioterapeuta extends Persona implements Integrante {
    private int aniosExperiencia;

    // Constructor por defecto
    public Fisioterapeuta() {
        super();
        this.aniosExperiencia = 0;
    }

    // Constructor con parámetros
    public Fisioterapeuta(int id, String nombre, String apellido, int edad, double altura, double peso, int aniosExperiencia) {
        super(id, nombre, apellido, edad, altura, peso);
        this.aniosExperiencia = aniosExperiencia;
    }

    // Constructor de copia
    public Fisioterapeuta(Fisioterapeuta copia) {
        super(copia);
        this.aniosExperiencia = copia.aniosExperiencia;
    }

    // Getter y Setter
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    // Implementación de la interfaz Integrante
    @Override
    public void concentrarse() {
        System.out.println("Concentración del fisioterapeuta: " + this.nombre);
    }

    @Override
    public String toString() {
        return "[FISIOTERAPEUTA] " + nombre + " " + apellido +
               " | Experiencia: " + aniosExperiencia + " años | Edad: " + edad + " | Altura: " + altura + " | Peso: " + peso;
    }
}
