package TercerTrimestre.Recuperacion.PruebaPractica7;

import java.util.ArrayList;

public class Mundial {
    private int anio;
    private ArrayList<SeleccionFutbol> selecciones;

    // Constructor por defecto
    public Mundial() {
        this.anio = 0;
        this.selecciones = new ArrayList<>();
    }

    // Constructor con parámetros
    public Mundial(int anio) {
        this.anio = anio;
        this.selecciones = new ArrayList<>();
    }

    // Constructor de copia
    public Mundial(Mundial copia) {
        this.anio = copia.anio;
        this.selecciones = new ArrayList<>(copia.selecciones);
    }

    // Getters y setters
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public ArrayList<SeleccionFutbol> getSelecciones() {
        return selecciones;
    }

    public void setSelecciones(ArrayList<SeleccionFutbol> selecciones) {
        this.selecciones = selecciones;
    }

    // Añadir selección si no existe
    public boolean anyadirSeleccion(SeleccionFutbol s) {
        for (SeleccionFutbol seleccion : selecciones) {
            if (seleccion.getId() == s.getId()) {
                return false;
            }
        }
        selecciones.add(s);
        return true;
    }

    // Quitar selección si existe
    public boolean quitarSeleccion(SeleccionFutbol s) {
        for (SeleccionFutbol seleccion : selecciones) {
            if (seleccion.getId() == s.getId()) {
                selecciones.remove(seleccion);
                return true;
            }
        }
        return false;
    }

    // Buscar selección por nombre
    public SeleccionFutbol getSeleccion(String nombre) {
        for (SeleccionFutbol seleccion : selecciones) {
            if (seleccion.getNombre().equalsIgnoreCase(nombre)) {
                return seleccion;
            }
        }
        return null;
    }

    // Mostrar todas las selecciones
    public void listarSelecciones() {
        for (SeleccionFutbol seleccion : selecciones) {
            System.out.println(seleccion.getNombre());
        }
    }
}
