package SegundoTrimestre.Discord.ArchivosBinario_Estudiantes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.ArrayList;

public class GestionEstudiantes {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("GESTIÓN DE ESTUDIANTES");
            System.out.println("0| Salir");
            System.out.println("1| Agregar estudiante");
            System.out.println("2| Buscar estudiante");
            System.out.println("3| Listar estudiantes");
            System.out.println("4| Eliminar estudiante");
            System.out.println("5| Cambiar edad del estudiante");
            System.out.println("6| Cambiar ID del estudiante");
            System.out.println("7| Calcular la media de edades");
            System.out.println("8| Ordenar estudiantes por edad");
            System.out.println("----------------------------");
            System.out.println("Por favor, elige una opción:");
            System.out.println("----------------------------");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    agregarEstudiante(input);
                    break;
                case 2:
                    buscarEstudiante(input);
                    break;
                case 3:
                    listarEstudiantes();
                    break;
                case 4:
                    eliminarEstudiante(input);
                    break;
                case 5:
                    cambiarEdad(input); // Cambiar edad del estudiante
                    break;
                case 6:
                    cambiarID(input); // Cambiar ID del estudiante
                    break;
                case 7:
                    calcularMediaEdades();
                    break;
                case 8:
                    ordenarEstudiantesPorEdad();
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

    // Función para agregar un estudiante
    private static void agregarEstudiante(Scanner input) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("estudiantes.dat", true);
            oos = new ObjectOutputStream(fos);

            System.out.println("Introduce el id ");
            int id = input.nextInt();
            System.out.println("Introduce el nombre ");
            input.nextLine(); // Limpiar buffer
            String nombre = input.nextLine();
            System.out.println("Introduce la edad ");
            int edad = input.nextInt();

            Estudiante e = new Estudiante(id, nombre, edad);
            oos.writeObject(e);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
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

    // Función para buscar un estudiante por su ID
    private static void buscarEstudiante(Scanner input) {
        System.out.println("Introduce el id del estudiante a buscar ");
        int id = input.nextInt();

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("estudiantes.dat");

            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                Estudiante e = (Estudiante) ois.readObject();

                if (e.getId() == id) {
                    System.out.println(e);
                }
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

    // Función para listar todos los estudiantes
    private static void listarEstudiantes() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("estudiantes.dat");

            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                Estudiante e = (Estudiante) ois.readObject();
                System.out.println(e);
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

    // Función para eliminar un estudiante por su ID
    private static void eliminarEstudiante(Scanner input) {
        System.out.println("Introduce el id del estudiante a eliminar:");
        int idEliminar = input.nextInt();

        FileInputStream fisEliminar = null;
        ObjectInputStream oisEliminar = null;
        FileOutputStream fosEliminar = null;
        ObjectOutputStream oosEliminar = null;
        boolean encontrado = false;

        try {
            fisEliminar = new FileInputStream("estudiantes.dat");
            oisEliminar = new ObjectInputStream(fisEliminar);
            ArrayList<Estudiante> estudiantes = new ArrayList<>();

            while (fisEliminar.available() > 0) {
                Estudiante e = (Estudiante) oisEliminar.readObject();
                if (e.getId() != idEliminar) {
                    estudiantes.add(e);
                } else {
                    encontrado = true;
                }
            }

            if (encontrado) {
                fosEliminar = new FileOutputStream("estudiantes.dat");
                oosEliminar = new ObjectOutputStream(fosEliminar);

                for (Estudiante e : estudiantes) {
                    oosEliminar.writeObject(e);
                }
                System.out.println("Estudiante eliminado con éxito.");
            } else {
                System.out.println("Estudiante no encontrado.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
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

    // Función para cambiar la edad de un estudiante por su ID
    private static void cambiarEdad(Scanner input) {
        System.out.println("Introduce el id del estudiante a cambiar la edad:");
        int idCambiar = input.nextInt();

        FileInputStream fisCambiar = null;
        ObjectInputStream oisCambiar = null;
        FileOutputStream fosCambiar = null;
        ObjectOutputStream oosCambiar = null;
        boolean estudianteEncontrado = false;

        try {
            fisCambiar = new FileInputStream("estudiantes.dat");
            oisCambiar = new ObjectInputStream(fisCambiar);

            ArrayList<Estudiante> estudiantes = new ArrayList<>();

            while (fisCambiar.available() > 0) {
                Estudiante e = (Estudiante) oisCambiar.readObject();

                if (e.getId() == idCambiar) {
                    estudianteEncontrado = true;

                    System.out.println("Estudiante encontrado: " + e);
                    System.out.println("Introduce la nueva edad:");
                    int nuevaEdad = input.nextInt();
                    e.setEdad(nuevaEdad);
                }

                estudiantes.add(e);
            }

            if (estudianteEncontrado) {
                fosCambiar = new FileOutputStream("estudiantes.dat");
                oosCambiar = new ObjectOutputStream(fosCambiar);

                for (Estudiante e : estudiantes) {
                    oosCambiar.writeObject(e);
                }
                System.out.println("Edad actualizada con éxito.");
            } else {
                System.out.println("Estudiante no encontrado.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
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
        }
    }

    // Función para cambiar el ID de un estudiante por su ID
    private static void cambiarID(Scanner input) {
        System.out.println("Introduce el id del estudiante a cambiar:");
        int idCambiar = input.nextInt();

        FileInputStream fisCambiar = null;
        ObjectInputStream oisCambiar = null;
        FileOutputStream fosCambiar = null;
        ObjectOutputStream oosCambiar = null;
        boolean estudianteEncontrado = false;

        try {
            fisCambiar = new FileInputStream("estudiantes.dat");
            oisCambiar = new ObjectInputStream(fisCambiar);

            ArrayList<Estudiante> estudiantes = new ArrayList<>();

            while (fisCambiar.available() > 0) {
                Estudiante e = (Estudiante) oisCambiar.readObject();

                if (e.getId() == idCambiar) {
                    estudianteEncontrado = true;

                    System.out.println("Estudiante encontrado: " + e);
                    System.out.println("Introduce el nuevo ID:");
                    int nuevoID = input.nextInt();
                    e.setId(nuevoID);
                }

                estudiantes.add(e);
            }

            if (estudianteEncontrado) {
                fosCambiar = new FileOutputStream("estudiantes.dat");
                oosCambiar = new ObjectOutputStream(fosCambiar);

                for (Estudiante e : estudiantes) {
                    oosCambiar.writeObject(e);
                }
                System.out.println("ID actualizado con éxito.");
            } else {
                System.out.println("Estudiante no encontrado.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
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
        }
    }

    // Función para calcular la media de edades de los estudiantes
    private static void calcularMediaEdades() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        double sumaEdades = 0;
        int cantidadEstudiantes = 0;

        try {
            fis = new FileInputStream("estudiantes.dat");
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                Estudiante e = (Estudiante) ois.readObject();

                sumaEdades += e.getEdad();
                cantidadEstudiantes++;
            }

            if (cantidadEstudiantes > 0) {
                double mediaEdades = sumaEdades / cantidadEstudiantes;
                System.out.println("La media de edades de los estudiantes es: " + mediaEdades);
            } else {
                System.out.println("No hay estudiantes en el archivo.");
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

    // Función para ordenar los estudiantes por edad
    private static void ordenarEstudiantesPorEdad() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        try {
            fis = new FileInputStream("estudiantes.dat");

            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                Estudiante e = (Estudiante) ois.readObject();
                estudiantes.add(e);
            }

            estudiantes.sort((e1, e2) -> Integer.compare(e1.getEdad(), e2.getEdad()));

            System.out.println("Estudiantes ordenados por edad:");
            for (Estudiante e : estudiantes) {
                System.out.println(e);
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
}
