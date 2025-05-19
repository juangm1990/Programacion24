package PrimerTrimestre.Examenes.Practica7;


import java.util.ArrayList;

public class Mundial {
    
    private int id;
    private int anyo;
    private ArrayList<SeleccionFutbol> selecciones;

    // Constructores por Defecto, Parámetros y Copia

    public Mundial() {
        this.id = 0;
        this.anyo = 0;
        this.selecciones = new ArrayList<SeleccionFutbol>();
    }

    public Mundial(int i, int a) {
        this.id = i;
        this.anyo = a;
        this.selecciones = new ArrayList<SeleccionFutbol>();
    }

    public Mundial(Mundial copia) {
        this.id = copia.id;
        this.anyo = copia.anyo;
        this.selecciones = copia.selecciones;
    }

    // Getters y Setters

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getAnyo() {
        return this.anyo;
    }

    public void setAnyo(int a) {
        this.anyo = a;
    }

    public ArrayList<SeleccionFutbol> getSelecciones() {
        return this.selecciones;
    }

    public void setSelecciones(ArrayList<SeleccionFutbol> s) {
        this.selecciones = s;
    }

    // Métodos Personalizados

    public void listarSelecciones() {

        for (int i = 0; i < this.selecciones.size(); i++) {

            System.out.println(this.selecciones.get(i));
        }
    }

    public SeleccionFutbol getSeleccion(int id) {

        for (int i = 0; i < this.selecciones.size(); i++) {

            if (this.selecciones.get(i).getId() == id) {

                return this.selecciones.get(i);
            }
        }

        return null;
    }

    public boolean anyadirSeleccion(int id, String nombre) {

        SeleccionFutbol s = new SeleccionFutbol(id, nombre);

        if (this.selecciones.isEmpty()) {

            this.selecciones.add(s);

            return true;

        } else {

            for (int i = 0; i < this.selecciones.size(); i++) {

                if (this.selecciones.get(i).getId() == id) {

                    return false;
                }
            }

            this.selecciones.add(s);

            return true;
        }
    }

    public boolean quitarSeleccion(int id) {

        if (this.selecciones.isEmpty()) {

            return false;

        } else {

            for (int i = 0; i < this.selecciones.size(); i++) {

                if (this.selecciones.get(i).getId() == id) {

                    this.selecciones.remove(i);

                    return true;
                }
            }

            return false;
        }
    }

    @Override
    public String toString() {
        return "Mundial [ID: " + id + ", Año: " + anyo + "]";
    }
}
