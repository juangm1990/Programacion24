package PrimerTrimestre.Array;

public class Informatica {
    public static void main(String[] args) throws Exception {

        char[] array = {'I', 'N', 'F', 'O', 'R', 'M', 'A', 'T', 'I', 'C', 'A'};

        for (int i = 0; i < array.length; i++) {
            
            if (array[i] == 'A') {

                System.out.println("La letra A se encuentra en la posición " + i);
            }
        }

    }
}
