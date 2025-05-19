package SegundoTrimestre.Objetos_Interfaces.Mundial;

import java.util.ArrayList;

public class Mundial {

    private ArrayList<SeleccionFutbol> selecciones;

    public Mundial() {
        this.selecciones = new ArrayList<>();
    }

    public void anadirSeleccion(SeleccionFutbol s) {
        selecciones.add(s);
    }

    public void mostrarSelecciones() {
        if (selecciones.isEmpty()) {
            System.out.println("No hay selecciones registradas.");
        } else {
            System.out.println("Selecciones en el Mundial:");
            for (int i = 0; i < selecciones.size(); i++) {
                System.out.println((i + 1) + ". " + selecciones.get(i).getPais());
            }
        }
    }

    public SeleccionFutbol buscarSeleccionPorNombre(String nombre) {
        for (int i = 0; i < selecciones.size(); i++) {
            if (selecciones.get(i).getPais().equalsIgnoreCase(nombre)) {
                return selecciones.get(i);
            }
        }
        return null;
    }

    public ArrayList<SeleccionFutbol> getSelecciones() {
        return selecciones;
    }

    public void setSelecciones(ArrayList<SeleccionFutbol> selecciones) {
        this.selecciones = selecciones;
    }
}
