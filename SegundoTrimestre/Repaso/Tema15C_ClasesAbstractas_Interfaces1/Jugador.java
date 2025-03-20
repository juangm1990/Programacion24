package SegundoTrimestre.Repaso.Tema15C_ClasesAbstractas_Interfaces1;

public abstract class Jugador {

    protected String nombre;
    protected int numeroCamiseta;
    protected String posicion;

    // Constructor por parametros
    public Jugador(String nombre, int numeroCamiseta, String posicion) {
        this.nombre = nombre;
        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
    }

    // Constructor por defecto
    public Jugador() {
        this.nombre = "Juan";
        this.numeroCamiseta = 0;
        this.posicion = "delantero";
    }

    // Constructor por parametros
    public Jugador(Jugador copia) {
        this.nombre = copia.nombre;
        this.numeroCamiseta = copia.numeroCamiseta;
        this.posicion = copia.posicion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    //MÉTODOS PERSONALIZADOS ABSTRACTO

    public abstract void accionEspecial();

    public String mostrarInfo (){
        return this.getNombre() + this.getPosicion() + this.getNumeroCamiseta();
    }


    @Override
    public String toString() {
        return "Jugador [Nombre = " + nombre + ", Número de Camiseta = " + numeroCamiseta + " y Posición = " + posicion + "]";
    }
}
