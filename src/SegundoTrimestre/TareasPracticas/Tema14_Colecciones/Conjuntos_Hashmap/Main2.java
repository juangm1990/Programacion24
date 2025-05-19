package SegundoTrimestre.TareasPracticas.Tema14_Colecciones.Conjuntos_Hashmap;


import java.util.HashMap;

public class Main2 {
    
        public static void main(String[] args) throws Exception{
        

        HashMap<String, String> mundo = new HashMap<String, String>();

        mundo.put("España", "Madrid");
        mundo.put("Francia", "París");
        mundo.put("Portugal", "Lisboa");

    
        
        mundo.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });

        
    }
}