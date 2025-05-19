package SegundoTrimestre.TareasPracticas.Tema14_Colecciones;


import java.util.ArrayList;

public class ListaLetrasAlfabeto {
    
    /*
     * Crea una lista con ls letras del alfabeto
     * Mostrar la lista
     * Buscar y mostrar la posición de 'E', 'H' y 'O'
     * Eliminar elemento en la posición 1 y 'U'
     * Mostrar la lista de nuevo
     */

    public static void main(String[] args) {
        
        ArrayList<Character> letrasAlfabeto = new ArrayList<Character>();

        for (int i = 65; i <= 90; i++){
            letrasAlfabeto.add((char)i);
        }

        System.out.println(letrasAlfabeto);

        // Buscar y mostrar la posición de 'E','H' y 'O'
        System.out.println(letrasAlfabeto.indexOf('E'));
        System.out.println(letrasAlfabeto.indexOf('H'));
        System.out.println(letrasAlfabeto.indexOf('O'));

        // Eliminar elemento en la posición 1 y la letra 'U'
        letrasAlfabeto.remove(1);
        Character letra = 'U';
        letrasAlfabeto.remove(letra);

        System.out.println(letrasAlfabeto);



    }
}
