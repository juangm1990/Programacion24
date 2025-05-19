package TercerTrimestre.Apuntes.ColecionesMetodos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Metodos {

    public static void main(String[] args) throws Exception {

        LinkedList<Double> lista = new LinkedList<Double>();

        // Añadir elementos a la lista
        lista.add(1.5);
        lista.add(5.5);
        lista.add(-1.5);

        System.out.println(lista);

        // Conocer el tamaño de la lista
        System.out.println(lista.size());

        // Añadir elementos en la posición indicada
        lista.add(1, -5.5);
        System.out.println(lista);

        // Obtener elemento de la lista dada su posición
        System.out.println(lista.get(0));

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        // Eliminar el elemento de la posición dada y devolver el elemento eliminado
        int posición = 3;
        System.out.println(lista.remove(posición));
        System.out.println(numeros);

        // Borrado del elemento
        Integer numero = 3;
        numeros.remove(numero);
        System.out.println(numeros);

        System.out.println(lista.remove(0));
        System.out.println(lista);

        // Borrado de todos los elementos de la lista
        lista.clear();
        System.out.println(lista);

        lista.add(1.5);
        lista.add(5.5);
        lista.add(-1.5);

        // Actualizar elemento dado una opsicion
        lista.set(0, 8.8);
        System.out.println(lista);

        // Boolean si contiene o no el elemento
        System.out.println(lista.contains(5.5));

        // Devuelve la posición dado un elemento de busqueda (si no existe nos dará -1)
        System.out.println(lista.indexOf(-1.5));

        // Comprueba si una lista está vacia
        System.out.println(lista.isEmpty());

        lista.add(8.8);
        System.out.println(lista);
        // Devuelve la última posición del elemento dado
        System.out.println(lista.lastIndexOf(8.8));

    }
}
