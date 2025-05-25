package TercerTrimestre.Recuperacion.PruebaPractica3A.Pregunta1.Normal;

public class ArrayImparesInvertido {

    public static void main(String[] args) throws Exception {

        // Creamos un array con algunos números
        int[] numeros = {5, 6, 7, 8, 9, 10};

        // Mostramos los números impares en orden normal (de izquierda a derecha)
        System.out.print("Impares en orden normal: ");
        for (int i = 0; i < numeros.length; i++) {
            // Si el número es impar (módulo 2 != 0), lo mostramos
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        // Salto de línea para separar visualmente
        System.out.println();

        // Mostramos los números impares en orden invertido (de derecha a izquierda)
        System.out.print("Impares en orden invertido: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            // Si el número es impar, lo mostramos
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
