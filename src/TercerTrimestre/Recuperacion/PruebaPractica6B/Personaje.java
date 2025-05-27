package TercerTrimestre.Recuperacion.PruebaPractica6B;

public class Personaje {
    protected String nombre;
    protected int nivel;
    protected int experiencia;
    protected int fuerza;
    protected int salud;
    protected boolean defendiendo;

    // Constructor por defecto
    public Personaje() {
        nombre = "SinNombre";
        nivel = 1;
        experiencia = 0;
        fuerza = 10;
        salud = 100;
        defendiendo = false;
    }

    // Constructor con parámetros
    public Personaje(String nombre, int nivel, int experiencia, int fuerza, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.fuerza = fuerza;
        this.salud = salud;
        this.defendiendo = false;
    }

    // Constructor de copia
    public Personaje(Personaje copia) {
        this.nombre = copia.nombre;
        this.nivel = copia.nivel;
        this.experiencia = copia.experiencia;
        this.fuerza = copia.fuerza;
        this.salud = copia.salud;
        this.defendiendo = copia.defendiendo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getSalud() {
        return salud;
    }

    public boolean isDefendiendo() {
        return defendiendo;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setDefendiendo(boolean defendiendo) {
        this.defendiendo = defendiendo;
    }

    // Método para atacar a otro personaje
    public void atacar(Personaje enemigo) {
        int danoBase = fuerza * 2;
        int danoFinal = danoBase;

        if (enemigo.defendiendo) {
            danoFinal = danoBase / 2;
        }

        enemigo.salud -= danoFinal;
        System.out.println(nombre + " ataca a " + enemigo.nombre + " y le hace " + danoFinal + " de daño.");
    }

    // Método para ponerse en posición defensiva
    public void defender() {
        defendiendo = true;
        System.out.println(nombre + " se pone en posición defensiva.");
    }

    // Mostrar información del personaje
    public String toString() {
        return "Nombre: " + nombre +
               " | Nivel: " + nivel +
               " | Exp: " + experiencia +
               " | Fuerza: " + fuerza +
               " | Salud: " + salud +
               " | Defendiendo: " + defendiendo;
    }
}

