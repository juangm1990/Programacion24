package SegundoTrimestre.ArchivosBinarios.ArchivosBinarios_DosFicherosEnUno;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class DosFicherosEnUno {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("0| Salir del programa");
            System.out.println("1| Crear el primer fichero (alumnos.dat)");
            System.out.println("2| Crear el segundo fichero (medias.dat)");
            System.out.println("3| Copiar el contenido de los dos ficheros en uno");
            System.out.println("4| Copiar las vocales de los dos ficheros en un fichero binario");
            System.out.println("5| Mostrar los ficheros");
            System.out.println("----------------------------");
            System.out.println("Por favor, elige una opción:");
            System.out.println("----------------------------");
            opcion = input.nextInt();
            input.nextLine(); // Añadir línea EXTRA para evitar problemas con la terminal

            String rutaFichero1 = "Archivos/alumnos.dat";
            String rutaFichero2 = "Archivos/medias.dat";
            String contenidoFichero1 = "";
            String contenidoFichero2 = "";
            String vocales = "";
            FileWriter fw = null;
            FileReader fr1 = null;
            FileReader fr2 = null;
            BufferedReader br1 = null;
            BufferedReader br2 = null;

            switch (opcion) {

                case 1:
                    // Crear el primer fichero (alumnos.dat)
                    System.out.println("Introduce el contenido del primer fichero (alumnos.dat):");
                    String contenido1 = input.nextLine();
                    crearFichero(rutaFichero1, contenido1);  // Crear el fichero alumnos.dat con el contenido proporcionado
                    break;

                case 2:
                    // Crear el segundo fichero (medias.dat)
                    System.out.println("Introduce el contenido del segundo fichero (medias.dat):");
                    String contenido2 = input.nextLine();
                    crearFichero(rutaFichero2, contenido2);  // Crear el fichero medias.dat con el contenido proporcionado
                    
                    // Extraer vocales de ambos ficheros y escribir en un fichero binario
                    try {
                        fr1 = new FileReader(rutaFichero1);
                        fr2 = new FileReader(rutaFichero2);
                        br1 = new BufferedReader(fr1);
                        br2 = new BufferedReader(fr2);

                        String linea1 = "";
                        String linea2 = "";
                        while ((linea1 = br1.readLine()) != null) {
                            vocales += extraerVocales(linea1);
                        }
                        while ((linea2 = br2.readLine()) != null) {
                            vocales += extraerVocales(linea2);
                        }

                        // Crear el archivo binario y guardar las vocales
                        FileOutputStream fos = new FileOutputStream("unionVocales.dat");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(vocales);
                        oos.close();

                        System.out.println("Vocales copiadas en unionVocales.dat");

                    } catch (Exception e) {
                        System.out.println("Error al leer los ficheros: " + e.getMessage());
                    } finally {
                        try {
                            br1.close();
                            br2.close();
                            fr1.close();
                            fr2.close();
                        } catch (Exception e) {
                            System.out.println("Error al cerrar los ficheros: " + e.getMessage());
                        }
                    }
                    break;

                case 3:
                    // Copiar el contenido de los dos ficheros en uno
                    try {
                        fr1 = new FileReader(rutaFichero1);
                        fr2 = new FileReader(rutaFichero2);
                        br1 = new BufferedReader(fr1);
                        br2 = new BufferedReader(fr2);

                        contenidoFichero1 = br1.readLine();
                        contenidoFichero2 = br2.readLine();

                        fw = new FileWriter("unionContenido.txt");
                        fw.write(contenidoFichero1 + "\n" + contenidoFichero2);

                        System.out.println("Contenido de los dos ficheros copiado correctamente en unionContenido.txt");

                    } catch (Exception e) {
                        System.out.println("Error al leer los ficheros: " + e.getMessage());
                    } finally {
                        try {
                            br1.close();
                            br2.close();
                            fr1.close();
                            fr2.close();
                            fw.close();
                        } catch (Exception e) {
                            System.out.println("Error al cerrar los ficheros: " + e.getMessage());
                        }
                    }
                    break;

                case 4:
                    // Copiar las vocales de los dos ficheros en un fichero binario
                    try {
                        fr1 = new FileReader(rutaFichero1);
                        fr2 = new FileReader(rutaFichero2);
                        br1 = new BufferedReader(fr1);
                        br2 = new BufferedReader(fr2);

                        String linea1 = "";
                        String linea2 = "";
                        while ((linea1 = br1.readLine()) != null) {
                            vocales += extraerVocales(linea1);
                        }
                        while ((linea2 = br2.readLine()) != null) {
                            vocales += extraerVocales(linea2);
                        }

                        FileOutputStream fos = new FileOutputStream("unionVocales.dat");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(vocales);
                        oos.close();

                        System.out.println("Vocales copiadas en unionVocales.dat");

                    } catch (Exception e) {
                        System.out.println("Error al leer los ficheros: " + e.getMessage());
                    } finally {
                        try {
                            if (br1 != null) br1.close();
                            if (br2 != null) br2.close();
                            if (fr1 != null) fr1.close();
                            if (fr2 != null) fr2.close();
                        } catch (Exception e) {
                            System.out.println("Error al cerrar los ficheros: " + e.getMessage());
                        }
                    }
                    break;

                case 5:
                    // Mostrar los ficheros
                    System.out.println("Contenido del fichero unionContenido.txt:");
                    mostrarFichero("unionContenido.txt");

                    System.out.println("Contenido del fichero unionVocales.dat:");
                    mostrarFichero("unionVocales.dat");

                    break;

                case 0:
                    System.out.println("¡Gracias y hasta pronto! Programa finalizado");
                    break;

                default:
                    System.out.println("Opción no válida, por favor, elige una opción correcta");
                    break;
            }

        } while (opcion != 0);

        input.close();
    }

    // Método para crear un fichero con contenido dado
    public static void crearFichero(String ruta, String contenido) {
        try {
            File file = new File(ruta);
            if (!file.exists()) {
                file.getParentFile().mkdirs(); // Crear directorios si no existen
                file.createNewFile(); // Crear el archivo
            }

            FileWriter writer = new FileWriter(file);
            writer.write(contenido);
            writer.close();
            System.out.println("Fichero creado correctamente en: " + ruta);

        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }
    }

    // Método para extraer solo las vocales de una cadena de texto
    public static String extraerVocales(String texto) {
        String vocales = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vocales += c;
            }
        }
        return vocales;
    }

    // Método para mostrar el contenido de un fichero
    public static void mostrarFichero(String ruta) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error al leer el fichero " + ruta + ": " + e.getMessage());
        }
    }
}
