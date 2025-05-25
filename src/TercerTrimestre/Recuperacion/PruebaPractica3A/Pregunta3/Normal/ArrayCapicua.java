package TercerTrimestre.Recuperacion.PruebaPractica3A.Pregunta3.Normal;

public class ArrayCapicua {

    public static void main(String[] args) throws Exception{

        // Array original con algunos números
        int[] numeros = {121, 232, 345, 44, 789, 3003, 123};

        System.out.print("Números capicúa encontrados: ");

        // Recorremos uno a uno
        for (int i = 0; i < numeros.length; i++) {
            int original = numeros[i];
            int numero = original;
            int invertido = 0;

            // Damos la vuelta al número
            while (numero > 0) {
                int digito = numero % 10;
                invertido = invertido * 10 + digito;
                numero = numero / 10;
            }

            // Si el número es capicúa, lo mostramos
            if (original == invertido) {
                System.out.print(original + " ");
            }
        }
    }
}
