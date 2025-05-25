package TercerTrimestre.Recuperacion.Array.ContarParesImparesCapicuas.Normal;

public class ContarParesImparesCapicuas {

    public static void main(String[] args) throws Exception{

        // Array definido directamente en el código
        int[] numeros = {121, 40, 33, 44, 18, 15, 22};

        // Contadores
        int pares = 0;
        int impares = 0;
        int capicuas = 0;

        // Recorremos el array
        for (int i = 0; i < numeros.length; i++) {

            // Comprobamos si es par o impar
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            // Comprobamos si es capicúa
            int original = numeros[i];
            int numero = original;
            int invertido = 0;

            while (numero > 0) {
                int digito = numero % 10;
                invertido = invertido * 10 + digito;
                numero = numero / 10;
            }

            if (original == invertido) {
                capicuas++;
            }
        }

        // Mostramos resultados
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
        System.out.println("Cantidad de capicúas: " + capicuas);
    }
}
