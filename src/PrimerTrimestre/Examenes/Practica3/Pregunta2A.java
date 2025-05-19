package PrimerTrimestre.Examenes.Practica3;

public class Pregunta2A {
    
    /*
     * Crea un programa que dibuje por consola las tablas de multiplicar del siguiente array:
     * [4, 5, 10, 2, 3]
     */

    public static void main(String[] args) throws Exception {
        
         int [] numeros = {1,2,3,4};

         for (int i = 0; i < numeros.length; i++) {
 
             for ( int j = 0 ; j<=10 ;j++ ){
 
                 System.out.println(numeros [i] + " x " + j + " = " + (numeros [i]* j) );
 
 
             }
 
             System.out.println("-------------------");
         }
     }
}
