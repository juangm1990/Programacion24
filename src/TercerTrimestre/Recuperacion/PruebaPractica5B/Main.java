package TercerTrimestre.Recuperacion.PruebaPractica5B;

public class Main {
    public static void main(String[] args) {
        // Contraseña creada con el constructor por defecto
        Password p1 = new Password();
        System.out.println("Constructor por defecto:");
        System.out.println(p1);
        System.out.println();

        // Contraseña creada con el constructor con parámetro fuerte
        Password p2 = new Password("Aa1._xyz");
        System.out.println("Constructor con parámetro fuerte:");
        System.out.println(p2);
        System.out.println();

        // Contraseña creada con parámetro débil (usa la por defecto)
        Password p3 = new Password("abc");
        System.out.println("Constructor con parámetro débil:");
        System.out.println(p3);
        System.out.println();

        // Contraseña creada por copia
        Password p4 = new Password(p2);
        System.out.println("Constructor de copia:");
        System.out.println(p4);
        System.out.println();

        // Probamos setContrasena con una contraseña débil
        boolean cambiado = p1.setContrasena("1234");
        System.out.println("¿Cambio a contraseña débil?: " + cambiado);
        System.out.println(p1);
        System.out.println();

        // Probamos setContrasena con una contraseña fuerte
        cambiado = p1.setContrasena("Contraseña fuerte");
        System.out.println("¿Cambio a contraseña fuerte?: " + cambiado);
        System.out.println(p1);
    }
}
