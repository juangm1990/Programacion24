package SegundoTrimestre.ArchivosBinarios.ArchivosBinarios_BuscarAñadir1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class GestorEstudiantes {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int opcion = 0;

        do {

            System.out.println("0.- Salir");
            System.out.println("1.- Añadir nuevos estudiantes");
            System.out.println("2.- Listar los estudiantes guardados");
            System.out.print("Elige una opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:

                FileOutputStream fos = new FileOutputStream("estudiantes.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                try {

                    int id = 0;
                    String nombre = "";
                    int edad = 0;

                    System.out.print("ID del estudiante: ");
                    id = input.nextInt();
                    System.out.print("Nombre del estudiante: ");
                    input.nextLine();
                    nombre = input.nextLine();
                    System.out.print("Edad del estudiante: ");
                    edad = input.nextInt();

                    Estudiante e = new Estudiante(id, nombre, edad);

                    oos.writeObject(e);

                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                finally {
                    try {
                        oos.close();
                        fos.close();
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                    break;

                case 2:

                    FileInputStream fis = new FileInputStream("estudiantes.dat");
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    try {

                        while (fis.available() > 0) {
                            Estudiante e2 = (Estudiante)ois.readObject();
    
                            System.out.println(e2);
                        }
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    finally {
                        try {
                            ois.close();
                            fis.close();
                        }
                        catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    break;

                case 0:

                    System.out.println("¡Gracias por usar el programa!");

                    break;

                default:

                    System.out.println("Error al seleccionar opción");
                    input.nextInt();

                    break;
            }

        } while (opcion != 0);

        input.close();
    }
}
