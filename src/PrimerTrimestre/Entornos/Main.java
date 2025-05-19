package PrimerTrimestre.Entornos;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Persona p1 = new Persona("Inma", "Galisteo", "20/12/1996", 27);

        System.out.println(p1);

        if (p1.getEdad()>=18) {
            System.out.println("Es mayor de edad");
            
        } else {
            System.out.println("Es menor de edad");

        }

        p1.setNombre("Carlos");
        System.out.println(p1);


        Dni d1 = new Dni("12345678");
        System.out.println(d1);

        Dni d2 = new Dni("31000307",'X');
        System.out.println(d2);

        Persona p3 = new Persona("Juan Bautista", "Galisteo", "07/01/1990", 34);
        Dni d3 = new Dni("31000307");
        p3.setDni(d3);

        System.out.println(p3.getDni().getLetra());

        Persona p4 = new Persona("Juanma", "Casado", "01/03/1991", 33);
        Dni d4 = new Dni ("2830467");
        p4.setDni(d4);
        System.out.println(p4.getDni());

    }
}
