package TercerTrimestre.Recuperacion.Array.NumeroMayorMenorMedia.Normal;

public class MayoresQueMedia {

    public static void main(String[] args) {

        // Array con algunos números
        int[] numeros = {10, 20, 30, 40, 50};

        // Paso 1: calcular la suma total
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }

        // Paso 2: calcular la media
        double media = (double) suma / numeros.length;

        // Paso 3: contar y mostrar los que son mayores que la media
        int contador = 0;
        System.out.println("La media es: " + media);

        System.out.print("Números mayores que la media: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                System.out.print(numeros[i] + " ");
                contador++;
            }
        }

        System.out.println(); // salto de línea
        System.out.println("Hay " + contador + " números mayores que la media.");
    }
}
