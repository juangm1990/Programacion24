package TercerTrimestre.Recuperacion.PruebaPractica5A;

public class Main {

    public static void main(String[] args) {

        // Crear contratos
        Contrato c1 = new Contrato(1200, "tiempo completo", "No compartir información");
        Contrato c2 = new Contrato(1150, "tiempo completo", "No tiene cláusulas");
        Contrato c3 = new Contrato(); // constructor por defecto

        // Crear empleados
        Empleado e1 = new Empleado("Juan", "Galisteo", "+34744465630", c1);
        Empleado e2 = new Empleado("Carlos", "Garcia", "+34744465630", c2);
        Empleado e3 = new Empleado(); // constructor por defecto

        System.out.println(e1);
        System.out.println("------------------------------------------------");

        System.out.println(e2);
        System.out.println("------------------------------------------------");

        // Modificaciones válidas
        c1.setTipoDeJornada("tiempo parcial");
        c1.setSalario(800);

        e1.setTelefono("+34672762619");
        e1.setNombre("Marcos");

        System.out.println(e1);
        System.out.println("------------------------------------------------");

        // Modificaciones inválidas (no deberían cambiar nada)
        c3.setSalario(10);      // válida
        c3.setSalario(-1);      // inválida

        e3.setTelefono("+3425698756");  // válida
        e3.setTelefono("98");          // inválida

        e3.setNombre("Mario");         // válida
        e3.setNombre("Error");         // inválida

        System.out.println(e3);
        System.out.println("------------------------------------------------");

        // Mostrar salario de un empleado
        System.out.println(e1.getContrato().getSalario() + " euros");
    }
}
