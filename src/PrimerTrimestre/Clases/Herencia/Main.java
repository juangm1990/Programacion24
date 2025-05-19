package PrimerTrimestre.Clases.Herencia;

public class Main {
    public static void main(String[] args) {
        
        Bulbasaur b1 = new Bulbasaur("Manolo");

        Charmander c1 = new Charmander("Benito");

        Squirtle s1 = new Squirtle("Paco");

        c1.defender(true);
        b1.atacar(c1);

        b1.defender(true);
        c1.atacar(b1);

        b1.curar();

        c1.atacar(s1);

        System.out.println(s1);

        s1.defender(true);
        c1.atacar(s1);

        System.out.println(b1);
        System.out.println(c1);

        System.out.println(s1);
    }
}
