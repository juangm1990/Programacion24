package PrimerTrimestre.Examenes.BolaExtra2;

public class Pregunta1 {

    /*
     * Crea una función que devuelva un array con todos los números que contienen el 7 (por ej. 7, 27, 782) 
     * que se encuentran en otro array. Posteriormente imprime los números por consola.
     * 
     * El tamaño del array que se devuelve será menor o igual que el que se pasa como parámetro.
     */

    public static void main(String[] args) throws Exception {

        int[] numeros = { 7, 12, 27, 37, 82, 782, 56, 707 }; 
        int[] numerosConSiete = new int[numeros.length]; 
        int array = 0; 

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            while (numero > 0) {
                if (numero % 10 == 7) { // Comprobamos si el último dígito es 7
                    numerosConSiete[array] = numeros[i]; 
                    array++;
                    break; // Salimos del bucle, ya que ya encontramos el 7
                }
                numero = numero / 10;
            }
        }

        System.out.print("Los números que contienen el 7 son: ");
        for (int i = 0; i < array; i++) {
            System.out.print(numerosConSiete[i] + " ");
        }
    }

}
