package PrimerTrimestre.Entornos;

public class Dni {
    
    private String numeros;
    private char letra;

    public Dni(String n, char l) {
        this.numeros = n;
        this.letra = l;
    }

    public Dni(String n) {
        this.numeros = n;
        this.letra = calcularLetra(); // Corregido aquí
    }

    public char getLetra() {
        return this.letra;
    }

    public String toString() {
        return "DNI: " + this.numeros + this.letra;
    }

    public char calcularLetra() {
        char letra = 'A';
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int numerosInt = Integer.parseInt(this.numeros); // Convertir a números enteros
        int resto = numerosInt % 23;

        letra = letras[resto];

        return letra;
    }
}
