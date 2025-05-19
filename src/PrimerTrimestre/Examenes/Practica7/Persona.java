package PrimerTrimestre.Examenes.Practica7;


import java.util.ArrayList;

public abstract class Persona {
    
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected String fechaNac;
    protected double peso;
    protected double altura;
    protected ArrayList<SeleccionFutbol> selecciones;

    // Constructores por Defecto, Parámetros y Copia

    public Persona() {
        this.id = 0;
        this.nombre = null;
        this.apellidos = null;
        this.fechaNac = null;
        this.peso = 0.0;
        this.altura = 0.0;
        this.selecciones = new ArrayList<SeleccionFutbol>();
    }

    public Persona(int i, String n, String ape, String fNac, double p, double a) {
        this.id = i;
        this.nombre = n;
        this.apellidos = ape;
        this.fechaNac = fNac;
        this.peso = p;
        this.altura = a;
        this.selecciones = new ArrayList<SeleccionFutbol>();
    }

    public Persona(Persona copia) {
        this.id = copia.id;
        this.nombre = copia.nombre;
        this.apellidos = copia.apellidos;
        this.fechaNac = copia.fechaNac;
        this.peso = copia.peso;
        this.altura = copia.altura;
        this.selecciones = copia.selecciones;
    }

    // Getters y Setters

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String ape) {
        this.nombre = ape;
    }

    public String getFechaNac() {
        return this.fechaNac;
    }

    public void setFechaNac(String fNac) {
        this.fechaNac = fNac;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double p) {
        this.peso = p;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double a) {
        this.altura = a;
    }

    public ArrayList<SeleccionFutbol> getSelecciones() {
        return this.selecciones;
    }

    public void setIntegrantes(ArrayList<SeleccionFutbol> s) {
        this.selecciones = s;
    }

    // Métodos Personalizados

    public abstract void viajar();

    public abstract boolean asignarSeleccion(SeleccionFutbol s);

    public abstract boolean quitarSeleccion(int id);

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Apellidos: " + apellidos + " | FechaNac: " + fechaNac + " | Peso: " + peso + " | Altura: " + altura;
    }
}
