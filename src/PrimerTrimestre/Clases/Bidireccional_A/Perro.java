package PrimerTrimestre.Clases.Bidireccional_A;

public class Perro {
    
    private String nombre;
    private Persona propietario;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getPropietario() {
        return propietario;
    }
    
    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", propietario=" + propietario + "]";
    }
}
