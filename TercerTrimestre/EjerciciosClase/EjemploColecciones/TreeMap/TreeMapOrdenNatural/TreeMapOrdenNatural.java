package TercerTrimestre.EjerciciosClase.EjemploColecciones.TreeMap.TreeMapOrdenNatural;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapOrdenNatural {
    
    public static void main(String[] args) {
        TreeMap<String, Double> frutas = new TreeMap<>();

        // Añadir frutas con sus precios
        frutas.put("Manzana", 1.20);
        frutas.put("Pera", 1.50);
        frutas.put("Kiwi", 2.30);
        frutas.put("Banana", 1.00);
        frutas.put("Banana", 1.10); // Sobrescribe el valor anterior

        System.out.println("Frutas y precios (ordenados por nombre):");
        for (Map.Entry<String, Double> entrada : frutas.entrySet()) {
            System.out.println("Fruta: " + entrada.getKey() + " - Precio: " + entrada.getValue() + " euros");
        }
    }
}
