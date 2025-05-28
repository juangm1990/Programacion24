package TercerTrimestre.Recuperacion.Recuperacion4;

public class Pregunta3 {
    public static void main(String[] args) throws Exception{
        int tamano = 3; // Tamaño de la matriz

        double[][] matriz1 = {
            {7.5, 8.0, 6.2},
            {5.0, 9.5, 10.0},
            {4.7, 3.3, 6.6}
        };

        double[][] matriz2 = {
            {2.0, 1.0, 0.2},
            {1.5, 4.5, 3.0},
            {0.7, 2.3, 5.6}
        };

        double[][] resultado = new double[tamano][tamano];

        // Calcular la matriz resultado (resta)
        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                resultado[fila][columna] = matriz1[fila][columna] - matriz2[fila][columna];
            }
        }

        // Mostrar la primera matriz
        System.out.println("Primera matriz:");
        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                System.out.print(matriz1[fila][columna] + " ");
            }
            System.out.println();
        }

        // Mostrar la segunda matriz
        System.out.println("Segunda matriz:");
        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                System.out.print(matriz2[fila][columna] + " ");
            }
            System.out.println();
        }

        // Mostrar la matriz resultado
        System.out.println("Matriz resultado (Primera - Segunda):");
        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                System.out.print(resultado[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}

