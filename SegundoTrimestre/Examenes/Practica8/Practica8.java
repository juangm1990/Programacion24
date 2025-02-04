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
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practica8 {
    
       public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int opcion = 0;

        do {

            System.out.println("0| Salir del programa");
            System.out.println("1| Fichero alumnos.txt");
            System.out.println("2| Fichero notasPruebasPracticas.txt");
            System.out.println("3| Fichero notasMedias");
            System.out.println("4| Calcular notas medias en un fichero notasMedias");
            System.out.println("5| Alumno con mayor nota media");
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

                CalcularNotasMediasEnUnFichero();
                
                    break;

                case 5:

                AlumnoMayorNotaMedia();
                
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

    public static void CalcularNotasMediasEnUnFichero() throws IOException {

                FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        String[] alumnos = new String[31];
        String[] notasPruebas = new String[31];


            fileReader = new FileReader("SegundoTrimestre/Examenes/Practica8/alumnos.txt");
            bufferedReader = new BufferedReader(fileReader);
            String linea = "";
            int contador = 0;
            while ((linea = bufferedReader.readLine()) != null) {
                alumnos[contador] = linea;
                contador++;
            }
            bufferedReader.close();
            fileReader.close();

            fileReader = new FileReader("SegundoTrimestre/Examenes/Practica8/notas.txt");
            bufferedReader = new BufferedReader(fileReader);

            linea = "";
            contador = 0;
            String num1 = "";
            String num2 = "";
            String[] juntos = new String[31];
            double suma = 0;
            double resultado = 0;
            int[] notas = new int[6];
            while ((linea = bufferedReader.readLine()) != null) {
                notasPruebas[contador] = linea;
                contador++;
            }
            for (int i = 1; i < alumnos.length; i++) {
                for (int j = 1; j < notasPruebas.length; j++) {
                    num1 = "";
                    num2 = "";
                    num1 += alumnos[i].charAt(0) + "" + alumnos[i].charAt(1);
                    num2 += notasPruebas[j].charAt(0) + "" + notasPruebas[j].charAt(1);

                    if (num1.equals(num2)) {
                        juntos[i] = alumnos[i].charAt(0) + "" + alumnos[i].charAt(1) + " ";
                        for (int k = 59; k <= 90; k++) {
                            juntos[i] += "" + alumnos[i].charAt(k);
                        }
                        notas[0] = Integer.parseInt(notasPruebas[j].charAt(4) + "" + notasPruebas[j].charAt(5));
                        notas[1] = Integer.parseInt(notasPruebas[j].charAt(8) + "" + notasPruebas[j].charAt(9));
                        notas[2] = Integer.parseInt(notasPruebas[j].charAt(12) + "" + notasPruebas[j].charAt(13));
                        notas[3] = Integer.parseInt(notasPruebas[j].charAt(16) + "" + notasPruebas[j].charAt(17));
                        notas[4] = Integer.parseInt(notasPruebas[j].charAt(20) + "" + notasPruebas[j].charAt(21));
                        notas[5] = Integer.parseInt(notasPruebas[j].charAt(24) + "" + notasPruebas[j].charAt(25));
                        for (int x = 0; x < notas.length; x++) {
                            suma += notas[x];
                        }
                        resultado = suma / notas.length;
                        juntos[i] += " nota media " + resultado;
                        suma = 0;
                        resultado = 0;

                    }
                }
            }
            for (int i = 0; i < notas.length; i++) {
                System.out.println(notas[i]);
            }


            for (String junto : juntos) {
                if (junto != null) {
                    System.out.println(junto);
                }
            }
            fileWriter = new FileWriter("notasMedias2.txt",true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < juntos.length; i++) {
                if (juntos[i]!=null) {
                    bufferedWriter.write(juntos[i]);
                    bufferedWriter.newLine();
                }
            }
            // Alumnos con mas nota
            bufferedReader.close();
            fileReader.close();

            bufferedReader.close();
            fileReader.close();
            bufferedWriter.close();
            fileWriter.close();

    }

    public static void AlumnoMayorNotaMedia() throws IOException{

            FileReader fileReader = null;
            BufferedReader bufferedReader = null;

            fileReader = new FileReader("SegundoTrimestre/Examenes/Practica8/alumnos.txt");
            bufferedReader = new BufferedReader(fileReader);
            String notas2="";
            double notaDouble=0;
            double notaAlta=0;
            String alumno ="";
            String dato ="";
            while ((dato=bufferedReader.readLine())!=null){
                for (int i = 47; i <50 ; i++) {
                    notas2 +=dato.charAt(i);
                }
                notaDouble = Double.parseDouble(notas2);
                if (notaAlta<notaDouble){
                    notaAlta=notaDouble;
                    alumno =dato;
                }
                notas2="";
                notaDouble=0;

            }
            System.out.println(notaAlta);
            System.out.println(alumno);

            bufferedReader.close();
            fileReader.close();

    }

}
