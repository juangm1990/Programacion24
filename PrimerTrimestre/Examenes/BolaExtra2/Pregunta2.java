package PrimerTrimestre.Examenes.BolaExtra2;

public class Pregunta2 {
    
     /*
     * Crea una función que devuelva un array con los números primos que se encuentren en otro array.
     */

     public static void main(String[] args) throws Exception{
          
          int[] numeros = { 10, 13, 7, 18, 25, 3, 19, 11, 4 }; 
          int[] primos = new int[numeros.length]; 
          int array = 0; 
  
          // Recorremos el array de números
          for (int i = 0; i < numeros.length; i++) {
              int numero = numeros[i];
              boolean esPrimo = true;
  
              // Verificamos si el número es primo
              if (numero <= 1) {
                  esPrimo = false; // Los números menores o iguales a 1 no son primos
              } else {
                  for (int j = 2; j < numero; j++) {
                      if (numero % j == 0) { // Si el número es divisible por otro, no es primo
                          esPrimo = false;
                          break;
                      }
                  }
              }

              if (esPrimo) {
                  primos[array] = numero;
                  array++;
              }
          }
  
          System.out.print("Los números primos son: ");
          for (int i = 0; i < array; i++) {
              System.out.print(primos[i] + " ");
          }
      }
}
