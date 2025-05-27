package TercerTrimestre.Recuperacion.PruebaPractica6B;

public class Guerrero extends Personaje {

    // Constructor por defecto
    public Guerrero() {
        super();
    }

    // Constructor con parámetros
    public Guerrero(String nombre, int nivel, int experiencia, int fuerza, int salud) {
        super(nombre, nivel, experiencia, fuerza, salud);
    }

    // Constructor de copia
    public Guerrero(Guerrero copia) {
        super(copia);
    }

    // Ataque poderoso
    @Override
    public void atacar(Personaje enemigo) {
        int danoGuerrero = fuerza * 3;
        int danoFinal = danoGuerrero;

        if (enemigo.defendiendo) {
            danoFinal = danoGuerrero / 2;
        }

        enemigo.salud -= danoFinal;
        System.out.println(nombre + " realiza un ATAQUE PODEROSO a " + enemigo.nombre + " causando " + danoFinal + " de daño.");
    }
}
