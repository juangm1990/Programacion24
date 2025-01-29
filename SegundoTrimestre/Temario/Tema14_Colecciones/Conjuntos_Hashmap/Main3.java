package SegundoTrimestre.Temario.Tema14_Colecciones.Conjuntos_Hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class Main3 {
    
        public static void main(String[] args) throws Exception{
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(5);
        numeros.add(9);
        numeros.add(10);

        for (Integer num : numeros) {
            System.out.println(num);
        }

        HashMap<Integer,String> palabras = new HashMap<Integer,String>();

        palabras.put(5,"teclado");
        palabras.put(8,"ratón");
        palabras.put(1,"pantalla");

        for (Integer clave : palabras.keySet()) {
            System.out.println(clave);
            System.out.println(palabras.get(clave));
        }

        
    }
}
