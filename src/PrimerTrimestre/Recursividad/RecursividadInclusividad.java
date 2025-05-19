package PrimerTrimestre.Recursividad;

public class RecursividadInclusividad {
    
        /*
     * m (4) = 11
     *      4 + m (3) = 7
     *          3 + m (3) = 4
     *              2 + m (1) = 2
     *                  1 + m (0) = 1
     */
    
    public static void main(String[] args) {

        // Ejemplo 1
        System.out.println(metodoInfinito(10));

        // Ejemplo 2
        System.out.println(metodoInfinito2(10));

        // Ejemplo 3
        System.out.println(metodoInfinito3(10));

        // Ejemplo 4
        System.out.println(metodoInfinito4(10));

        // Ejemplo 5
    System.out.println(metodoInfinito5(4));

    }

    // Ejemplo 1 - Recursividad infinita
    public static int metodoInfinito(int n) {

        int t = metodoInfinito(n - 1);
        return t;
    }

    // Ejemplo 2 - Recursividad infinita
    public static int metodoInfinito2(int n) {

        int t = metodoInfinito2(n - 1);

        if (n == 0) {
            return 1;
        } else {
            return t;
        }
    }

    // Ejemplo 3 - No tiene recursividad infinita
    public static int metodoInfinito3(int n) {

        if (n == 0) {
            return 1;
        } else {
            int t = metodoInfinito3(n - 1);
            return t;
        }
    }

    // Ejemplo 4 - No tiene recursividad infinita
    public static int metodoInfinito4(int n) {

        if (n == 0) {
            return 1;
        } else {
            int t = metodoInfinito4(n - 1);
            return 1 + t;
        }
    }

    // Ejemplo 5 - No tiene recursividad infinita
    public static int metodoInfinito5(int n) {

        if (n == 0) {
            return 1;
        } else {
            int t = metodoInfinito5(n - 1);
            return n + t;
        }
    }
}
