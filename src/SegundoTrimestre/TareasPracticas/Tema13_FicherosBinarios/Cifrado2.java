package SegundoTrimestre.TareasPracticas.Tema13_FicherosBinarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cifrado2 {
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

     
    
        String fraseCifrada = "";
        int menu = 0;

        do {
            System.out.println("1. Cifrado");
            System.out.println("2. Descifrado");
            System.out.println("3. Salir");
            menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    // Cifrado
                    System.out.println("Introduce la frase:");
                    String frase = input.nextLine();
                    System.out.println("Introduce la clave numérica:");
                    int clave = input.nextInt();
                 
                    for (int i = 0; i < frase.length(); i++) {
                        char letra = frase.charAt(i);
                        int posicionLetra = abecedario.indexOf(letra);
                        if (posicionLetra != -1) {
                            int posicionCifrada = (posicionLetra + clave) % abecedario.length();
                            fraseCifrada += abecedario.charAt(posicionCifrada);
                        } else {
                            fraseCifrada += letra;
                        }
                    }

                    FileWriter fw = null;
                    try {
                        fw = new FileWriter("cifrado.txt");
                        fw.write(fraseCifrada);
                    } catch (IOException e) {
                        System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
                    } finally {
                        try {
                            if (fw != null) {
                                fw.close();
                            }
                        } catch (IOException e) {
                            System.out.println("Ocurrió un error al cerrar el archivo: " + e.getMessage());
                        }
                    }

                    break;
                case 2:
                    // Descifrado
                    System.out.println("Introduce la clave para descifrar la frase:");
                    int clave2 = input.nextInt();
                    String fraseDescifrada = "";
                        FileReader fr = null;
                        BufferedReader br = null;

                        try {
                            fr = new FileReader("cifrado.txt");
                            br = new BufferedReader(fr);

                            for (int i = 0; i < fraseCifrada.length(); i++) {
                                char letra = fraseCifrada.charAt(i);
                                int posicionCifrada2 = abecedario.indexOf(letra);
                                if (posicionCifrada2 != -1) {
                                    int posicionDescifrada = (posicionCifrada2 - clave2 + (abecedario.length() * clave2)) % abecedario.length();
                                    fraseDescifrada += abecedario.charAt(posicionDescifrada);
                                } else {
                                    fraseDescifrada += letra;
                                }
                            }

                        } catch (IOException e) {
                            System.out.println("Error al leer el archivo: " + e.getMessage());
                        } catch (Exception e) {
                            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
                        } finally {
                            try {
                                if (br != null)
                                    br.close();
                                if (fr != null)
                                    fr.close();
                            } catch (IOException e) {
                                System.out.println("Error al cerrar el archivo: " + e.getMessage());
                            }
                        }

                
                    
                    System.out.println(fraseDescifrada);
                    break;
                case 3:
                    System.out.println("Saliendo del menu...");
                default:
                    if (menu < 1 || menu > 3) {
                        System.out.println("ERROR");

                    }
                    break;
            }

        } while (menu != 3);

        input.close();

    }
}
