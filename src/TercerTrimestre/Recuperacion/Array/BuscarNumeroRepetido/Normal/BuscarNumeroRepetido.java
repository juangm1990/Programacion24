package TercerTrimestre.Recuperacion.Array.BuscarNumeroRepetido.Normal;

public class BuscarNumeroRepetido {

    public static void main(String[] args) {

        int[] numeros = {3, 8, 5, 8, 9, 3};

        int contador3 = 0;
        int contador8 = 0;
        int contador5 = 0;
        int contador9 = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 3) {
                contador3++;
            }
            if (numeros[i] == 8) {
                contador8++;
            }
            if (numeros[i] == 5) {
                contador5++;
            }
            if (numeros[i] == 9) {
                contador9++;
            }
        }

        int cantidadRepetidos = 0;

        System.out.print("Los números repetidos son: ");

        if (contador3 > 1) {
            System.out.print("3 ");
            cantidadRepetidos++;
        }
        if (contador8 > 1) {
            System.out.print("8 ");
            cantidadRepetidos++;
        }
        if (contador5 > 1) {
            System.out.print("5 ");
            cantidadRepetidos++;
        }
        if (contador9 > 1) {
            System.out.print("9 ");
            cantidadRepetidos++;
        }

        System.out.println(); // salto de línea

        if (cantidadRepetidos == 1) {
            System.out.println("Hay 1 número repetido.");
        } else if (cantidadRepetidos > 1) {
            System.out.println("Hay " + cantidadRepetidos + " números repetidos.");
        } else {
            System.out.println("No hay números repetidos.");
        }
    }
}
