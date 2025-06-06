package TercerTrimestre.Recuperacion.Recuperacion4;

import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("¿Cuántos participantes hay? ");
        int totalParticipantes = input.nextInt();

        double[][] notas = new double[totalParticipantes][5]; // Matriz de notas con decimales

        // Rellenar la matriz
        for (int i = 0; i < totalParticipantes; i++) {  // i = participante
            System.out.println("Introduce las 5 notas del participante " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {  // j = prueba
                System.out.print("Nota de la prueba " + (j + 1) + ": ");
                notas[i][j] = input.nextDouble();
            }
        }

        System.out.println();

        // Puntuación total de cada participante
        System.out.println("Puntuación total de cada participante:");
        for (int i = 0; i < totalParticipantes; i++) {  // i = participante
            double sumaNotas = 0;
            for (int j = 0; j < 5; j++) {  // j = prueba
                sumaNotas = sumaNotas + notas[i][j];
            }
            System.out.println("Participante " + (i + 1) + ": " + sumaNotas);
        }

        System.out.println();

        // Participantes que superan o no superan 70 en cada prueba
        for (int j = 0; j < 5; j++) {  // j = prueba
            int aprobados = 0;
            int suspensos = 0;

            for (int i = 0; i < totalParticipantes; i++) {  // i = participante
                if (notas[i][j] >= 70) {
                    aprobados = aprobados + 1;
                } else {
                    suspensos = suspensos + 1;
                }
            }

            System.out.println("Prueba " + (j + 1) + ":");
            System.out.println("Participantes que aprobaron (>=70): " + aprobados);
            System.out.println("Participantes que suspendieron (<70): " + suspensos);
            System.out.println();
        }

        // Media de cada prueba
        System.out.println("Media de cada prueba:");
        for (int j = 0; j < 5; j++) {  // j = prueba
            double sumaNotasPrueba = 0;

            for (int i = 0; i < totalParticipantes; i++) {  // i = participante
                sumaNotasPrueba = sumaNotasPrueba + notas[i][j];
            }

            double media = sumaNotasPrueba / totalParticipantes;
            System.out.println("Prueba " + (j + 1) + ": " + media);
        }

        input.close();
    }
}

