package SegundoTrimestre.EjerciciosExtra.ArchivoBinario_ModificarArchivo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        // Crear un objeto Scanner para la entrada de datos desde la consola
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        do {
            // Mostrar las opciones disponibles para el usuario
            System.out.println("FICHERO BINARIO");
            System.out.println("0| Salir");
            System.out.println("1| Agregar producto");
            System.out.println("2| Buscar producto");
            System.out.println("3| Listar productos");
            System.out.println("4| Eliminar producto");
            System.out.println("5| Cambiar producto");
            System.out.println("6| Calcular media productos");
            System.out.println("7| Ordenar productos por precio");
            System.out.println("----------------------------");
            System.out.println("Por favor, elige una opción:");
            System.out.println("----------------------------");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    agregarProducto(input);
                    break;
                case 2:
                    buscarProducto(input);
                    break;
                case 3:
                    listarProductos();
                    break;
                case 4:
                    eliminarProducto(input);
                    break;
                case 5:
                    cambiarProducto(input);
                    break;
                case 6:
                    calcularMediaPrecios();
                    break;
                case 7:
                    ordenarProductosPorPrecio();
                    break;
                case 0:
                    System.out.println("¡Gracias y hasta pronto! Programa finalizado");
                    break;
                default:
                    System.out.println("Ha ocurrido un error en el programa");
                    break;
            }

        } while (opcion != 0); // El ciclo se repite hasta que la opción elegida sea 0 (salir)

        input.close(); // Cerrar el objeto Scanner después de su uso
    }

    // Función para agregar un producto a un archivo binario
    private static void agregarProducto(Scanner input) {
        FileOutputStream fos = null; // Flujo de salida para escribir el archivo
        ObjectOutputStream oos = null; // Flujo de salida para escribir objetos

        try {
            // Abrir el archivo en modo append (agregar al final) para no sobrescribir los
            // datos
            fos = new FileOutputStream("productos.dat", true);
            oos = new ObjectOutputStream(fos);

            // Solicitar los detalles del producto al usuario
            System.out.println("Introduce el id ");
            int id = input.nextInt();
            System.out.println("Introduce el nombre ");
            input.next(); // Limpiar el buffer de entrada
            String nombre = input.nextLine();
            System.out.println("Introduce el precio ");
            double precio = input.nextDouble();
            System.out.println("Introduce la cantidad ");
            int cantidad = input.nextInt();

            // Crear un objeto Producto con los datos proporcionados y escribirlo en el
            // archivo
            Producto p = new Producto(id, nombre, precio, cantidad);
            oos.writeObject(p); // Escribir el objeto Producto en el archivo binario

        } catch (Exception e) {
            System.out.println(e.getMessage()); // Capturar y mostrar cualquier excepción ocurrida

        } finally {
            // Cierre de los flujos de salida en el bloque finally para asegurar que los
            // recursos se liberen
            try {
                if (oos != null) {
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Función para buscar un producto en el archivo binario por su ID
    private static void buscarProducto(Scanner input) {
        System.out.println("Introduce la id del producto a buscar ");
        int id = input.nextInt(); // Solicitar el ID del producto a buscar

        FileInputStream fis2 = null; // Flujo de entrada para leer el archivo
        ObjectInputStream ois2 = null; // Flujo de entrada para leer objetos

        try {
            fis2 = new FileInputStream("productos.dat"); // Abrir el archivo para lectura

            // Iterar sobre los productos en el archivo
            while (fis2.available() > 0) {
                ois2 = new ObjectInputStream(fis2);
                Producto p = (Producto) ois2.readObject();

                // Si el ID del producto coincide con el solicitado, mostrarlo
                if (p.getId() == id) {
                    System.out.println(p);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage()); // Capturar cualquier error que ocurra

        } finally {
            // Asegurarse de cerrar los flujos de entrada
            try {
                if (fis2 != null) {
                    fis2.close();
                }
                if (ois2 != null) {
                    ois2.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Función para listar todos los productos en el archivo
    private static void listarProductos() {
        FileInputStream fis = null; // Flujo de entrada para leer el archivo
        ObjectInputStream ois = null; // Flujo de entrada para leer objetos

        try {
            fis = new FileInputStream("productos.dat"); // Abrir el archivo para lectura

            // Leer y mostrar todos los productos del archivo
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                System.out.println((Producto) ois.readObject());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage()); // Capturar cualquier error que ocurra

        } finally {
            // Asegurarse de cerrar los flujos de entrada
            try {
                if (fis != null) {
                    fis.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Función para eliminar un producto por ID
    private static void eliminarProducto(Scanner input) {
        System.out.println("Introduce el id del producto a eliminar:");
        int idEliminar = input.nextInt();

        // Flujos de entrada y salida para leer y escribir en el archivo
        FileInputStream fisEliminar = null;
        ObjectInputStream oisEliminar = null;
        FileOutputStream fosEliminar = null;
        ObjectOutputStream oosEliminar = null;
        boolean encontrado = false;

        try {
            fisEliminar = new FileInputStream("productos.dat");
            oisEliminar = new ObjectInputStream(fisEliminar);
            ArrayList<Producto> productos = new ArrayList<>();

            // Leer productos y añadir los no eliminados a la lista
            while (fisEliminar.available() > 0) {
                Producto p = (Producto) oisEliminar.readObject();
                if (p.getId() != idEliminar) {
                    productos.add(p);
                } else {
                    encontrado = true;
                }
            }

            // Reescribir los productos sin el eliminado
            if (encontrado) {
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
            System.out.println(e.getMessage()); // Capturar cualquier error que ocurra
        } finally {
            // Asegurarse de cerrar los flujos de entrada y salida
            try {
                if (fisEliminar != null) {
                    fisEliminar.close();
                }
                if (oisEliminar != null) {
                    oisEliminar.close();
                }
                if (fosEliminar != null) {
                    fosEliminar.close();
                }
                if (oosEliminar != null) {
                    oosEliminar.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Función para cambiar la información de un producto por su ID
    private static void cambiarProducto(Scanner input) {
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

            ArrayList<Producto> productos = new ArrayList<>();

            // Leer los productos y modificar el seleccionado
            while (fisCambiar.available() > 0) {
                Producto p = (Producto) oisCambiar.readObject();

                if (p.getId() == idCambiar) {
                    productoEncontrado = true;

                    System.out.println("Producto encontrado: " + p);
                    System.out.println("Introduce el nuevo nombre:");
                    input.nextLine(); // Limpiar el buffer
                    String nuevoNombre = input.nextLine();
                    System.out.println("Introduce el nuevo precio:");
                    double nuevoPrecio = input.nextDouble();
                    System.out.println("Introduce la nueva cantidad:");
                    int nuevaCantidad = input.nextInt();

                    // Actualizar los datos del producto
                    p.setNombre(nuevoNombre);
                    p.setPrecio(nuevoPrecio);
                    p.setCantidad(nuevaCantidad);
                }

                productos.add(p);
            }

            // Guardar los productos actualizados
            if (productoEncontrado) {
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
            System.out.println(e.getMessage()); // Capturar cualquier error que ocurra
        } finally {
            // Asegurarse de cerrar los flujos de entrada y salida
            try {
                if (fisCambiar != null) {
                    fisCambiar.close();
                }
                if (oisCambiar != null) {
                    oisCambiar.close();
                }
                if (fosCambiar != null) {
                    fosCambiar.close();
                }
                if (oosCambiar != null) {
                    oosCambiar.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            // Los productos sin el que ha sido eliminado). No es necesario usar .delete() 
            // El archivo no se elimina físicamente, sino que se reescribe con los datos actualizados.
        }
    }

    // Función para calcular la media de precios de todos los productos en el archivo
    private static void calcularMediaPrecios() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        double sumaPrecios = 0;
        int cantidadProductos = 0;

        try {
            fis = new FileInputStream("productos.dat"); // Abrir el archivo para lectura
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                Producto p = (Producto) ois.readObject(); // Leer el objeto Producto

                sumaPrecios = sumaPrecios + p.getPrecio(); // Sumar el precio del producto
                cantidadProductos++; // Incrementar el contador de productos
            }

            // Calcular y mostrar la media de los precios
            if (cantidadProductos > 0) {
                double mediaPrecios = sumaPrecios / cantidadProductos;
                System.out.println("La media de los precios de los productos es: " + mediaPrecios);
            } else {
                System.out.println("No hay productos en el archivo.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


    // Función para ordenar los productos por precio
    private static void ordenarProductosPorPrecio() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        ArrayList<Producto> productos = new ArrayList<>();
        
        try {
            fis = new FileInputStream("productos.dat");  // Abrir el archivo para lectura

            // Leer todos los productos y almacenarlos en la lista
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                Producto p = (Producto) ois.readObject();
                productos.add(p);
            }

            // Ordenar la lista de productos por precio (de menor a mayor)
            // productos.sort((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()));
            // Ordenar la lista de productos por precio (de mayor a menor)
            productos.sort((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()));
            

            // Mostrar los productos ordenados
            System.out.println("Productos ordenados por precio:");
            for (Producto p : productos) {
                System.out.println(p);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());  // Capturar cualquier error que ocurra
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
