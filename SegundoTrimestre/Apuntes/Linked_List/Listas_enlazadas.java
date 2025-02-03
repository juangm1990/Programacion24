package SegundoTrimestre.Apuntes.Linked_List;

import java.util.LinkedList;

public class Listas_enlazadas {
    
    
    public static void main(String[] args) throws Exception{
        
        LinkedList <Integer> lista = new LinkedList<>();

        for (int i = 0; i < 10; i++){
            lista.add(i);
        }

        boolean estae114 = lista.contains(3);
        lista.remove (4);

        System.out.println(lista);
    }

}
