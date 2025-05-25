package TercerTrimestre.Recuperacion.Array.NumeroMayorMenorMedia.Normal;

public class MenoresQueMedia {

    public static void main(String[] args) {

        // Array de ejemplo con números
        int[] numeros = {10, 20, 30, 40, 50};

        // Paso 1: calcular la suma total
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // Paso 2: calcular la media
        double media = (double) suma / numeros.length;

        // Paso 3: mostrar y contar los menores que la media
        int contador = 0;
        System.out.println("La media es: " + media);
        System.out.print("Números menores que la media: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < media) {
                System.out.print(numeros[i] + " ");
                contador++;
            }
        }

        System.out.println(); // salto de línea
        System.out.println("Hay " + contador + " números menores que la media.");
    }
}
