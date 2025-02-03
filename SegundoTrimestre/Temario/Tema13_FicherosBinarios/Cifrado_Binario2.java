package SegundoTrimestre.Temario.Tema13_FicherosBinarios;

import java.io.*; // Importa las clases necesarias para la gestión de archivos binarios
import java.util.Scanner;

public class Cifrado_Binario2 {
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); // Scanner para leer la entrada del usuario
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Alfabeto utilizado en el cifrado

        String fraseCifrada = ""; // Variable para almacenar la frase cifrada
        int menu = 0; // Variable para la opción del menú

        do {
            // Menú de opciones
            System.out.println("1. Cifrado");
            System.out.println("2. Descifrado");
            System.out.println("3. Salir");
            menu = input.nextInt();
            input.nextLine(); // Consumir la nueva línea

            switch (menu) {
                case 1:
                    // Cifrado
                    System.out.println("Introduce la frase:");
                    String frase = input.nextLine(); // Leer la frase ingresada por el usuario
                    System.out.println("Introduce la clave numérica:");
                    int clave = input.nextInt(); // Leer la clave numérica
                 
                    // Proceso de cifrado utilizando un cifrado de desplazamiento (tipo César)
                    for (int i = 0; i < frase.length(); i++) {
                        char letra = frase.charAt(i);
                        int posicionLetra = abecedario.indexOf(letra); // Buscar la posición de la letra en el abecedario
                        if (posicionLetra != -1) { // Si la letra está en el abecedario
                            int posicionCifrada = (posicionLetra + clave) % abecedario.length(); // Desplazar según la clave
                            fraseCifrada += abecedario.charAt(posicionCifrada); // Agregar la letra cifrada
                        } else {
                            fraseCifrada += letra; // Si no es una letra del abecedario, mantener igual (espacios, signos, etc.)
                        }
                    }

                    // Escritura de la frase cifrada en un archivo binario
                    DataOutputStream escritorBinario = null;
                    try {
                        escritorBinario = new DataOutputStream(new FileOutputStream("cifrado.bin")); // Crear archivo binario
                        escritorBinario.writeUTF(fraseCifrada); // Escribir la frase cifrada en binario
                    } catch (IOException e) {
                        System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
                    } finally {
                        try {
                            if (escritorBinario != null) {
                                escritorBinario.close(); // Cerrar el archivo para evitar pérdida de datos
                            }
                        } catch (IOException e) {
                            System.out.println("Ocurrió un error al cerrar el archivo: " + e.getMessage());
                        }
                    }
                    break;

                case 2:
                    // Descifrado
                    System.out.println("Introduce la clave para descifrar la frase:");
                    int clave2 = input.nextInt(); // Leer la clave de descifrado
                    String fraseDescifrada = ""; // Variable para almacenar la frase descifrada

                    // Lectura de la frase cifrada desde el archivo binario
                    DataInputStream lectorBinario = null;
                    try {
                        lectorBinario = new DataInputStream(new FileInputStream("cifrado.bin")); // Abrir el archivo binario
                        fraseCifrada = lectorBinario.readUTF(); // Leer la frase cifrada desde el archivo

                        // Proceso de descifrado (inverso al cifrado)
                        for (int i = 0; i < fraseCifrada.length(); i++) {
                            char letra = fraseCifrada.charAt(i);
                            int posicionCifrada2 = abecedario.indexOf(letra);
                            if (posicionCifrada2 != -1) { // Si la letra está en el abecedario
                                int posicionDescifrada = (posicionCifrada2 - clave2 + (abecedario.length() * clave2)) % abecedario.length(); 
                                fraseDescifrada += abecedario.charAt(posicionDescifrada); // Agregar la letra descifrada
                            } else {
                                fraseDescifrada += letra; // Si no es una letra del abecedario, mantener igual
                            }
                        }

                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error inesperado: " + e.getMessage());
                    } finally {
                        try {
                            if (lectorBinario != null)
                                lectorBinario.close(); // Cerrar el archivo para evitar pérdida de datos
                        } catch (IOException e) {
                            System.out.println("Error al cerrar el archivo: " + e.getMessage());
                        }
                    }

                    // Mostrar la frase descifrada al usuario
                    System.out.println("Texto descifrado: " + fraseDescifrada);
                    break;
                    
                case 3:
                    System.out.println("Saliendo del menú...");
                    break;
                    
                default:
                    if (menu < 1 || menu > 3) {
                        System.out.println("ERROR: Opción no válida.");
                    }
                    break;
            }

        } while (menu != 3); // El bucle se repite hasta que el usuario elija salir

        input.close(); // Cerrar el scanner
    }
}
