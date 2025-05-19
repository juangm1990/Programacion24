package SegundoTrimestre.TareasPracticas.Tema13_FicherosBinarios.ArchivosBinario_Producto2;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("Ficheros Binarios");
            System.out.println("1.Agregar producto");
            System.out.println("2.Buscar producto");
            System.out.println("3. Listar Productos");
            System.out.println("4.Borrar producto");
            System.out.println("5.Actualizar un producto");
            System.out.println("0.Salir");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    agregarProducto(sc);
                    break;
                case 2:
                    buscarProducto(sc);
                    break;
                case 3:
                    listarProductos();
                    break;
                case 4:
                    borrarProducto(sc);
                    break;
                case 5:
                    actualizarProducto(sc);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (option != 0);

        sc.close();
    }

    private static void agregarProducto(Scanner sc) {
        ArrayList<Producto> productos = new ArrayList<>();
        File file = new File("prueba.dat");

        // Leer productos existentes
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                while (true) {
                    try {
                        productos.add((Producto) ois.readObject());
                    } catch (EOFException e) {
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error al leer productos: " + e.getMessage());
            }
        }

        System.out.println("Introduce un id");
        int id = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea
        System.out.println("Introduce un nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce un precio");
        double precio = sc.nextDouble();
        System.out.println("Introduce una cantidad");
        int cantidad = sc.nextInt();

        // Verificar si la ID ya existe
        for (Producto p : productos) {
            if (p.getId() == id) {
                System.out.println("Error: La ID ya existe. No se añadirá el producto.");
                return;
            }
        }

        // Agregar el nuevo producto
        productos.add(new Producto(id, nombre, precio, cantidad));

        // Guardar productos en el archivo
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            for (Producto p : productos) {
                oos.writeObject(p);
            }
            System.out.println("Producto agregado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al guardar productos: " + e.getMessage());
        }
    }

    private static void buscarProducto(Scanner sc) {
        System.out.println("Introduce el id a buscar");
        int idBuscar = sc.nextInt();
        boolean encontrado = false;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("prueba.dat"))) {
            while (true) {
                try {
                    Producto p = (Producto) ois.readObject();
                    if (p.getId() == idBuscar) {
                        System.out.println(p);
                        encontrado = true;
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer productos: " + e.getMessage());
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void listarProductos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("prueba.dat"))) {
            while (true) {
                try {
                    System.out.println((Producto) ois.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("No se encontraron productos o hubo un error: " + e.getMessage());
        }
    }

    private static void borrarProducto(Scanner sc) {
        System.out.println("Introduce el id del producto a borrar");
        int idBorrar = sc.nextInt();
        ArrayList<Producto> productos = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("prueba.dat"))) {
            while (true) {
                try {
                    Producto p = (Producto) ois.readObject();
                    if (p.getId() != idBorrar) {
                        productos.add(p);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer productos: " + e.getMessage());
        }

        // Guardar la lista sin el producto eliminado
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("prueba.dat"))) {
            for (Producto p : productos) {
                oos.writeObject(p);
            }
            System.out.println("Producto eliminado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al guardar productos: " + e.getMessage());
        }
    }

    private static void actualizarProducto(Scanner sc) {
        System.out.println("Introduce el id del producto a actualizar");
        int idActualizar = sc.nextInt();
        ArrayList<Producto> productos = new ArrayList<>();
        boolean actualizado = false;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("prueba.dat"))) {
            while (true) {
                try {
                    Producto p = (Producto) ois.readObject();
                    if (p.getId() == idActualizar) {
                        sc.nextLine(); // Consumir el salto de línea
                        System.out.println("Introduce el nuevo nombre");
                        String nombre = sc.nextLine();
                        System.out.println("Introduce el nuevo precio");
                        double precio = sc.nextDouble();
                        System.out.println("Introduce la nueva cantidad");
                        int cantidad = sc.nextInt();
                        p = new Producto(idActualizar, nombre, precio, cantidad);
                        actualizado = true;
                    }
                    productos.add(p);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer productos: " + e.getMessage());
        }

        // Guardar la lista con el producto actualizado
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("prueba.dat"))) {
            for (Producto p : productos) {
                oos.writeObject(p);
            }
            if (actualizado) {
                System.out.println("Producto actualizado correctamente.");
            } else {
                System.out.println("No se encontró un producto con esa ID.");
            }
        } catch (Exception e) {
            System.out.println("Error al guardar productos: " + e.getMessage());
        }
    }
}