package PrimerTrimestre.Examenes.Practica1;

import java.util.Scanner;

public class Practica2 {
    
        /*
     * Realiza un programa que pida por teclado el resultado (tipo dato entero) obtenido al lanzar 
     * un dado de seis caras y muestre por pantalla el número en letras (tipo dato cadena) 
     * de la cara opuesta al resultado obtenido.
     * 
     * 1./ En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
     * 2./ Si el número introducido es menor que 1 o mayor que 6, se mostrará el mensaje: "ERROR: número incorrecto."
     */

        public static void main(String[] args) throws Exception {
        
        //Habilita meter un número
        Scanner input = new Scanner (System.in);

        int numero=0;

        System.out.println("Introduzca el número");
        //Insertar numero
        numero = input.nextInt ();

        if (numero == 1) {
            System.out.println("Seis");
        } else if (numero == 2) {
            System.out.println("Cinco");
        } else if (numero == 3) {
            System.out.println("Cuatro");    
        } else if (numero == 4) {
            System.out.println("Tres"); 
        } else if (numero == 5) {
            System.out.println("Dos"); 
        } else if (numero == 6) {
            System.out.println("Uno");   
        } else if ((numero >1 || numero <6)) {
            System.out.println("ERROR");  
        }
        
        input.close();
    }
}
