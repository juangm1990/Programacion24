package TercerTrimestre.Recuperacion.Array.ArrayDelReves.Normal;

public class ArrayDelReves {

    public static void main(String[] args) throws Exception{

        // Array de ejemplo
        int[] numeros = {3, 8, 5, 7, 9};

        // Mostramos el array del revés (desde el último al primero)
        System.out.print("Array del revés: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
