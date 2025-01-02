package PrimerTrimestre.Examenes.Practica3;

public class Pregunta2A {
    
    public static void main(String[] args) throws Exception {

        /*
         * Tabla multiplicar del 4
         */

        
         int [] numeros = {1,2,3,4};

         for (int i = 0; i < numeros.length; i++) {
 
             for ( int j = 0 ; j<=10 ;j++ ){
 
                 System.out.println(numeros [i] + " x " + j + " = " + (numeros [i]* j) );
 
 
             }
 
             System.out.println("-------------------");
         }
     }
}
