package TercerTrimestre.Recuperacion.Recuperacion5;

public class App {
    public static void main(String[] args) throws Exception {

        // Crear proveedores
        Proveedor p1 = new Proveedor("Mercadona", "B1234567X", "678945632123");
        Proveedor p2 = new Proveedor("Corte Inglés", "C8765432Z", "659874123654");
        Proveedor p3 = new Proveedor();

        // Crear productos
        Producto c1 = new Producto("Manzana", "8412345678901", 3.3, p1);
        Producto c2 = new Producto("Melón", "8422222222222", 6.6, p2);
        Producto c3 = new Producto();

        System.out.println(c1);
        System.out.println("------------------------------------------------");

        System.out.println(c2);
        System.out.println("------------------------------------------------");

        // Modificaciones válidas
        c1.setNombre("Cerezas");
        c1.setPrecioUnitario(33.0);

        p1.setTelefono("611222333444");
        p1.setNombre("Lidl");

        System.out.println(c1);
        System.out.println("------------------------------------------------");

        // Modificaciones válida / inválida
        c3.setPrecioUnitario(10);      
        c3.setPrecioUnitario(-1);      

        p3.setTelefono("123456");          
        p3.setTelefono("678901234567");   

        p3.setNombre("Melocotón"); 
        p3.setNombre("Error");                

        System.out.println(c3);
        System.out.println("------------------------------------------------");

        // Mostrar precio
        System.out.println(c1.getPrecioUnitario() + " euros");
    }
}
