package TercerTrimestre.Recuperacion.PruebaPractica5A;

public class Empleado {

    private String nombre;
    private String apellidos;
    private String telefono;
    private Contrato contrato;

    // Constructor por parámetros
    public Empleado(String nombre, String apellidos, String telefono, Contrato contrato) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.contrato = contrato;

        this.validarNombreCrear();
        this.validarApellidosCrear();
        this.validarTelefonoCrear();
    }

    // Constructor por defecto
    public Empleado() {
        this.nombre = "Nombre";
        this.apellidos = "Apellidos";
        this.telefono = "+34000000000";
        this.contrato = new Contrato(); // usamos constructor por defecto de Contrato
    }

    // Constructor de copia
    public Empleado(Empleado copia) {
        this.nombre = copia.nombre;
        this.apellidos = copia.apellidos;
        this.telefono = copia.telefono;
        this.contrato = new Contrato(copia.contrato); // copia profunda
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (validarNombreActualizar(nombre)) {
            this.nombre = nombre;
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        if (validarApellidosActualizar(apellidos)) {
            this.apellidos = apellidos;
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (validarTelefonoActualizar(telefono)) {
            this.telefono = telefono;
        }
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    // ----------- VALIDACIONES CREACIÓN ---------------

    public void validarNombreCrear() {
        if (this.nombre.length() < 3 || this.nombre.length() > 20) {
            this.nombre = "Nombre";
        }
    }

    public void validarApellidosCrear() {
        if (this.apellidos.length() < 3 || this.apellidos.length() > 60) {
            this.apellidos = "Apellidos";
        }
    }

    public void validarTelefonoCrear() {
        if (!this.telefono.startsWith("+34") || this.telefono.length() != 12) {
            this.telefono = "+34000000000";
        }
    }

    // ----------- VALIDACIONES ACTUALIZACIÓN (solo devuelven booleano) ------------

    public boolean validarNombreActualizar(String nuevoNombre) {
        return nuevoNombre.length() >= 3 && nuevoNombre.length() <= 20;
    }

    public boolean validarApellidosActualizar(String nuevosApellidos) {
        return nuevosApellidos.length() >= 3 && nuevosApellidos.length() <= 60;
    }

    public boolean validarTelefonoActualizar(String nuevoTelefono) {
        return nuevoTelefono.startsWith("+34") && nuevoTelefono.length() == 12;
    }

    // toString para mostrar la información del empleado
    @Override
    public String toString() {
        return "Empleado --> Nombre: " + this.nombre + ", Apellidos: " + this.apellidos + ", Teléfono: " + this.telefono + " " + contrato.toString();
    }
}
