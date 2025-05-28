package TercerTrimestre.Recuperacion.Recuperacion4;

import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("¿Cuántos participantes hay? ");
        int totalParticipantes = input.nextInt();

        double[][] notas = new double[totalParticipantes][5]; // Matriz de notas con decimales

        // Rellenar la matriz
        for (int participante = 0; participante < totalParticipantes; participante++) {
            System.out.println("Introduce las 5 notas del participante " + (participante + 1) + ":");
            for (int prueba = 0; prueba < 5; prueba++) {
                System.out.print("Nota de la prueba " + (prueba + 1) + ": ");
                notas[participante][prueba] = input.nextDouble();
            }
        }

        // Puntuación total de cada participante
        System.out.println("Puntuación total de cada participante:");
        for (int participante = 0; participante < totalParticipantes; participante++) {
            double sumaNotas = 0;
            for (int prueba = 0; prueba < 5; prueba++) {
                sumaNotas = sumaNotas + notas[participante][prueba];
            }
            System.out.println("Participante " + (participante + 1) + ": " + sumaNotas);
        }

        // Participantes que superan o no superan 70 en cada prueba
        for (int prueba = 0; prueba < 5; prueba++) {
            int aprobados = 0;
            int suspensos = 0;

            for (int participante = 0; participante < totalParticipantes; participante++) {
                if (notas[participante][prueba] >= 70) {
                    aprobados = aprobados + 1;
                } else {
                    suspensos = suspensos + 1;
                }
            }

            System.out.println("Prueba " + (prueba + 1) + ":");
            System.out.println("Participantes que aprobaron (>=70): " + aprobados);
            System.out.println("Participantes que suspendieron (<70): " + suspensos);
        }

        // Media de cada prueba
        System.out.println("Media de cada prueba:");
        for (int prueba = 0; prueba < 5; prueba++) {
            double sumaNotasPrueba = 0;

            for (int participante = 0; participante < totalParticipantes; participante++) {
                sumaNotasPrueba = sumaNotasPrueba + notas[participante][prueba];
            }

            double media = sumaNotasPrueba / totalParticipantes;
            System.out.println("Prueba " + (prueba + 1) + ": " + media);
        }

        input.close();
    }
}

