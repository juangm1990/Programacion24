package TercerTrimestre.Recuperacion.PruebaPractica4A;

public class App {
    public static void main(String[] args) throws Exception {

   //En una matriz C de Mx6 se encuentran almacenadas las calificiaciones de 6 asaignaturas de un grupo de M estudiantes
   //Realizar un programa y que imprima por pantalla lo siguiente : 
   // - La nota media de cada estudiante 
   // - El numero de estudiantes que aprobaron cada asignatura 
   // - El numero de estudiantes que suspendieron cada asignatura 
   // - La nota media de cada asignatura



   // 6 notas ya alamcenadas de 3 estudiantes M

        double[][] C = {
                { 7.5, 8.0, 6.5, 9.0, 5.5, 7.0 },
                { 5.0, 3.5, 4.5, 2.5, 1.0, 4.5 },
                { 9.5, 8.5, 8.0, 4.5, 8.0, 9.0 }
        };

  // - La nota media de cada estudiante 
        for (int i = 0; i < C.length; i++) {
            double suma = 0;
            for (int j = 0; j < 6; j++) {
                suma += C[i][j];
            }
            double media = suma / 6;
            System.out.println("Estudiante " + (i + 1) + " - Nota media: " + media);
        }

// - El numero de estudiantes que aprobaron cada asignatura 
        for (int j = 0; j < 6; j++) { // recorrer asignaturas (columnas)
            int aprobados = 0;

            for (int i = 0; i < C.length; i++) { // recorrer estudiantes (filas)
                if (C[i][j] > 5.0) {
                    aprobados++;
                }
            }

            System.out.println("Asignatura " + (j + 1) + " - Estudiantes aprobados: " + aprobados);
        }

        // - El numero de estudiantes que suspendieron cada asignatura 
        for (int j = 0; j < 6; j++) { // recorrer asignaturas (columnas)
            int suspensos = 0;

            for (int i = 0; i < C.length; i++) { // recorrer estudiantes (filas)
                if (C[i][j] < 5.0) { // le quitas el = para que no cuente el signo <menor y mayor >
                    suspensos++;
                }
            }

            System.out.println("Asignatura " + (j + 1) + " - Estudiantes suspensos: " + suspensos);
        }

         // - La nota media de cada asignatura
        for (int j = 0; j < 6; j++) { // recorrer asignaturas (columnas)
            double suma = 0;

            for (int i = 0; i < C.length; i++) { // recorrer estudiantes (filas)
                suma += C[i][j];
            }

            double media = suma / C.length;
            System.out.println("Asignatura " + (j + 1) + " - Asignatura Nota media : " + media);
        }

    }


    
}