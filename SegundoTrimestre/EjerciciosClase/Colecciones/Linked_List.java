package SegundoTrimestre.EjerciciosClase.Colecciones;

import java.util.LinkedList;

public class Linked_List {
    
    public static void main(String[] args) throws Exception{
        
        LinkedList <Integer> lista = new LinkedList<>();

        for (int i = 0; i < 10; i++){
            lista.add(i);
        }

        boolean estae114 = lista.contains(14);
        lista.remove (4);

        System.out.println(lista);
    }
}
