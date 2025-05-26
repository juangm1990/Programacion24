package TercerTrimestre.Recuperacion.PruebaPractica5A;

import java.util.ArrayList;
import java.util.Scanner;

public class MainScanner {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int opcion = 0;

        // Lista para guardar empleados y contratos
        ArrayList<Contrato> contratos = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Variables auxiliares para el último contrato creado
        Contrato contratoActual = null;

        do {
            // Menú
            System.out.println("0| Salir del programa");
            System.out.println("1| Crear contrato");
            System.out.println("2| Crear empleado");
            System.out.println("3| Mostrar empleados");
            System.out.println("4| Mostrar contratos");
            System.out.println("5| Mostrar empleados con contratos");
            System.out.println("6| Modificar datos con valores válidos");
            System.out.println("7| Modificar datos con valores inválidos");
            System.out.println("8| Mostrar salario del empleado");
            System.out.println("9| Mostrar salario de todos los empleados");
            System.out.println("----------------------------");
            System.out.println("Por favor, elige una opción:");
            System.out.println("----------------------------");

            opcion = input.nextInt();
            input.nextLine(); // limpiar salto

            switch (opcion) {

                case 1:
                    // Crear contrato
                    System.out.println("Introduce salario:");
                    double salario = input.nextDouble();
                    input.nextLine();

                    System.out.println("Introduce tipo de jornada (tiempo completo / tiempo parcial):");
                    String jornada = input.nextLine();

                    System.out.println("Introduce cláusula:");
                    String clausula = input.nextLine();

                    contratoActual = new Contrato(salario, jornada, clausula);
                    contratos.add(contratoActual);
                    System.out.println("Contrato creado correctamente.");
                    break;

                case 2:
                    // Crear empleado (necesita un contrato creado previamente)
                    if (contratoActual == null) {
                        System.out.println("Primero debes crear un contrato.");
                    } else {
                        System.out.println("Introduce nombre:");
                        String nombre = input.nextLine();

                        System.out.println("Introduce apellidos:");
                        String apellidos = input.nextLine();

                        System.out.println("Introduce teléfono (ej: +34678912345):");
                        String telefono = input.nextLine();

                        Empleado empleado = new Empleado(nombre, apellidos, telefono, contratoActual);
                        empleados.add(empleado);
                        System.out.println("Empleado creado correctamente.");
                    }
                    break;

                case 3:
                    // Mostrar todos los empleados
                    if (empleados.isEmpty()) {
                        System.out.println("No hay empleados registrados.");
                    } else {
                        for (Empleado e : empleados) {
                            System.out.println(e);
                            System.out.println("----------------------------");
                        }
                    }
                    break;

                case 4:
                    // Mostrar todos los contratos
                    if (contratos.isEmpty()) {
                        System.out.println("No hay contratos registrados.");
                    } else {
                        for (Contrato c : contratos) {
                            System.out.println(c);
                            System.out.println("----------------------------");
                        }
                    }
                    break;

                case 5:
                    // Mostrar empleados con sus contratos
                    if (empleados.isEmpty()) {
                        System.out.println("No hay empleados registrados.");
                    } else {
                        for (Empleado e : empleados) {
                            System.out.println("Empleado: " + e.getNombre() + " " + e.getApellidos());
                            System.out.println(e.getContrato());
                            System.out.println("----------------------------");
                        }
                    }
                    break;

                case 6:
                    // Modificar el primer empleado con datos válidos
                    if (!empleados.isEmpty()) {
                        Empleado e = empleados.get(0);
                        e.setNombre("Carlos");
                        e.setApellidos("Hernández López");
                        e.setTelefono("+34999999999");

                        Contrato c = e.getContrato();
                        c.setSalario(2000);
                        c.setTipoDeJornada("tiempo parcial");
                        c.setClausula("Contrato modificado con acuerdo sindical.");

                        System.out.println("Datos válidos modificados correctamente.");
                        System.out.println(e);
                    } else {
                        System.out.println("Primero debes crear un empleado.");
                    }
                    break;

                case 7:
                    // Modificar el primer empleado con datos inválidos
                    if (!empleados.isEmpty()) {
                        Empleado e = empleados.get(0);
                        e.setNombre("A");
                        e.setApellidos("X");
                        e.setTelefono("123");

                        Contrato c = e.getContrato();
                        c.setSalario(-1000);
                        c.setTipoDeJornada("freelance");
                        c.setClausula("x".repeat(600));

                        System.out.println("Intento de modificación con datos inválidos.");
                        System.out.println(e);
                    } else {
                        System.out.println("Primero debes crear un empleado.");
                    }
                    break;

                case 8:
                    // Mostrar salario del primer empleado
                    if (!empleados.isEmpty()) {
                        Empleado e = empleados.get(0);
                        System.out.println(
                                "El salario de " + e.getNombre() + " es: " + e.getContrato().getSalario() + " euros");
                    } else {
                        System.out.println("Primero debes crear un empleado.");
                    }
                    break;

                case 9:
                    // Mostrar todos los salarios de los empleados registrados
                    if (!empleados.isEmpty()) {
                        for (Empleado e : empleados) {
                            System.out.println("El salario de " + e.getNombre() + " " + e.getApellidos() +
                                    " es: " + e.getContrato().getSalario() + " euros");
                        }
                    } else {
                        System.out.println("No hay empleados registrados.");
                    }
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }

        } while (opcion != 0);

        input.close();
    }
}
