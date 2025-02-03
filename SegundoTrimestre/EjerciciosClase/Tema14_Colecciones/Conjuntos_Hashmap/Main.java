package SegundoTrimestre.EjerciciosClase.Tema14_Colecciones.Conjuntos_Hashmap;

import java.util.HashMap;

public class Main {
    
        public static void main(String[] args) throws Exception{
        

        HashMap<String, String> mundo = new HashMap<String, String>();

        mundo.put("España", "Madrid");
        mundo.put("Francia", "París");
        mundo.put("Portugal", "Lisboa");


        
        for (String i : mundo.keySet()) {
            System.out.println(i);
            System.out.println(mundo.get(i));
            
        }

        

        //mundo.forEach((i, mundo)){
            //System.out.println(i);
            //System.out.println(mundo);
        //}



        

        
    }
}
