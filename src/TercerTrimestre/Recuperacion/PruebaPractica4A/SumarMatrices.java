package TercerTrimestre.Recuperacion.PruebaPractica4A;

import java.util.Scanner;

public class SumarMatrices {


    // Implementa un programa que permita realizar la suma sobre dos matrices de NxN. Se debe mostrar por pantalla la primera matriz,
    //  la segunda matriz y la tercera matriz resultado de la suma de ambas 

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tamaño N de las matrices NxN: ");
        int n = sc.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] S = new int[n][n];

        // Llenar la primera matriz A
        System.out.println("Introduce los valores de la primera matriz A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        // Llenar la segunda matriz B
        System.out.println("Introduce los valores de la segunda matriz B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }

        // Calcular la suma S = A + B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                S[i][j] = A[i][j] + B[i][j];
            }
        }

        // Mostrar matrices
        System.out.println("\nMatriz A:");
        mostrarMatriz(A);

        System.out.println("\nMatriz B:");
        mostrarMatriz(B);

        System.out.println("\nMatriz Suma (A + B):");
        mostrarMatriz(S);
    }

    // Método para mostrar una matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    
}
