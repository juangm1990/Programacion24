package PrimerTrimestre.Recursividad;

public class Recursividad2 {
    
    /*
     * Sumar un Array
     */

     public static void main(String[] args) throws Exception {

        int[] numeros = { 1, 2, 3, 4, 5 };
        int[] numeros1 = { 3, 5 };
        int[] numeros2 = { 3, 4, 5, 8, 9 };

        System.out.println(sumarArray(numeros));
        System.out.println(sumarArray(numeros2));

        for (int i = 0; i < elemento_menos(numeros).length; i++) {
            System.out.print(elemento_menos(numeros)[i]);
        }

        for (int i = 0; i < numeros1.length; i++) {
            System.out.println(numeros1[i]);
        }
    }

    public static int sumarArray (int [] array){

        if (array.length == 0) return 0;
        if (array.length == 1) return array[0];

        int [] aux = elemento_menos(array);
        return array[0]+sumarArray (aux);
    }

    public static int[] elemento_menos(int[] array) {
        int[] nuevoarray = new int[array.length - 1];

        for (int i = 1; i < array.length; i++) {

            nuevoarray[i - 1] = array[i];
        }
        return nuevoarray;
    }
}
