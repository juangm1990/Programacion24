package SegundoTrimestre.Examenes.Practica9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Migrar {
    public static void main(String[] args) throws Exception {
        
        migrarAlumnos();
        migrarNotas();

        Scanner input = new Scanner(System.in);

        int opcion = 0;

        do {

            System.out.println("1.- Mostrar Fichero Alumnos");
            System.out.println("2.- Mostrar Fichero Notas");
            System.out.println("3.- Mostrar Fichero Notas Medias");
            System.out.println("4.- Calcular Notas Medias");
            System.out.println("0.- Salir");
            System.out.print("Elige una opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:

                    listarAlumnos();
                    
                    break;

                case 2:

                    listarNotas();
                    
                    break;

                case 3:

                    listarNotasMedias();
                    
                    break;

                case 4:

                    calcularNotasMedias();
                    
                    break;

                case 0:
                    
                    System.out.println("¡Gracias por usar el programa!");

                    break;
            
                default:

                    System.out.println("Error al seleccionar opción");
                    input.nextInt();

                    break;
            }

        } while(opcion != 0);

        input.close();
    }

    public static void migrarAlumnos() {

        FileReader fr = null;
        BufferedReader br = null;

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fr = new FileReader("SegundoTrimestre/Examenes/Practica9/alumnos.txt");
            br = new BufferedReader(fr);

            fos = new FileOutputStream("alumnos.dat");
            oos = new ObjectOutputStream(fos);

            String linea = br.readLine();

            while ((linea = br.readLine()) != null) {

                int id = Integer.parseInt(linea.charAt(0) + "" + linea.charAt(1));

                String nombre1 = "";

                for (int i = 4; i < 9; i++) {
                    nombre1 += linea.charAt(i);
                }

                String nombre2 = "";

                for (int i = 15; i < 24; i++) {
                    nombre2 += linea.charAt(i);
                }

                String apellido1 = "";

                for (int i = 29; i < 38; i++) {
                    apellido1 += linea.charAt(i);
                }

                String apellido2 = "";

                for (int i = 45; i < 54; i++) {
                    apellido2 += linea.charAt(i);
                }

                String email = "";

                for (int i = 59; i < 85; i++) {
                    email += linea.charAt(i);
                }

                String telefono = "";

                for (int i = 91; i < 103; i++) {
                    telefono += linea.charAt(i);
                }

                Alumno a = new Alumno(id, nombre1, nombre2, apellido1, apellido2, email, telefono);

                oos.writeObject(a);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                br.close();
                fr.close();

                oos.close();
                fos.close();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void migrarNotas() {

        FileReader fr2 = null;
        BufferedReader br2 = null;

        FileOutputStream fos2 = null;
        ObjectOutputStream oos2 = null;

        try {
            fr2 = new FileReader("SegundoTrimestre/Examenes/Practica9/notas.txt");
            br2 = new BufferedReader(fr2);

            fos2 = new FileOutputStream("notas.dat");
            oos2 = new ObjectOutputStream(fos2);

            String linea = br2.readLine();

            while ((linea = br2.readLine()) != null) {

                int id = Integer.parseInt(linea.charAt(0) + "" + linea.charAt(1));
                int nota1 = Integer.parseInt(linea.charAt(4) + "" + linea.charAt(5));
                int nota2 = Integer.parseInt(linea.charAt(8) + "" + linea.charAt(9));
                int nota3 = Integer.parseInt(linea.charAt(12) + "" + linea.charAt(13));
                int nota4 = Integer.parseInt(linea.charAt(16) + "" + linea.charAt(17));
                int nota5 = Integer.parseInt(linea.charAt(20) + "" + linea.charAt(21));
                int nota6 = Integer.parseInt(linea.charAt(24) + "" + linea.charAt(25));

                Nota a = new Nota(id, nota1, nota2, nota3, nota4, nota5, nota6);

                oos2.writeObject(a);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                br2.close();
                fr2.close();

                oos2.close();
                fos2.close();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void listarAlumnos() {

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            fis = new FileInputStream("alumnos.dat");
            ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                Alumno e = (Alumno)ois.readObject();

                System.out.println(e);
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
    }

    public static void listarNotas() {

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            fis = new FileInputStream("notas.dat");
            ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                Nota n = (Nota)ois.readObject();

                System.out.println(n);
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
    }

    public static void listarNotasMedias() {

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            fis = new FileInputStream("notasMedias.dat");
            ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                NotaMedia nM = (NotaMedia)ois.readObject();

                System.out.println(nM);
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
    }

    public static void calcularNotasMedias() {

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {

            fis = new FileInputStream("notas.dat");
            ois = new ObjectInputStream(fis);

            fos = new FileOutputStream("notasMedias.dat");
            oos = new ObjectOutputStream(fos);

            while (fis.available() > 0) {

                Nota n = (Nota)ois.readObject();

                int notaMedia = ((n.getNota1() + n.getNota2() + n.getNota3() + n.getNota4() + n.getNota5() + n.getNota6()) / 6);

                NotaMedia nM = new NotaMedia(n.getId(), sacarEmail(n.getId()), notaMedia);

                oos.writeObject(nM);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                ois.close();
                fis.close();

                oos.close();
                fos.close();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String sacarEmail(int i) {

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        String email = "";

        try {

            fis = new FileInputStream("alumnos.dat");
            ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {

                Alumno a = (Alumno)ois.readObject();

                if (a.getId() == i) {
                    email = a.getEmail();
                }
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

        return email;
    }
}
