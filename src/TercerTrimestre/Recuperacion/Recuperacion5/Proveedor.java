package TercerTrimestre.Recuperacion.Recuperacion5;

public class Proveedor {
    private String nombre;
    private String nif;
    private String telefono;

    // Constructor por defecto
    public Proveedor() {
        setNombre("Mercadona");
        setNif("B1234567X");
        setTelefono("000000000000");
    }

    // Constructor por parámetros
    public Proveedor(String nombre, String nif, String telefono) {
        setNombre(nombre);
        setNif(nif);
        setTelefono(telefono);
    }

    // Constructor copia
    public Proveedor(Proveedor copia) {
        setNombre(copia.nombre);
        setNif(copia.nif);
        setTelefono(copia.telefono);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() >= 3 && nombre.length() <= 100) {
            this.nombre = nombre;
        } else {
            this.nombre = "Mercadona";
        }
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        if (nif.length() == 9) {
            this.nif = nif;
        } else {
            this.nif = "B1234567X";
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.length() == 12) {
            this.telefono = telefono;
        } else {
            this.telefono = "+34 000 000 000";
        }
    }

    @Override
    public String toString() {
        return " ||| Proveedor: " + this.nombre + " | NIF: " + this.nif + " | Teléfono: " + this.telefono;
    }
}
