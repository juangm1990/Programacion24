package PrimerTrimestre.Examenes.Practica7;

public abstract class Masajista extends Persona implements Integrante {
    
    protected String titulacion;

    public Masajista() {
        super();
        this.titulacion = null;
    }

    public Masajista(int i, String n, String ape, String fNac, double p, double a, String t) {
        super(i, n, ape, fNac, p, a);
        this.titulacion = t;
    }

    public Masajista(Masajista copia) {
        super(copia);
        this.titulacion = copia.titulacion;
    }

    public String getTitulacion() {
        return this.titulacion;
    }

    public void setTitulacion(String t) {
        this.titulacion = t;
    }

    @Override
    public void viajar() {
        System.out.println("masajista viajando" + this);
    }

    @Override
    public void concentrarse() {
        System.out.println("Masajista concentrandose " + this);
    }

    @Override
    public void comer() {
        System.out.println("Masajista comiendo " + this);
    }

    @Override
    public void dormir() {
        System.out.println("Masajista durmiendo " + this);
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
        return super.toString() + " | titulacion=" + titulacion;
    }
}
