package TercerTrimestre.Recuperacion.Recuperacion5;

public class Producto {
    private String nombre;
    private String codigoBarras;
    private double precioUnitario;
    private Proveedor proveedor;

    // Constructor por defecto
    public Producto() {
        setNombre("Manzana");
        setCodigoBarras("8412345678901");
        setPrecioUnitario(3.30);
        this.proveedor = new Proveedor();
    }

    // Constructor con parámetros
    public Producto(String nombre, String codigoBarras, double precioUnitario, Proveedor proveedor) {
        setNombre(nombre);
        setCodigoBarras(codigoBarras);
        setPrecioUnitario(precioUnitario);
        this.proveedor = proveedor;
    }

    // Constructor copia
    public Producto(Producto otro) {
        setNombre(otro.nombre);
        setCodigoBarras(otro.codigoBarras);
        setPrecioUnitario(otro.precioUnitario);
        this.proveedor = new Proveedor(otro.proveedor);
    }

    // Getters y Setters con validaciones básicas
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() >= 5 && nombre.length() <= 50) {
            this.nombre = nombre;
        } else {
            this.nombre = "Manzana";
        }
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        if (codigoBarras.length() == 13) {
            this.codigoBarras = codigoBarras;
        } else {
            this.codigoBarras = "8412345678901";
        }
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
        } else {
            this.precioUnitario = 3.30;
        }
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Código de barras: " + codigoBarras + " | Precio: " + precioUnitario + " euros" + proveedor.toString();
    }
}
