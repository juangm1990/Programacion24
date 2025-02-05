package SegundoTrimestre.EjerciciosClase.Tema13_ArchivosBinario.ArchivosBinario_Producto1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int opcion = 0;

        do {

            System.out.println("FICHERO BINARIO");
            System.out.println("0| Salir");
            System.out.println("1| Agregar producto");
            System.out.println("2| Buscar producto");
            System.out.println("3| Listar productos");
            System.out.println("4| Eliminar producto");
            System.out.println("5| Cambiar producto");
            System.out.println("----------------------------");
            System.out.println("Por favor, elige una opción:");
            System.out.println("----------------------------");
            opcion = input.nextInt();

            switch (opcion) {

                case 1:

                    FileOutputStream fos = null;
                    ObjectOutputStream oos = null;

                    try {
                        fos = new FileOutputStream("productos.dat", true);
                        oos = new ObjectOutputStream(fos);

                        System.out.println("Introduce el id ");
                        int id = input.nextInt();
                        System.out.println("Introduce el nombre ");
                        input.next();  // Limpiar el buffer
                        String nombre = input.nextLine();
                        System.out.println("Introduce el precio ");
                        double precio = input.nextDouble();
                        System.out.println("Introduce la cantidad ");
                        int cantidad = input.nextInt();

                        Producto p = new Producto(id, nombre, precio, cantidad);

                        oos.writeObject(p);

                    } catch (Exception e) {
                        System.out.println(e.getMessage());

                    } finally {
                        try {
                            oos.close();
                            fos.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    break;

                case 2:

                    System.out.println("Introduce la id del producto a buscar ");
                    int id = input.nextInt();

                    FileInputStream fis2 = null;
                    ObjectInputStream ois2 = null;

                    try {

                        fis2 = new FileInputStream("productos.dat");

                        while (fis2.available() > 0) {
                            ois2 = new ObjectInputStream(fis2);
                            Producto p = (Producto) ois2.readObject();

                            if (p.getId() == id) {
                                System.out.println(p);
                            }
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());

                    } finally {
                        try {
                            fis2.close();
                            ois2.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    break;

                case 3:

                    FileInputStream fis = null;
                    ObjectInputStream ois = null;

                    try {

                        fis = new FileInputStream("productos.dat");

                        while (fis.available() > 0) {
                            ois = new ObjectInputStream(fis);
                            System.out.println((Producto) ois.readObject());
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());

                    } finally {
                        try {
                            fis.close();
                            ois.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;

                case 4:
                    // Eliminar producto
                    System.out.println("Introduce el id del producto a eliminar:");
                    int idEliminar = input.nextInt();

                    // Listar productos para verificar
                    FileInputStream fisEliminar = null;
                    ObjectInputStream oisEliminar = null;
                    FileOutputStream fosEliminar = null;
                    ObjectOutputStream oosEliminar = null;
                    boolean encontrado = false;

                    try {
                        fisEliminar = new FileInputStream("productos.dat");
                        oisEliminar = new ObjectInputStream(fisEliminar);
                        // Crear una lista temporal para almacenar los productos no eliminados
                        ArrayList<Producto> productos = new ArrayList<>();

                        while (fisEliminar.available() > 0) {
                            Producto p = (Producto) oisEliminar.readObject();
                            if (p.getId() != idEliminar) {
                                productos.add(p);  // Solo agregamos productos que no coincidan con el id
                            } else {
                                encontrado = true; // Si encontramos el producto, lo marcamos
                            }
                        }

                        if (encontrado) {
                            // Escribir los productos restantes en el archivo
                            fosEliminar = new FileOutputStream("productos.dat");
                            oosEliminar = new ObjectOutputStream(fosEliminar);

                            for (Producto p : productos) {
                                oosEliminar.writeObject(p);
                            }
                            System.out.println("Producto eliminado con éxito.");
                        } else {
                            System.out.println("Producto no encontrado.");
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        try {
                            /* Si intentamos cerrar un flujo de entrada o salida que no ha sido abierto
                            (es decir, que es null), se produciría una excepción de tipo NullPointerException.
                             */
                            if (fisEliminar != null) fisEliminar.close();
                            if (oisEliminar != null) oisEliminar.close();
                            if (fosEliminar != null) fosEliminar.close();
                            if (oosEliminar != null) oosEliminar.close();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;

                case 5:
                    // Cambiar producto
                    System.out.println("Introduce el id del producto a cambiar:");
                    int idCambiar = input.nextInt();

                    FileInputStream fisCambiar = null;
                    ObjectInputStream oisCambiar = null;
                    FileOutputStream fosCambiar = null;
                    ObjectOutputStream oosCambiar = null;
                    boolean productoEncontrado = false;

                    try {
                        fisCambiar = new FileInputStream("productos.dat");
                        oisCambiar = new ObjectInputStream(fisCambiar);

                        // Crear una lista temporal para almacenar los productos modificados
                        ArrayList<Producto> productos = new ArrayList<>();

                        while (fisCambiar.available() > 0) {
                            Producto p = (Producto) oisCambiar.readObject();

                            // Si el ID coincide, cambiar los datos del producto
                            if (p.getId() == idCambiar) {
                                productoEncontrado = true;

                                // Pedir los nuevos datos al usuario
                                System.out.println("Producto encontrado: " + p);
                                System.out.println("Introduce el nuevo nombre:");
                                input.nextLine();  // Limpiar el buffer
                                String nuevoNombre = input.nextLine();
                                System.out.println("Introduce el nuevo precio:");
                                double nuevoPrecio = input.nextDouble();
                                System.out.println("Introduce la nueva cantidad:");
                                int nuevaCantidad = input.nextInt();

                                // Actualizar el producto con los nuevos datos
                                p.setNombre(nuevoNombre);
                                p.setPrecio(nuevoPrecio);
                                p.setCantidad(nuevaCantidad);
                            }

                            // Agregar el producto (modificado o no) a la lista
                            productos.add(p);
                        }

                        if (productoEncontrado) {
                            // Reescribir los productos en el archivo con el producto modificado
                            fosCambiar = new FileOutputStream("productos.dat");
                            oosCambiar = new ObjectOutputStream(fosCambiar);

                            for (Producto p : productos) {
                                oosCambiar.writeObject(p);
                            }
                            System.out.println("Producto actualizado con éxito.");
                        } else {
                            System.out.println("Producto no encontrado.");
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        try {
                            if (fisCambiar != null) fisCambiar.close();
                            if (oisCambiar != null) oisCambiar.close();
                            if (fosCambiar != null) fosCambiar.close();
                            if (oosCambiar != null) oosCambiar.close();
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




