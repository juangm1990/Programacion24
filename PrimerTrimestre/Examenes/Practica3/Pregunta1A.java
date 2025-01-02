package PrimerTrimestre.Examenes.Practica3;

public class Pregunta1A {
    
    /*
     * Programa que lea 10 números enteros por teclado y los guarde en un array. 
     * Calcula y muestra la media de los números que estén en las posiciones pares del array.
     * Considera la primera posición del arraya (posición 0) como par.
     */
    
    public static void main(String[] args) throws Exception {

        int[] numeros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int suma = 0;
        int contador = 0;
        

        for (int i = 0; i < numeros.length; i++){

            if (i % 2 == 0) {
                suma += numeros [i];
                contador++;
            }
        
        }

        double media = suma / contador;
        System.out.println("La media de los números en las posiciones pares son: " + media);
    }
}
