package TercerTrimestre.Recuperacion.Recuperacion4;

import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el tamaño de la matriz cuadrada (por ejemplo, 3 para 3x3): ");
        int tamano = teclado.nextInt();

        double[][] matriz1 = new double[tamano][tamano];
        double[][] matriz2 = new double[tamano][tamano];
        double[][] resultado = new double[tamano][tamano];

        // Introducir valores de la primera matriz
        System.out.println("\nIntroduce los valores de la PRIMERA MATRIZ:");
        for (int i = 0; i < tamano; i++) {  // i = fila
            for (int j = 0; j < tamano; j++) {  // j = columna
                System.out.print("Fila " + i + ", Columna " + j + ": ");
                matriz1[i][j] = teclado.nextDouble();
            }
        }

        // Introducir valores de la segunda matriz
        System.out.println("\nIntroduce los valores de la SEGUNDA MATRIZ:");
        for (int i = 0; i < tamano; i++) {  // i = fila
            for (int j = 0; j < tamano; j++) {  // j = columna
                System.out.print("Fila " + i + ", Columna " + j + ": ");
                matriz2[i][j] = teclado.nextDouble();
            }
        }

        // Calcular la matriz resultado (resta matriz1 - matriz2)
        for (int i = 0; i < tamano; i++) {  // i = fila
            for (int j = 0; j < tamano; j++) {  // j = columna
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        // Mostrar la primera matriz
        System.out.println("\nPrimera matriz:");
        mostrarMatriz(matriz1);

        // Mostrar la segunda matriz
        System.out.println("\nSegunda matriz:");
        mostrarMatriz(matriz2);

        // Mostrar la matriz resultado
        System.out.println("\nMatriz resultado (Primera - Segunda):");
        mostrarMatriz(resultado);

        teclado.close();
    }

    // Método para imprimir cualquier matriz de tamaño variable
    public static void mostrarMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {  // i = fila
            for (int j = 0; j < matriz[i].length; j++) {  // j = columna
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
