package SegundoTrimestre.ArchivosBinarios.Alumno_Full;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class App {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("GESTIÓN DE ESTUDIANTES");
            System.out.println("0| Salir");
            System.out.println("1| Agregar estudiante");
            System.out.println("2| Listar estudiantes");
            System.out.println("3| Agregar nota");
            System.out.println("4| Listar notas");
            System.out.println("5| Listar TODO");
            System.out.println("----------------------------------------------------------");
            System.out.println("6| Mostrar nota media de todas las notas");
            System.out.println("7| Mostrar las 3 notas más altas");
            System.out.println("8| Mostrar la nota media de las 3 notas más altas");
            System.out.println("9| Cambiar el nombre de un estudiante");
            System.out.println("10| Modificar la nota de una calificación");
            System.out.println("----------------------------------------------------------");
            System.out.println("11| Crear archivo estudiantes + notas");
            System.out.println("12| Mostrar archivo estudiantes + notas");
            System.out.println("13| Crear archivo con nombre del estudiante y nota");
            System.out.println("14| Mostrar archivo con nombre del estudiante y nota");
            System.out.println("----------------------------------------------------------");
            System.out.println("15| Crear archivo estudiantes ordenado de mayor a menor");
            System.out.println("16| Mostrar archivo estudiantes de mayor a menor");
            System.out.println("17| Crear archivo estudiantes ordenado de menor a mayor");
            System.out.println("18| Mostrar archivo estudiantes de menor a mayor");
            System.out.println("----------------------------------------------------------");
            System.out.println("19| Buscar estudiante por ID");
            System.out.println("20| Buscar nota por ID");
            System.out.println("21| Modificar estudiante por ID");
            System.out.println("22| Modificar nota por ID");
            System.out.print("Opción: ");

            opcion = input.nextInt();
            input.nextLine(); // limpiar salto

            switch (opcion) {
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    listarEstudiantes();
                    break;
                case 3:
                    agregarNota();
                    break;
                case 4:
                    listarNotas();
                    break;
                case 5:
                    listarTodo();
                    break;
                case 6:
                    mostrarNotaMediaGeneral();
                    break;
                case 7:
                    mostrarTresNotasMasAltas();
                    break;
                case 8:
                    mostrarMediaTresNotasMasAltas();
                    break;
                case 9:
                    cambiarNombreEstudiante();
                    break;
                case 10:
                    modificarNota();
                    break;
                case 11:
                    crearArchivoEstudiantesYNotas();
                    break;
                case 12:
                    mostrarArchivoEstudiantesYNotas();
                    break;
                case 13:
                    crearArchivoNombreYNota();
                    break;
                case 14:
                    mostrarArchivoNombreYNota();
                    break;
                case 15:
                    crearArchivoEstudiantesMayorAMenor();
                    break;
                case 16:
                    mostrarArchivoEstudiantesMayorAMenor();
                    break;
                case 17:
                    crearArchivoEstudiantesMenorAMayor();
                    break;
                case 18:
                    mostrarArchivoEstudiantesMenorAMayor();
                    break;
                case 19:
                    buscarEstudiantePorId();
                    break;
                case 20:
                    buscarNotaPorId();
                    break;
                case 21:
                    modificarEstudiantePorId();
                    break;
                case 22:
                    modificarNotaPorId();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }

    // AGREGAR ESTUDIANTES
    private static void agregarEstudiante() {
        ArrayList<Estudiante> estudiantes = cargarEstudiantes();

        System.out.print("Introduce el ID del estudiante: ");
        int id = input.nextInt();
        input.nextLine();

        for (Estudiante e : estudiantes) {
            if (e.getId() == id) {
                System.out.println("El ID ya existe.");
                return;
            }
        }

        System.out.print("Introduce el nombre: ");
        String nombre = input.nextLine();
        System.out.print("Introduce el email: ");
        String email = input.nextLine();

        estudiantes.add(new Estudiante(id, nombre, email));
        guardarEstudiantes(estudiantes);
        System.out.println("Estudiante añadido correctamente.");
    }

    // CARGAR ESTUDIANTES
    private static ArrayList<Estudiante> cargarEstudiantes() {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("estudiantes.dat");
            ois = new ObjectInputStream(fis);
            while (true) {
                try {
                    estudiantes.add((Estudiante) ois.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            // No hay fichero aún
        } catch (Exception e) {
            System.out.println("Error al cargar estudiantes: " + e.getMessage());
        } finally {
            try {
                if (ois != null) ois.close();
                if (fis != null) fis.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
        return estudiantes;
    }

    // GUARDAR ESTUDIANTES
    private static void guardarEstudiantes(ArrayList<Estudiante> estudiantes) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("estudiantes.dat");
            oos = new ObjectOutputStream(fos);
            for (Estudiante e : estudiantes) {
                oos.writeObject(e);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar estudiantes: " + e.getMessage());
        } finally {
            try {
                if (oos != null) oos.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }

    // LISTAR ESTUDIANTES
    private static void listarEstudiantes() {
        ArrayList<Estudiante> estudiantes = cargarEstudiantes();
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.println("Lista de estudiantes:");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }

    // AGREGAR NOTAS
    private static void agregarNota() {
        ArrayList<Nota> notas = cargarNotas();

        System.out.print("Introduce el ID de la nota: ");
        int id = input.nextInt();
        input.nextLine();

        for (Nota n : notas) {
            if (n.getId() == id) {
                System.out.println("El ID ya existe.");
                return;
            }
        }

        System.out.print("Introduce el nombre del estudiante: ");
        String nombre = input.nextLine();
        System.out.print("Introduce la puntuación: ");
        int puntuacion = input.nextInt();

        notas.add(new Nota(id, nombre, puntuacion));
        guardarNotas(notas);
        System.out.println("Nota añadida correctamente.");
    }

    // CARGAR NOTAS
    private static ArrayList<Nota> cargarNotas() {
        ArrayList<Nota> notas = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("notas.dat");
            ois = new ObjectInputStream(fis);
            while (true) {
                try {
                    notas.add((Nota) ois.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            // No hay fichero aún
        } catch (Exception e) {
            System.out.println("Error al cargar notas: " + e.getMessage());
        } finally {
            try {
                if (ois != null) ois.close();
                if (fis != null) fis.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
        return notas;
    }

    // GUARDAR NOTAS
    private static void guardarNotas(ArrayList<Nota> notas) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("notas.dat");
            oos = new ObjectOutputStream(fos);
            for (Nota n : notas) {
                oos.writeObject(n);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar notas: " + e.getMessage());
        } finally {
            try {
                if (oos != null) oos.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }

    // LISTAR NOTAS
    private static void listarNotas() {
        ArrayList<Nota> notas = cargarNotas();
        if (notas.isEmpty()) {
            System.out.println("No hay notas registradas.");
            return;
        }

        System.out.println("Lista de notas:");
        for (Nota n : notas) {
            System.out.println(n);
        }
    }

    // LISTAR TODO (Estudiantes y Notas)
    private static void listarTodo() {
        System.out.println("----- ESTUDIANTES -----");
        listarEstudiantes();
        System.out.println("----- NOTAS -----");
        listarNotas();
    }

    // MOSTRAR NOTA MEDIA GENERAL
    private static void mostrarNotaMediaGeneral() {
        ArrayList<Nota> notas = cargarNotas();

        if (notas.isEmpty()) {
            System.out.println("No hay notas registradas.");
            return;
        }

        int suma = 0;
        for (Nota n : notas) {
            suma += n.getPuntuacion();
        }

        double media = (double) suma / notas.size();
        System.out.printf("Nota media general: %.2f%n", media);
    }

    // MOSTRAR LAS 3 NOTAS MÁS ALTAS
    private static void mostrarTresNotasMasAltas() {
        ArrayList<Nota> notas = cargarNotas();

        notas.sort((a, b) -> Integer.compare(b.getPuntuacion(), a.getPuntuacion()));

        System.out.println("Las 3 notas más altas:");
        for (int i = 0; i < Math.min(3, notas.size()); i++) {
            System.out.println(notas.get(i));
        }
    }

    // MOSTRAR MEDIA DE LAS 3 NOTAS MÁS ALTAS
    private static void mostrarMediaTresNotasMasAltas() {
        ArrayList<Nota> notas = cargarNotas();

        notas.sort((a, b) -> Integer.compare(b.getPuntuacion(), a.getPuntuacion()));

        int suma = 0;
        int total = Math.min(3, notas.size());

        for (int i = 0; i < total; i++) {
            suma += notas.get(i).getPuntuacion();
        }

        if (total > 0) {
            double media = (double) suma / total;
            System.out.printf("Media de las 3 notas más altas: %.2f%n", media);
        } else {
            System.out.println("No hay notas suficientes para calcular la media.");
        }
    }


    // CAMBIAR NOMBRE DE UN ESTUDIANTE
private static void cambiarNombreEstudiante() {
    ArrayList<Estudiante> estudiantes = cargarEstudiantes();

    System.out.print("Introduce el ID del estudiante: ");
    int id = input.nextInt();
    input.nextLine();

    boolean encontrado = false;

    for (Estudiante e : estudiantes) {
        if (e.getId() == id) {
            System.out.print("Introduce el nuevo nombre: ");
            String nuevoNombre = input.nextLine();
            e.setNombre(nuevoNombre);
            encontrado = true;
            break;
        }
    }

    if (encontrado) {
        guardarEstudiantes(estudiantes);
        System.out.println("Nombre actualizado correctamente.");
    } else {
        System.out.println("Estudiante no encontrado.");
    }
}

// MODIFICAR UNA NOTA
private static void modificarNota() {
    ArrayList<Nota> notas = cargarNotas();

    System.out.print("Introduce el ID de la nota a modificar: ");
    int id = input.nextInt();
    input.nextLine();

    boolean encontrado = false;

    for (Nota n : notas) {
        if (n.getId() == id) {
            System.out.print("Introduce el nuevo nombre: ");
            String nuevoNombre = input.nextLine();
            System.out.print("Introduce la nueva puntuación: ");
            int nuevaPuntuacion = input.nextInt();

            n.setNombre(nuevoNombre);
            n.setPuntuacion(nuevaPuntuacion);
            encontrado = true;
            break;
        }
    }

    if (encontrado) {
        guardarNotas(notas);
        System.out.println("Nota modificada correctamente.");
    } else {
        System.out.println("Nota no encontrada.");
    }
}

// CREAR ARCHIVO ESTUDIANTES + NOTAS
private static void crearArchivoEstudiantesYNotas() {
    ArrayList<Estudiante> estudiantes = cargarEstudiantes();
    ArrayList<Nota> notas = cargarNotas();

    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    try {
        fos = new FileOutputStream("relacionCompleta.dat");
        oos = new ObjectOutputStream(fos);
        for (Nota nota : notas) {
            for (Estudiante est : estudiantes) {
                if (nota.getId() == est.getId()) {
                    String linea = "ID: " + est.getId() + ", Nombre: " + est.getNombre()
                            + ", Email: " + est.getEmail()
                            + ", Nota: " + nota.getPuntuacion();
                    oos.writeObject(linea);
                }
            }
        }
        System.out.println("Archivo relacionCompleta.dat creado correctamente.");
    } catch (IOException e) {
        System.out.println("Error al crear archivo: " + e.getMessage());
    } finally {
        try {
            if (oos != null) oos.close();
            if (fos != null) fos.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo: " + e.getMessage());
        }
    }
}

// MOSTRAR ARCHIVO ESTUDIANTES + NOTAS
private static void mostrarArchivoEstudiantesYNotas() {
    FileInputStream fis = null;
    ObjectInputStream ois = null;

    try {
        fis = new FileInputStream("relacionCompleta.dat");
        ois = new ObjectInputStream(fis);
        System.out.println("Contenido de relacionCompleta.dat:");
        while (true) {
            try {
                String linea = (String) ois.readObject();
                System.out.println(linea);
            } catch (EOFException e) {
                break;
            }
        }
    } catch (IOException | ClassNotFoundException e) {
        System.out.println("Error al mostrar archivo: " + e.getMessage());
    } finally {
        try {
            if (ois != null) ois.close();
            if (fis != null) fis.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo: " + e.getMessage());
        }
    }
}

// CREAR ARCHIVO CON NOMBRE Y NOTA
private static void crearArchivoNombreYNota() {
    ArrayList<Estudiante> estudiantes = cargarEstudiantes();
    ArrayList<Nota> notas = cargarNotas();

    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    try {
        fos = new FileOutputStream("nombreYnota.dat");
        oos = new ObjectOutputStream(fos);
        for (Nota nota : notas) {
            for (Estudiante est : estudiantes) {
                if (est.getId() == nota.getId()) {
                    String linea = "Nombre: " + est.getNombre() + ", Nota: " + nota.getPuntuacion();
                    oos.writeObject(linea);
                }
            }
        }
        System.out.println("Archivo nombreYnota.dat creado correctamente.");
    } catch (IOException e) {
        System.out.println("Error al crear nombreYnota.dat: " + e.getMessage());
    } finally {
        try {
            if (oos != null) oos.close();
            if (fos != null) fos.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo: " + e.getMessage());
        }
    }
}

// MOSTRAR ARCHIVO CON NOMBRE Y NOTA
private static void mostrarArchivoNombreYNota() {
    FileInputStream fis = null;
    ObjectInputStream ois = null;

    try {
        fis = new FileInputStream("nombreYnota.dat");
        ois = new ObjectInputStream(fis);
        System.out.println("Contenido del archivo nombreYnota.dat:");
        while (true) {
            try {
                String linea = (String) ois.readObject();
                System.out.println(linea);
            } catch (EOFException e) {
                break;
            }
        }
    } catch (IOException | ClassNotFoundException e) {
        System.out.println("Error al leer nombreYnota.dat: " + e.getMessage());
    } finally {
        try {
            if (ois != null) ois.close();
            if (fis != null) fis.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo: " + e.getMessage());
        }
    }
}

// CREAR ARCHIVO ESTUDIANTES ORDENADO DE MAYOR A MENOR
private static void crearArchivoEstudiantesMayorAMenor() {
    ArrayList<Estudiante> estudiantes = cargarEstudiantes();

    estudiantes.sort((a, b) -> Integer.compare(b.getId(), a.getId()));

    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    try {
        fos = new FileOutputStream("estudiantesMayorAMenor.dat");
        oos = new ObjectOutputStream(fos);
        for (Estudiante e : estudiantes) {
            oos.writeObject(e);
        }
        System.out.println("Archivo estudiantesMayorAMenor.dat creado correctamente.");
    } catch (IOException e) {
        System.out.println("Error al crear archivo: " + e.getMessage());
    } finally {
        try {
            if (oos != null) oos.close();
            if (fos != null) fos.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo: " + e.getMessage());
        }
    }
}

// MOSTRAR ARCHIVO ESTUDIANTES ORDENADO DE MAYOR A MENOR
private static void mostrarArchivoEstudiantesMayorAMenor() {
    FileInputStream fis = null;
    ObjectInputStream ois = null;

    try {
        fis = new FileInputStream("estudiantesMayorAMenor.dat");
        ois = new ObjectInputStream(fis);
        System.out.println("Estudiantes ordenados de mayor a menor por ID:");
        while (true) {
            try {
                Estudiante e = (Estudiante) ois.readObject();
                System.out.println(e);
            } catch (EOFException e) {
                break;
            }
        }
    } catch (IOException | ClassNotFoundException e) {
        System.out.println("Error al mostrar archivo: " + e.getMessage());
    } finally {
        try {
            if (ois != null) ois.close();
            if (fis != null) fis.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo: " + e.getMessage());
        }
    }
}

// CREAR ARCHIVO ESTUDIANTES ORDENADO DE MENOR A MAYOR
private static void crearArchivoEstudiantesMenorAMayor() {
    ArrayList<Estudiante> estudiantes = cargarEstudiantes();

    estudiantes.sort(Comparator.comparingInt(Estudiante::getId));

    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    try {
        fos = new FileOutputStream("estudiantesMenorAMayor.dat");
        oos = new ObjectOutputStream(fos);
        for (Estudiante e : estudiantes) {
            oos.writeObject(e);
        }
        System.out.println("Archivo estudiantesMenorAMayor.dat creado correctamente.");
    } catch (IOException e) {
        System.out.println("Error al crear archivo: " + e.getMessage());
    } finally {
        try {
            if (oos != null) oos.close();
            if (fos != null) fos.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo: " + e.getMessage());
        }
    }
}

// MOSTRAR ARCHIVO ESTUDIANTES ORDENADO DE MENOR A MAYOR
private static void mostrarArchivoEstudiantesMenorAMayor() {
    FileInputStream fis = null;
    ObjectInputStream ois = null;

    try {
        fis = new FileInputStream("estudiantesMenorAMayor.dat");
        ois = new ObjectInputStream(fis);
        System.out.println("Estudiantes ordenados de menor a mayor por ID:");
        while (true) {
            try {
                Estudiante e = (Estudiante) ois.readObject();
                System.out.println(e);
            } catch (EOFException e) {
                break;
            }
        }
    } catch (IOException | ClassNotFoundException e) {
        System.out.println("Error al mostrar archivo: " + e.getMessage());
    } finally {
        try {
            if (ois != null) ois.close();
            if (fis != null) fis.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo: " + e.getMessage());
        }
    }
}

// BUSCAR ESTUDIANTE POR ID
private static void buscarEstudiantePorId() {
    ArrayList<Estudiante> estudiantes = cargarEstudiantes();

    System.out.print("Introduce el ID del estudiante a buscar: ");
    int id = input.nextInt();

    boolean encontrado = false;

    for (Estudiante e : estudiantes) {
        if (e.getId() == id) {
            System.out.println("Estudiante encontrado:");
            System.out.println(e);
            encontrado = true;
            break;
        }
    }

    if (!encontrado) {
        System.out.println("No se encontró ningún estudiante con ese ID.");
    }
}

// BUSCAR NOTA POR ID
private static void buscarNotaPorId() {
    ArrayList<Nota> notas = cargarNotas();

    System.out.print("Introduce el ID de la nota a buscar: ");
    int id = input.nextInt();

    boolean encontrada = false;

    for (Nota n : notas) {
        if (n.getId() == id) {
            System.out.println("Nota encontrada:");
            System.out.println(n);
            encontrada = true;
            break;
        }
    }

    if (!encontrada) {
        System.out.println("No se encontró ninguna nota con ese ID.");
    }
}

// MODIFICAR ESTUDIANTE POR ID
private static void modificarEstudiantePorId() {
    ArrayList<Estudiante> estudiantes = cargarEstudiantes();

    System.out.print("Introduce el ID del estudiante a modificar: ");
    int id = input.nextInt();
    input.nextLine();

    boolean encontrado = false;

    for (Estudiante e : estudiantes) {
        if (e.getId() == id) {
            System.out.print("Nuevo nombre: ");
            String nuevoNombre = input.nextLine();
            System.out.print("Nuevo email: ");
            String nuevoEmail = input.nextLine();

            e.setNombre(nuevoNombre);
            e.setEmail(nuevoEmail);
            encontrado = true;
            break;
        }
    }

    if (encontrado) {
        guardarEstudiantes(estudiantes);
        System.out.println("Estudiante modificado correctamente.");
    } else {
        System.out.println("No se encontró ningún estudiante con ese ID.");
    }
}

// MODIFICAR NOTA POR ID
private static void modificarNotaPorId() {
    ArrayList<Nota> notas = cargarNotas();

    System.out.print("Introduce el ID de la nota a modificar: ");
    int id = input.nextInt();
    input.nextLine();

    boolean encontrado = false;

    for (Nota n : notas) {
        if (n.getId() == id) {
            System.out.print("Nuevo nombre: ");
            String nuevoNombre = input.nextLine();
            System.out.print("Nueva puntuación: ");
            int nuevaPuntuacion = input.nextInt();

            n.setNombre(nuevoNombre);
            n.setPuntuacion(nuevaPuntuacion);
            encontrado = true;
            break;
        }
    }

    if (encontrado) {
        guardarNotas(notas);
        System.out.println("Nota modificada correctamente.");
    } else {
        System.out.println("No se encontró ninguna nota con ese ID.");
    }
}







}
