package TercerTrimestre.EjerciciosClase.EjemploColecciones.TreeMap.TreeMap_Integrer;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapInteger {
    public static void main(String[] args) {
        // TreeMap con clave String (nombre de fruta) y valor Integer (cantidad en stock)
        TreeMap<String, Integer> stockFrutas = new TreeMap<>();

        stockFrutas.put("Manzana", 12);
        stockFrutas.put("Pera", 8);
        stockFrutas.put("Kiwi", 5);
        stockFrutas.put("Banana", 20);
        stockFrutas.put("Banana", 18); // Sobrescribe la cantidad anterior

        System.out.println("Stock de frutas (ordenado por nombre):");
        for (Map.Entry<String, Integer> entrada : stockFrutas.entrySet()) {
            System.out.println("Fruta: " + entrada.getKey() + " - Cantidad: " + entrada.getValue());
        }
    }
}