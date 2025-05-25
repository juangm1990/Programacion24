package TercerTrimestre.Recuperacion.Array.OrdenarMayorMenor.Normal;

public class ArrayMayorMenor {

    public static void main(String[] args) throws Exception{

        // Creamos un array con varios números desordenados
        int[] numeros = {10, 30, 20, 50, 60};

        // Primer bucle: repite el proceso tantas veces como elementos haya - 1
        for (int i = 0; i < numeros.length - 1; i++) {

            // Segundo bucle: recorre el array comparando elementos de 2 en 2
            for (int j = 0; j < numeros.length - 1; j++) {

                // Si el número actual es MENOR que el siguiente, los intercambiamos
                // Así el número mayor "va subiendo" hacia la izquierda
                if (numeros[j] < numeros[j + 1]) {

                    // Guardamos el número actual en una variable temporal (valorGuardado)
                    int valorGuardado = numeros[j];

                    // Colocamos el número mayor en la posición actual
                    numeros[j] = numeros[j + 1];

                    // Ponemos el valor anterior (más pequeño) en la posición siguiente
                    numeros[j + 1] = valorGuardado;
                }
            }
        }

        // Mostramos el array ya ordenado
        System.out.print("Ordenado de mayor a menor: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
