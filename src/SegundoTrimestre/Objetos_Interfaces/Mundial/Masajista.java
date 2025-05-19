package SegundoTrimestre.Objetos_Interfaces.Mundial;

public abstract class Masajista extends Persona {

    protected int experiencia;

    public Masajista(String nombre, int edad, double altura, double peso, int experiencia) {
        super(nombre, edad, altura, peso);
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public abstract void darMasaje();
}
