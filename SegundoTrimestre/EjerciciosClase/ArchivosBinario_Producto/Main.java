package SegundoTrimestre.EjerciciosClase.ArchivosBinario_Producto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    
        public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int opcion = 0;

        do {

            System.out.println("FICHERO BINARIO");
            System.out.println("0| Salir");
            System.out.println("1| Agregar producto");
            System.out.println("2| Buscar producto");
            System.out.println("3| Listar producto");
            System.out.println("----------------------------");
            System.out.println("Por favor, elige una opción:");
            System.out.println("----------------------------");
            opcion = input.nextInt();

            switch (opcion) {

                case 1:
                
                FileOutputStream fos = null;
                ObjectOutputStream oos = null;
        
                try{

                    fos = new FileOutputStream("productos.dat", true);
                    oos = new ObjectOutputStream(fos);

                    System.out.println("Introduce el id ");
                    int id=input.nextInt();
                    System.out.println("Introduce el nombre ");
                    input.next();
                    String nombre=input.nextLine();
                    System.out.println("Introduce el precio ");
                    double precio = input.nextDouble(); 
                    System.out.println("Introduce el cantidad ");
                    int cantidad= input.nextInt();

                    Producto p = new Producto(id, nombre, precio, cantidad);

                    oos.writeObject(p);
        
                } catch (Exception e){
                    System.out.println(e.getMessage());

                } finally {
                    try {
                        oos.close();
                        fos.close();
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }

                    break;

                case 2:

                System.out.println("Introduce la id del prodcuto buscar ");
                int id = input.nextInt();

                FileInputStream fis2 = null;
                ObjectInputStream ois2 = null;
        
                try{

                    fis2 = new FileInputStream("productos.dat");
                    
                   
                    while (fis2.available()>0) {
                        ois2 = new ObjectInputStream(fis2);
                        Producto p = (Producto)ois2.readObject();
                        
                        if (p.getId() == id) {
                            System.out.println(p);
                        }
                    } 
        
                } catch (Exception e){
                    System.out.println(e.getMessage());
        
                } finally {
                    try {
                        fis2.close();
                        ois2.close();
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }

                    break;

                case 3:

                FileInputStream fis = null;
                ObjectInputStream ois = null;
        
                try{

                    fis = new FileInputStream("productos.dat");
                   
                    while (fis.available()>0) {
                        ois = new ObjectInputStream(fis);
                        System.out.println((Producto)ois.readObject());
                    }
        
                } catch (Exception e){
                    System.out.println(e.getMessage());
        
                } finally {
                    try {
                        fis.close();
                        ois.close();
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
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





 
    
}
