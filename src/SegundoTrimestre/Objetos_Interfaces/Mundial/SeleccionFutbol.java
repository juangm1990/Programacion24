package SegundoTrimestre.Objetos_Interfaces.Mundial;

import java.util.ArrayList;

public class SeleccionFutbol {

    private String pais;
    private ArrayList<Persona> personas;

    public SeleccionFutbol(String pais) {
        this.pais = pais;
        this.personas = new ArrayList<>();
    }

    public String getPais() {
        return pais;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public void anadirPersona(Persona p) {
        personas.add(p);
    }

    public void eliminarFutbolista(String nombre) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i) instanceof Futbolista && personas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                personas.remove(i);
                System.out.println("Futbolista eliminado: " + nombre);
                return;
            }
        }
        System.out.println("No se encontró ningún futbolista con ese nombre.");
    }

    public void mostrarIntegrantes() {
        System.out.println("Integrantes de la selección de " + pais + ":");
        for (int i = 0; i < personas.size(); i++) {
            personas.get(i).mostrar();
        }
    }

    public void mostrarPesoClasificado() {
        for (int i = 0; i < personas.size(); i++) {
            Persona p = personas.get(i);
            double altura = p.getAltura();
            double peso = p.getPeso();
    
            if (altura > 0) {
                double imc = peso / (altura * altura);
                String clasificacion = "";
    
                if (imc < 18.5) {
                    clasificacion = "Peso bajo";
                } else if (imc < 25) {
                    clasificacion = "Peso normal";
                } else if (imc < 30) {
                    clasificacion = "Peso alto";
                } else {
                    clasificacion = "Sobrepeso";
                }
    
                System.out.println(p.getNombre() + " - IMC: " + String.format("%.2f", imc) + " - " + clasificacion);
            } else {
                System.out.println(p.getNombre() + " - Altura inválida, no se puede calcular IMC.");
            }
        }
    }
    

}
