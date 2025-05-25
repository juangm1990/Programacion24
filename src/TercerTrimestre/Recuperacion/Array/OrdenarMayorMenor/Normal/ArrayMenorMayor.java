package TercerTrimestre.Recuperacion.Array.OrdenarMayorMenor.Normal;

public class ArrayMenorMayor {
    
        public static void main(String[] args) throws Exception{

        // Creamos un array con varios números desordenados
        int[] numeros = {10, 30, 20, 60, 50};

        // Primer bucle: repite el proceso tantas veces como elementos haya - 1
        for (int i = 0; i < numeros.length - 1; i++) {

            // Segundo bucle: recorre el array comparando elementos de 2 en 2
            for (int j = 0; j < numeros.length - 1; j++) {

                // Si el número actual es MAYOR que el siguiente, los intercambiamos
                // Así el número menor "va bajando" hacia la izquierda
                if (numeros[j] > numeros[j + 1]) {

                    // Guardamos el número actual en una variable temporal
                    int valorGuardado = numeros[j];

                    // Colocamos el número menor en la posición actual
                    numeros[j] = numeros[j + 1];

                    // Ponemos el valor anterior (más grande) en la posición siguiente
                    numeros[j + 1] = valorGuardado;
                }
            }
        }

        // Mostramos el array ya ordenado
        System.out.print("Ordenado de menor a mayor: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
