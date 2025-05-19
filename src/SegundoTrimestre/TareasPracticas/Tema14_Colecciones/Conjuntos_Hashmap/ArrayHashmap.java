package SegundoTrimestre.TareasPracticas.Tema14_Colecciones.Conjuntos_Hashmap;


import java.util.ArrayList;
import java.util.HashMap;

public class ArrayHashmap {
    
            public static void main(String[] args) throws Exception{
        
        ArrayList<ArrayList<String>> congelados = new ArrayList<ArrayList<String>>();

        ArrayList<String> cereales = new ArrayList<>();
        cereales.add("arroz");
        cereales.add("avena");

        ArrayList<String> verduras = new ArrayList<>();
        verduras.add("pimiento");
        verduras.add("cebolla");

        ArrayList<String> cosasRaras = new ArrayList<>();
        cosasRaras.add("ajo");
        cosasRaras.add("aceite");


        congelados.add(cereales);
        congelados.add(verduras);

        System.out.println(cereales);
        System.out.println(verduras);
        System.out.println(cosasRaras);

        // RECORRERLO Y MOSTRARLO

        for (ArrayList<String> congelado : congelados) {
            for (String producto : congelado) {
                System.out.println(producto);
                
            }
        }

        HashMap<String, ArrayList<String>> congelados2 = new HashMap<String, ArrayList<String>>();

        congelados2.put("cer", cereales);
        congelados2.put("verd", verduras);
        congelados2.put("cositas", cosasRaras);

        for (String clave : congelados2.keySet()) {
            System.out.println(clave);
            for (String producto : congelados2.get(clave)) {
                System.out.println(producto);
                
            }
            
        }



    }
}
