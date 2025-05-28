package PrimerTrimestre.Array;

public class SumarNumerosParesImparesNormal {
    
    public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = {2, 5, 8, 7, 10, 3, 12, 9, 4, 11};

        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                sumaPares = sumaPares + numeros[i];
            } else {
                sumaImpares = sumaImpares + numeros[i];
            }
        }

        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println("La suma de los números impares es: " + sumaImpares);
    }
}

}
