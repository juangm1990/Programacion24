package PrimerTrimestre.Clases.Unidireccional;

public class Clases {
    public static void main(String[] args) throws Exception {

        // VERDE: Clase --> Crea objetos (nombre variable). AMARILLO: función.
        // La Clase la creamos en otro archivo con el mismo nombre.
        Persona p1 = new Persona("Javi", "10/09/1999");
        Persona p2 = new Persona("Paco", "10/08/2000");

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        // Con un array.
        Persona[] personas = {p1, p2};

        for (int i = 0; i < personas.length; i++) {

            // Se omite poner .toString porque es un método que está en todas las clases y java lo reconoce bien. Te evita usarlo.
            System.out.println(personas[i]);
        }
    }
}
