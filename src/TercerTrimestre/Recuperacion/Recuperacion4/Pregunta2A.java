package TercerTrimestre.Recuperacion.Recuperacion4;

public class Pregunta2A {
    public static void main(String[] args) throws Exception {
        int tamano = 3; // Tamaño de la matriz (3x3)

        // Definimos la primera matriz con valores fijos
        double[][] matriz1 = {
            {7.5, 8.0, 6.2},
            {5.0, 9.5, 10.0},
            {4.7, 3.3, 6.6}
        };

        // Definimos la segunda matriz con valores fijos
        double[][] matriz2 = {
            {2.0, 1.0, 0.2},
            {1.5, 4.5, 3.0},
            {0.7, 2.3, 5.6}
        };

        // Creamos la matriz resultado para guardar la resta de matriz1 - matriz2
        double[][] resultado = new double[tamano][tamano];

        // Calculamos la matriz resultado restando elemento a elemento
        for (int i = 0; i < tamano; i++) {      // i recorre las filas
            for (int j = 0; j < tamano; j++) {  // j recorre las columnas
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        // Mostramos la primera matriz en pantalla
        System.out.println("Primera matriz:");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print(matriz1[i][j] + " ");  // Imprime cada valor separado por espacio
            }
            System.out.println(); // Salto de línea después de cada fila
        }

        System.out.println(); // Línea en blanco para separar matrices

        // Mostramos la segunda matriz en pantalla
        System.out.println("Segunda matriz:");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(); // Línea en blanco para separar matrices

        // Mostramos la matriz resultado en pantalla
        System.out.println("Matriz resultado (Primera - Segunda):");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
