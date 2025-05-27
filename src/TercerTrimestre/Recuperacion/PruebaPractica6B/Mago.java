package TercerTrimestre.Recuperacion.PruebaPractica6B;

public class Mago extends Personaje {

    // Constructor por defecto
    public Mago() {
        super();
    }

    // Constructor con parámetros
    public Mago(String nombre, int nivel, int experiencia, int fuerza, int salud) {
        super(nombre, nivel, experiencia, fuerza, salud);
    }

    // Constructor de copia
    public Mago(Mago copia) {
        super(copia);
    }

    // Escudo mágico al defenderse
    @Override
    public void atacar(Personaje enemigo) {
        int danoBase = fuerza * 2;
        int danoFinal = danoBase;

        if (enemigo.defendiendo) {
            if (enemigo instanceof Mago) {
                danoFinal = danoBase / 4; // escudo mágico
            } else {
                danoFinal = danoBase / 2;
            }
        }

        enemigo.salud -= danoFinal;
        System.out.println(nombre + " lanza un HECHIZO a " + enemigo.nombre + " causando " + danoFinal + " de daño.");
    }
}
