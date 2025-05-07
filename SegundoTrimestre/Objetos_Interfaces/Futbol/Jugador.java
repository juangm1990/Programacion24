package SegundoTrimestre.Objetos_Interfaces.Futbol;

public abstract class Jugador {

    protected String nombre;
    protected int numeroCamiseta;
    protected String posicion;

    public Jugador(String nombre, int numeroCamiseta, String posicion) {
        this.nombre = nombre;
        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
    }

    public Jugador() {
        this.nombre = "Juan";
        this.numeroCamiseta = 0;
        this.posicion = "Delantero";
    }

    public Jugador(Jugador copia) {
        this.nombre = copia.nombre;
        this.numeroCamiseta = copia.numeroCamiseta;
        this.posicion = copia.posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public abstract void accionEspecial();

    public String mostrarInfo() {
        return this.getNombre() + this.getPosicion() + this.getNumeroCamiseta();
    }

    @Override
    public String toString() {
        return "Jugador [Nombre = " + nombre + ", Número de Camiseta = " + numeroCamiseta + " y Posición = " + posicion + "]";
    }
}
