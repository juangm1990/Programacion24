package PrimerTrimestre.Examenes.Recuperacion3_HACER;

public class Pregunta1 {

    public static void main(String[] args) {

        int[] array = {5, 6, 7, 8, 9, 10};
        
        // Contar cuántos números pares hay
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                contador++;
            }
        }

        // Crear un array para los pares invertidos
        int[] resultado = new int[contador];
        int index = 0;

        // Recorrer el array de atrás hacia adelante y guardar los pares
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                resultado[index] = array[i];
                index++;
            }
        }

        // Mostrar el resultado utilizando un bucle for tradicional
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}
