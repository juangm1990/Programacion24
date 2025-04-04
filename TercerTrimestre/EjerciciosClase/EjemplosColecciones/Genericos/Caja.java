package TercerTrimestre.EjerciciosClase.EjemplosColecciones.Genericos;

import java.util.*;

public class Caja<T> {
    private T contenido;

    public void guardar(T valor) {
        this.contenido = valor;
    }

    public T obtener() {
        return contenido;
    }

    @Override
    public String toString() {
        return "Contenido: " + contenido;
    }

    public static void main(String[] args) {
        List<Caja<String>> cajasDeTexto = new ArrayList<>();
        List<Caja<Integer>> cajasDeNumeros = new ArrayList<>();

        Caja<String> caja1 = new Caja<>();
        caja1.guardar("Lapiz");
        

        Caja<Integer> caja2 = new Caja<>();
        caja2.guardar(1);



        cajasDeTexto.add(caja1);
        cajasDeNumeros.add(caja2);

        for (Caja<String> c : cajasDeTexto) {
            System.out.println(c);
        }

        for (Caja<Integer> c : cajasDeNumeros) {
            System.out.println(c);
        }
    }
}
