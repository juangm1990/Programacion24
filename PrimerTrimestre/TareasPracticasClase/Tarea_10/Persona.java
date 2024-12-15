package PrimerTrimestre.TareasPracticasClase.Tarea_10;

abstract class Persona {
    
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected String fechaNac;
    protected double peso;
    protected double altura;

    // Constructor por defecto:
    public Persona() {
        this.id = 0;
        this.nombre = "nombre";
        this.apellidos = "apellidos";
        this.fechaNac = "fechaNac";
        this.peso = 0.0;
        this.altura = 0.0;
    }

    // Constructor por parámetros:
    public Persona(int i, String n, String ap, String f, double p, double al) {
        this.id = i;
        this.nombre = n;
        this.apellidos = ap;
        this.fechaNac = f;
        this.peso = p;
        this.altura = al;
    }

    // Constructor de copia
    public Persona(Persona copia) {
        this.id = copia.id;
        this.nombre = copia.nombre;
        this.apellidos = copia.apellidos;
        this.fechaNac = copia.fechaNac;
        this.peso = copia.peso;
        this.altura = copia.altura;
    }

    // Métodos y funciones
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String ape) {
        this.apellidos = ape;
    }

    public String getFechaNac() {
        return this.fechaNac;
    }

    public void setFechaNac(String fec) {
        this.fechaNac = fec;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double pe) {
        this.peso = pe;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double alt) {
        this.altura = alt;
    }

    public abstract void viajar();

    @Override
    public String toString() {
        return "Persona [Id = " + id + ", Nombre = " + nombre + ", Apellidos = " + apellidos + 
        ", Fecha de Nacimiento = " + fechaNac + ", Peso = " + peso + " y Altura = " + altura + "] ";
    }
}
