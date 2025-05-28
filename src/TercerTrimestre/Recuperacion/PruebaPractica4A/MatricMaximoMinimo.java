package TercerTrimestre.Recuperacion.PruebaPractica4A;

public class MatricMaximoMinimo {
     public static void main(String[] args) {
        int[][] matriz = new int[6][10];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxFila = 0, maxCol = 0;
        int minFila = 0, minCol = 0;

        // Rellenar la matriz con números aleatorios entre 1 y 1000
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (int)(Math.random() * 1000 + 1);

                // Buscar máximo
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    maxFila = i;
                    maxCol = j;
                }

                // Buscar mínimo
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                    minFila = i;
                    minCol = j;
                }
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz generada:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostrar resultado
        System.out.println("\nMáximo valor: " + max + " en posición (" + maxFila + ", " + maxCol + ")");
        System.out.println("Mínimo valor: " + min + " en posición (" + minFila + ", " + minCol + ")");
    }
}
