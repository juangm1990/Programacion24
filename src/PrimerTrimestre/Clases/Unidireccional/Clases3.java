package PrimerTrimestre.Clases.Unidireccional;

public class Clases3 {
    public static void main(String[] args) throws Exception {

        Persona3 p1 = new Persona3("Javi", 25);
        Persona3 p2 = new Persona3();

        System.out.println(p1 + " " + p2);

        int edadMas2 = p1.getEdad() + 2;

        System.out.println(edadMas2);

        System.out.println("-----------------------------------");

        Coche3 c1 = new Coche3("1458BGK", "Audi", "A4", "Blanco");
        Coche3 c2 = new Coche3("2568LKM", "Peugeot", "308", "Negro");

        c1.arrancar();
        c1.parar();
        c1.acelerar(40);

        c2.arrancar();
        c2.acelerar(20);
        c2.acelerar(80);
        c2.acelerar(50);
        c2.parar();

        System.out.println(c1);
        System.out.println(c2);
    }
}
