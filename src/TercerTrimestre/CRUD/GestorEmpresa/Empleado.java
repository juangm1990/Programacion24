package TercerTrimestre.CRUD.GestorEmpresa;

public class Empleado {
    private int id;
    private String nombre;
    private String apellidos;
    private String puesto;
    private double salario;

    // Constructor con ID (lectura/modificación)
    public Empleado(int id, String nombre, String apellidos, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
        this.salario = salario;
    }

    // Constructor sin ID (registro nuevo)
    public Empleado(String nombre, String apellidos, String puesto, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
        this.salario = salario;
    }

    // Getters y setters
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre + ", Apellidos=" + apellidos +
               ", Puesto=" + puesto + ", Salario=" + salario + "]";
    }
}
