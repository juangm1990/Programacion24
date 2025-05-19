package PrimerTrimestre.Clases.Composicion;

public class Main {
    public static void main(String[] args) {
        
        Libro libroProgramacion = new Libro("Introducción a java", 513554568);

        libroProgramacion.agregarPagina(1, "Este libro");
        libroProgramacion.agregarPagina(2, "cbdhbcdhsbcdhs");

        System.out.println(libroProgramacion);
    }
}
