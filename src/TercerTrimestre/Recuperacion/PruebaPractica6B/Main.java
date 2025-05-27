package TercerTrimestre.Recuperacion.PruebaPractica6B;

public class Main {
    public static void main(String[] args) {
        // Crear personajes
        Guerrero g1 = new Guerrero("Conan", 5, 100, 20, 150);
        Mago m1 = new Mago("Merlín", 5, 100, 15, 120);

        System.out.println("==== ESTADO INICIAL ====");
        System.out.println(g1);
        System.out.println(m1);
        System.out.println();

        // Turno 1: Merlín se defiende, Conan ataca
        System.out.println("==== TURNO 1 ====");
        m1.defender();
        g1.atacar(m1);
        System.out.println();

        // Turno 2: Conan se defiende, Merlín ataca
        System.out.println("==== TURNO 2 ====");
        g1.defender();
        m1.atacar(g1);
        System.out.println();

        // Mostrar estado final
        System.out.println("==== ESTADO FINAL ====");
        System.out.println(g1);
        System.out.println(m1);
    }
}
