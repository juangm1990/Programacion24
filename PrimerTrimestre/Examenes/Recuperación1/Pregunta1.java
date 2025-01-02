package PrimerTrimestre.Examenes.Recuperación1;

import java.util.Scanner;

public class Pregunta1 {

    /*
     * Implementa en Java un programa que realice la cuenta atrás de un tiempo indicado
     * en segundos, mostrando su salida mostrando las horas, minutos y segundos.
     * 
     * Indica el tiempo en segundos: 500
     * Indica hasta que tiempo debe realizarse la cuenta atrás:
     *      - Indica las horas: 0
     *      - Indica los minutos: 8
     *      - Indica los segundos: 17
     * 
     * INICIO DE LA CUENTA ATRÁS: 
     * ---Quedan 0 horas, 8 minutos y 20 segundos.
     * ---Quedan 0 horas, 8 minutos y 19 segundos.
     * ---Quedan 0 horas, 8 minutos y 18 segundos.
     * 
     * Usa Thread.sleep(1000); para detener la ejecución del programa durante 1000 milisegundos.
     */

     public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int segundos = 0;
        int minutos = 0;
        int horas = 0;
        int detenerHoras = 0;
        int detenerMinutos = 0;
        int detenerSegundos = 0;

        // Solicitar el tiempo para la cuenta atrás
        System.out.print("Indica el tiempo en segundos para realizar la cuenta atrás: ");
        segundos = input.nextInt();

        // Solicitar las horas, minutos y segundos en el que debe detenerse la cuenta atrás
        System.out.print("Indica a qué hora debe detenerse la cuenta atrás: ");
        detenerHoras = input.nextInt();
        
        System.out.print("Indica a qué minuto debe detenerse la cuenta atrás: ");
        detenerMinutos = input.nextInt();
        
        System.out.print("Indica a qué segundo debe detenerse la cuenta atrás: ");
        detenerSegundos = input.nextInt();

        horas = segundos / (60 * 60);
        minutos = (segundos % (60 * 60)) / 60;
        segundos = segundos % 60;

        System.out.println("INICIO DE LA CUENTA ATRÁS: ");
        while (horas > 0 || minutos > 0 || segundos > 0) {
            System.out.println("Quedan " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
            Thread.sleep(1000); 

            // Detener la cuenta atrás si llega al tiempo indicado
            if (horas == detenerHoras && minutos == detenerMinutos && segundos == detenerSegundos) {
                System.out.println("Se ha detenido en " + detenerHoras + " horas, " + detenerMinutos + " minutos y " + detenerSegundos + " segundos");
                break; // Detener la cuenta atrás
            }

            segundos--;
            if (segundos == -1) {
                segundos = 59;
                minutos--;
            }
            if (minutos == -1) {
                minutos = 59;
                horas--;
            }
        }

        System.out.println("¡FIN DE LA CUENTA ATRÁS!");
        input.close();
    }
}
