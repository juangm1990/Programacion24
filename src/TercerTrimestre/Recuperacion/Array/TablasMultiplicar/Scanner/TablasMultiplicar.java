package TercerTrimestre.Recuperacion.Array.TablasMultiplicar.Scanner;

import java.util.Scanner;

public class TablasMultiplicar {
    
     public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        // Pedimos al usuario cuántas tablas quiere mostrar
        System.out.print("¿Cuántas tablas de multiplicar quieres ver? ");
        int cantidad = input.nextInt();

        // Creamos el array con esa cantidad
        int[] tablas = new int[cantidad];

        // Pedimos los números uno por uno
        System.out.println("Introduce los números para las tablas:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Tabla del número " + (i + 1) + ": ");
            tablas[i] = input.nextInt();
        }

        // Mostramos las tablas
        System.out.println("TABLAS DE MULTIPLICAR");
        for (int i = 0; i < tablas.length; i++) {
            System.out.println("Tabla del " + tablas[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(tablas[i] + " x " + j + " = " + (tablas[i] * j));
            }
            System.out.println(); // salto de línea
        }

        input.close();
    }
}
