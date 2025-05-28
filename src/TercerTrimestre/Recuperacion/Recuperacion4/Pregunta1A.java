package TercerTrimestre.Recuperacion.Recuperacion4;

public class Pregunta1A {
    
    public static void main(String[] args) {
        int totalParticipantes = 3; // Cambia este valor si quieres probar con más participantes

        // Matriz de notas: totalParticipantes filas y 5 columnas (5 pruebas)
        double[][] notas = {
            {75.5, 80.0, 65.0, 90.0, 85.5},  // Participante 1: Pruebas 1 a 5
            {60.0, 70.0, 72.5, 68.0, 74.0},  // Participante 2: Pruebas 1 a 5
            {85.0, 90.5, 88.0, 92.0, 89.5}   // Participante 3: Pruebas 1 a 5
        };

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
    }
}
