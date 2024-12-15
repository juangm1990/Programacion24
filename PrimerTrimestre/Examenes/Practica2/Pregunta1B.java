package PrimerTrimestre.Examenes.Practica2;

import java.util.Scanner;

public class Pregunta1B {
    
    /*
     * Implementa en Java un programa que realice la cuenta atrás de un tiempo indicado
     * en segundos, mostrando su salida mostrando las horas, minutos y segundos.
     * 
     * Ejemplo de salida:
     * Indica el tiempo en segundos: 500
     * ---Quedan 0 horas, 8 minutos y 20 segundos.
     * ---Quedan 0 horas, 8 minutos y 19 segundos.
     * ---Quedan 0 horas, 8 minutos y 18 segundos.
     * 
     * Usa Thread.sleep(1000); para detener la ejecución del programa durante 1000 milisegundos.
     */

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int segundos = 0;
        int h, m, s = 0;
        int hr, mr = 0;

        System.out.print("Indica de cuántos segundos quieres la cuenta atrás: ");
        segundos = input.nextInt();

        for (int i = segundos; i >= 0; segundos--) {

            h = segundos / 3600;
            hr = segundos % 3600;
            m = hr / 60;
            mr = hr % 60;
            s = mr;

            System.out.println(h + " : " + m + " : " + s);
            Thread.sleep(1000);
        }

        input.close();
    }
}
