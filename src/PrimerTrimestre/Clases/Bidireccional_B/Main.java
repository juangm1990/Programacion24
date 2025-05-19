package PrimerTrimestre.Clases.Bidireccional_B;

public class Main {
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Alejandro");
        CtaCte cuenta1 = new CtaCte(1000, c1);


        System.out.println(cuenta1);
    }
}
