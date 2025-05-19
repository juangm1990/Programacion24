package SegundoTrimestre.Objetos_Interfaces.Mundial;


public abstract class Persona {

    protected String nombre;
    protected int edad;
    protected double altura;
    protected double peso;

    public Persona(String nombre, int edad, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public abstract void mostrar();

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
