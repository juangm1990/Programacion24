package SegundoTrimestre.Examenes.Practica8;

/*
 * Partiendo de los siguientes dos ficheros:
 * 1. alumnos.txt: contiene la información de los alumnos de DAW
 * 2. notasPruebasPracticas.txt: contiene la información de las notas de 6 pruebas prácticas
 * 
 * Crea un aplicación que realice lo sigueinte mediante un menú de opciones
 * 
 * 1. Mostrar por consola:
 *      1.1. Fichero alumnos. txt
 *      1.2. Fichero notasPruebasPracticas.txt
 *      1.3. Fichero notasMedias.txt
 *      1.4. Alumno con mayor nota media
 * 
 * 2. Calcular notas medias (Escribirá en un fichero notasMedias.txt, 
 * el id del alumno, su email y la nota media correspondiente al alumno)
 * 
 * 3. Salir
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Practica8 {
    
       public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int opcion = 0;

        do {

            System.out.println("0| Salir del programa");
            System.out.println("1.1| Fichero alumnos.txt");
            System.out.println("1.2| Fichero notasPruebasPracticas.txt");
            System.out.println("1.3| Fichero notasMedias");
            System.out.println("1.4| Alumno con mayor nota media");
            System.out.println("2| Calcular notas medias");
            System.out.println("----------------------------");
            System.out.println("Por favor, elige una opción:");
            System.out.println("----------------------------");
            opcion = input.nextInt();

            switch (opcion) {

                case 1:
                Alumnos();
                    break;

                case 2:

                NotasPruebasPracticas();
                    break;

                case 3:

                NotasMedias();
                    break;

                case 4:

                
                    break;

                case 5:

                    break;

                case 0:

                    System.out.println("¡Gracias y hasta pronto! Programa finalizado");

                    break;

                default:

                    System.out.println("Ha ocurrido un error en el programa");
                    break;
            }

        } while (opcion != 0);

        input.close();
    }

    public static void Alumnos() throws IOException {

        FileReader fr = new FileReader("SegundoTrimestre/Examenes/Practica8/alumnos.txt");

        BufferedReader br = new BufferedReader(fr);

        String linea1;

        while ((linea1 = br.readLine()) != null) {
            System.out.println(linea1);
        }

        br.close();        
        
    }

    public static void NotasPruebasPracticas() throws IOException {

        FileReader fr = new FileReader("SegundoTrimestre/Examenes/Practica8/medias.txt");
        BufferedReader br = new BufferedReader(fr);

        String linea2;

        while ((linea2 = br.readLine()) !=null){
            System.out.println(linea2);
        }

        br.close();

    }

    public static void NotasMedias() throws IOException {

        FileReader fr = new FileReader("SegundoTrimestre/Examenes/Practica8/notas.txt");
        BufferedReader br = new BufferedReader(fr);

        String linea3;

        while ((linea3 = br.readLine()) !=null) {
            System.out.println(linea3);
            
        }

        br.close();
    }




}
