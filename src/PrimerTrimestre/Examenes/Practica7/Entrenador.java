package PrimerTrimestre.Examenes.Practica7;


public class Entrenador extends Persona implements Deportista, Integrante {
    
    private int idFederacion;

    // Constructores por Defecto, Parámetros y Copia

    public Entrenador() {
        super();
        this.idFederacion = 0;
    }

    public Entrenador(int i, String n, String ape, String fNac, double p, double a, int idFed) {
        super(i, n, ape, fNac, p, a);
        this.idFederacion = idFed;
    }

    public Entrenador(Entrenador copia) {
        super(copia);
        this.idFederacion = copia.idFederacion;
    }

    // Getters y Setters

    public int getIdFederacion() {
        return this.idFederacion;
    }

    public void setIdFederacion(int idFed) {
        this.idFederacion = idFed;
    }

    // Métodos Personalizados

    @Override
    public void viajar() {
        System.out.println("Entrenador viajando" + this);
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenador entrenando" + this);
    }

    @Override
    public void jugarPartido() {
        System.out.println("Entrenador jugando partido" + this);
    }

    @Override
    public boolean tieneSobrepeso() {

        return (this.peso / (this.altura * this.altura)) > 25;
    }

    @Override
    public void concentrarse() {
        System.out.println("Entrenador concentrandose " + this);
    }

    @Override
    public void comer() {
        System.out.println("Entrenador comiendo " + this);
    }

    @Override
    public void dormir() {
        System.out.println("Entrenador durmiendo " + this);
    }

    @Override
    public boolean asignarSeleccion(SeleccionFutbol s) {

        for (int i = 0; i < this.selecciones.size(); i++) {

            if (this.selecciones.get(i).getId() == s.getId()) {

                return false;
            }
        }

        this.selecciones.add(s);

        return true;
    }

    @Override
    public boolean quitarSeleccion(int id) {

        for(int i = 0; i < this.selecciones.size(); i++) {

            if (this.selecciones.get(i).getId() == id) {

                this.selecciones.remove(i);

                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "Entrenador = " + super.toString() + " | ID_Federacion=" + idFederacion;
    }
}
