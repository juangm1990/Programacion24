package TercerTrimestre.Colecciones.EjemploPracticoClase;

public class IntercambiarNumerosArray2 {

    public static void main(String[] args) throws Exception {

        String[] letras = { "primero", "segundo", "tercero", "cuarto" };

        Integer[] numeros = { 1, 2, 3, 4 };

        Intercambiar(letras, 0, 3);
        Intercambiar(numeros, 0, 3);

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static <T> void Intercambiar(T[] array, int i, int j) {

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
