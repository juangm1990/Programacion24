package TercerTrimestre.Recuperacion.PruebaPractica7;

import java.util.ArrayList;

public abstract class Persona {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double altura;
    protected double peso;

    protected ArrayList<SeleccionFutbol> selecciones;

    // Constructor por defecto
    public Persona() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.altura = 0;
        this.peso = 0;
        this.selecciones = new ArrayList<>();
    }

    // Constructor con parámetros
    public Persona(int id, String nombre, String apellido, int edad, double altura, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.selecciones = new ArrayList<>();
    }

    // Constructor de copia
    public Persona(Persona copia) {
        this.id = copia.id;
        this.nombre = copia.nombre;
        this.apellido = copia.apellido;
        this.edad = copia.edad;
        this.altura = copia.altura;
        this.peso = copia.peso;
        this.selecciones = new ArrayList<>(copia.selecciones);
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<SeleccionFutbol> getSelecciones() {
        return selecciones;
    }

    public void setSelecciones(ArrayList<SeleccionFutbol> selecciones) {
        this.selecciones = selecciones;
    }

    // Asignar una selección a la persona si no está ya añadida
    public boolean asignarSeleccion(SeleccionFutbol s) {
        if (!selecciones.contains(s)) {
            selecciones.add(s);
            return true;
        }
        return false;
    }

    // Quitar una selección si está
    public boolean quitarSeleccion(SeleccionFutbol s) {
        if (selecciones.contains(s)) {
            selecciones.remove(s);
            return true;
        }
        return false;
    }

    // Método abstracto (obligará a las subclases a implementarlo)
    public abstract String toString();
}
