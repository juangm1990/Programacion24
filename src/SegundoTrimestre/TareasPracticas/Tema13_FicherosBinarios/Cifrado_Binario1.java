package SegundoTrimestre.TareasPracticas.Tema13_FicherosBinarios;

import java.io.*;
import java.util.Scanner;

public class Cifrado_Binario1 {
    
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
            input.nextLine(); // Añadir línea extra para evitar problemas con la terminal

            String frase = "";
            char caracter = ' ';
            int numero = 0;
            int posicion = 0;
            String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            
            switch (opcion) {

                case 1:

                    FileOutputStream archivoSalida = null;
                    DataOutputStream escritorBinario = null;

                    try {
                        archivoSalida = new FileOutputStream("cifrado.bin");
                        escritorBinario = new DataOutputStream(archivoSalida);

                        System.out.println("Introduce una frase:");
                        frase = input.nextLine(); // Leer la frase
                        frase = frase.toUpperCase(); // Convertir la frase a mayúscula

                        System.out.println("Introduce una clave numérica:");
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

                            escritorBinario.writeChar(caracter); // Escribir el cifrado en el archivo binario
                        }

                        System.out.println("Texto cifrado guardado");

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        try {
                            if (escritorBinario != null) escritorBinario.close(); 
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    break;

                case 2:
                    
                    FileInputStream archivoEntrada = null;
                    DataInputStream lectorBinario = null;

                    try {
                        archivoEntrada = new FileInputStream("cifrado.bin");
                        lectorBinario = new DataInputStream(archivoEntrada);
                        String fraseDescifrada = "";

                        System.out.println("Introduce una clave numérica:");
                        numero = input.nextInt();
                        
                        while (lectorBinario.available() > 0) { // Leer mientras haya datos
                            char c = lectorBinario.readChar();
                            if (c >= 'A' && c <= 'Z') {
                                posicion = abecedario.indexOf(c) - numero;

                                if (posicion < 0) {
                                    posicion += 26;
                                }

                                fraseDescifrada += abecedario.charAt(posicion);
                            } else {
                                fraseDescifrada += c;
                            }
                        }

                        System.out.println("Texto descifrado: " + fraseDescifrada);

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        try {
                            if (lectorBinario != null) lectorBinario.close();
                        } catch (Exception e) {
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
