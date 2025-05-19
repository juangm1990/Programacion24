package SegundoTrimestre.Objetos_Interfaces.Estudiante;


import java.util.ArrayList;

public class Alumno extends Persona implements Notas {

    private ArrayList<Double> listaNotas;

    public Alumno(int id, String nombre, String email) {
        super(id, nombre, email);
        this.listaNotas = new ArrayList<>();
    }

    public void añadirNota(double nota) {
        listaNotas.add(nota);
    }

    public ArrayList<Double> getListaNotas() {
        return listaNotas;
    }

    @Override
    public double calcularMedia() {
        double suma = 0;
        for (int i = 0; i < listaNotas.size(); i++) {
            suma = suma + listaNotas.get(i);
        }
        if (listaNotas.size() > 0) {
            return suma / listaNotas.size();
        } else {
            return 0;
        }
    }

    @Override
    public boolean estaAprobado() {
        return calcularMedia() >= 5;
    }

    @Override
    public void mostrar() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
        System.out.print("Notas: ");
        for (int i = 0; i < listaNotas.size(); i++) {
            System.out.print(listaNotas.get(i) + " ");
        }
        System.out.println("\nMedia: " + String.format("%.2f", calcularMedia()) +
                " - " + (estaAprobado() ? "Aprobado" : "Suspenso"));
    }
}