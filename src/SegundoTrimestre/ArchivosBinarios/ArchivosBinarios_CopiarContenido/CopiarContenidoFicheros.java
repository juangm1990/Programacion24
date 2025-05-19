package SegundoTrimestre.ArchivosBinarios.ArchivosBinarios_CopiarContenido;


import java.io.*;
import java.util.Scanner;

public class CopiarContenidoFicheros {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la ruta del primer fichero: ");
        String file1Path = scanner.nextLine();

        System.out.print("Introduce la ruta del segundo fichero: ");
        String file2Path = scanner.nextLine();

        int option;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Copiar el contenido de los dos ficheros en uno (unionContenido.txt)");
            System.out.println("2. Copiar las vocales de los dos ficheros en un fichero binario (unionVocales.dat)");
            System.out.println("3. Mostrar por pantalla:");
            System.out.println("   3.1 Fichero unionContenido.txt");
            System.out.println("   3.2 Fichero unionVocales.dat");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    copiarContenido(file1Path, file2Path, "unionContenido.txt");
                    break;
                case 2:
                    copiarVocales(file1Path, file2Path, "unionVocales.dat");
                    break;
                case 3:
                    mostrarContenido(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (option != 0);

        scanner.close();
    }

    private static void copiarContenido(String file1Path, String file2Path, String outputPath) {
        try (FileOutputStream fos = new FileOutputStream(outputPath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            copiarArchivo(file1Path, oos);
            copiarArchivo(file2Path, oos);
            System.out.println("Contenido copiado en " + outputPath);
        } catch (IOException e) {
            System.out.println("Error al copiar el contenido: " + e.getMessage());
        }
    }

    private static void copiarArchivo(String filePath, ObjectOutputStream oos) throws IOException {
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                String line = (String) ois.readObject();
                oos.writeObject(line);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void copiarVocales(String file1Path, String file2Path, String outputPath) {
        try (FileOutputStream fos = new FileOutputStream(outputPath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            extraerVocales(file1Path, oos);
            extraerVocales(file2Path, oos);
            System.out.println("Vocales copiadas en " + outputPath);
        } catch (IOException e) {
            System.out.println("Error al copiar las vocales: " + e.getMessage());
        }
    }

    private static void extraerVocales(String filePath, ObjectOutputStream oos) throws IOException {
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                String line = (String) ois.readObject();
                for (char c : line.toCharArray()) {
                    if ("AEIOUaeiou".indexOf(c) != -1) {
                        oos.writeObject(c);
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void mostrarContenido(Scanner scanner) {
        System.out.println("Selecciona el fichero a mostrar:");
        System.out.println("1. unionContenido.txt");
        System.out.println("2. unionVocales.dat");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                mostrarTexto("unionContenido.txt");
                break;
            case 2:
                mostrarBinario("unionVocales.dat");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void mostrarTexto(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                String line = (String) ois.readObject();
                System.out.println(line);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static void mostrarBinario(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                char c = (char) ois.readObject();
                System.out.print(c);
            }
            System.out.println();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el archivo binario: " + e.getMessage());
        }
    }


}
