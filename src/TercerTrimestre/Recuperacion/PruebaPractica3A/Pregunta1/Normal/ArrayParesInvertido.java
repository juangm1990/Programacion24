package TercerTrimestre.Recuperacion.PruebaPractica3A.Pregunta1.Normal;

public class ArrayParesInvertido {
    
     public static void main(String[] args) throws Exception{

        // Creamos un array con algunos números
        int[] numeros = {5, 6, 7, 8, 9, 10};

        // Mostramos los números pares en orden normal (de izquierda a derecha)
        System.out.print("Pares en orden normal: ");
        for (int i = 0; i < numeros.length; i++) {
            // Si el número es par (módulo 2 == 0), lo mostramos
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        // Salto de línea para separar visualmente
        System.out.println();

        // Mostramos los números pares en orden invertido (de derecha a izquierda)
        System.out.print("Pares en orden invertido: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            // Si el número es par, lo mostramos
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
