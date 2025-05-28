package TercerTrimestre.Recuperacion.Recuperacion4;

import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el tamaño de la matriz cuadrada (por ejemplo, 3 para 3x3): ");
        int tamano = teclado.nextInt();

        double[][] matriz1 = new double[tamano][tamano];
        double[][] matriz2 = new double[tamano][tamano];
        double[][] resultado = new double[tamano][tamano];

        // Introducir valores de la primera matriz
        System.out.println("Introduce los valores de la PRIMERA MATRIZ:");
        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                System.out.print("Fila " + fila + ", Columna " + columna + ": ");
                matriz1[fila][columna] = teclado.nextDouble();
            }
        }

        // Introducir valores de la segunda matriz
        System.out.println("Introduce los valores de la SEGUNDA MATRIZ:");
        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                System.out.print("Fila " + fila + ", Columna " + columna + ": ");
                matriz2[fila][columna] = teclado.nextDouble();
            }
        }

        // Calcular la matriz resultado (resta)
        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                resultado[fila][columna] = matriz1[fila][columna] - matriz2[fila][columna];
            }
        }

        // Mostrar la primera matriz
        System.out.println("Primera matriz:");
        mostrarMatriz(matriz1);

        // Mostrar la segunda matriz
        System.out.println("Segunda matriz:");
        mostrarMatriz(matriz2);

        // Mostrar el resultado de la resta
        System.out.println("Matriz resultado (Primera - Segunda):");
        mostrarMatriz(resultado);

        teclado.close();
    }

    public static void mostrarMatriz(double[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }
    }
}
