package SegundoTrimestre.Temario.Tema13_FicherosBinarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Cifrado {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int opcion = 0;

        do {

            System.out.println("0| Salir del programa");
            System.out.println("1| Cifrado");
            System.out.println("2| Descifrar");
            System.out.println("----------------------------");
            System.out.println("Por favor, elige una opción:");
            System.out.println("----------------------------");
            opcion = input.nextInt();
            input.nextLine(); // Añadir linea EXTRA para evitar problemas con la terminal

            String frase = "";
            char caracter = ' ';
            int numero = 0;

            String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int posicion = 0;

            switch (opcion) {

                case 1:

                    FileWriter fw = null;

                    try {

                        fw = new FileWriter("cifrado.txt");

                        System.out.println("Introduce una frase");
                        frase = input.nextLine(); // Leer la frase
                        frase = frase.toUpperCase(); // Convertir la frase a mayúscula

                        System.out.println("Introduce una clave numérica");
                        numero = input.nextInt(); // Leer la clave numérica introducida
                        

                        for (int i = 0; i < frase.length(); i++) {
                            if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
                                posicion = abecedario.indexOf(frase.charAt(i)) + numero;

                                if (posicion > 25) {
                                    posicion %= 26; // Tamaño del abecedario
                                }

                                caracter = abecedario.charAt(posicion);

                            } else {
                                caracter = frase.charAt(i); 
                            }

                            fw.write(caracter); // Escribir el cifrado en el archivo .txt
                        }

                        System.out.println("Texto cifrado guardado");

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    } finally {
                        try {
                            fw.close(); 

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    break;

                case 2:
                    
                    FileReader fr = null;
                    BufferedReader br = null;

                    try {

                        fr = new FileReader("cifrado.txt");
                        br = new BufferedReader(fr);
                        String frase2 = "";

                        System.out.println("Introduce una clave numérica");
                        numero = input.nextInt();
                        
                        
                        frase = br.readLine();
                        System.out.println(frase);

                        for (int i = 0; i < frase.length(); i++){
                            if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
                                posicion = abecedario.indexOf(frase.charAt(i)) - numero;

                                if (posicion < 0) {
                                    posicion += 26;
                                }

                                frase2 += abecedario.charAt(posicion);
                            } else {
                                frase2 += frase.charAt(i);
                            }
                        }

                        System.out.println(frase2);
                           

                    } catch (Exception e){

                        System.out.println(e.getMessage());

                    } finally {
                        try {
                            br.close();
                            fr.close();

                        } catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    }

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
}
