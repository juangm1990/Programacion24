package PrimerTrimestre.Array.ArrayBidimensionales;

import java.util.Scanner;

public class Matriz {
    
     public static void main(String[] args) throws Exception {
    
        /* 
         * Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array de 4 filas.
         * por 5 columnas. El programa mostrará las sumas de filas y columnas igual que si de una hoja de cálculo se tratara.
         */

        Scanner input = new Scanner(System.in);

        int[][] numeros = new int[4][5];
        int[] filas = new int[4];
        int[] columnas = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = input.nextInt();
                filas[i] += numeros[i][j];
            }
        }

        for (int i = 0; i < columnas.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                columnas[i] += numeros[j][i];
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("= " + filas[i]);
        }

        System.out.println("--------------");
        
        for (int i = 0; i < columnas.length; i++) {
            System.out.print(columnas[i] + " ");
        }

        input.close();
    }
}
