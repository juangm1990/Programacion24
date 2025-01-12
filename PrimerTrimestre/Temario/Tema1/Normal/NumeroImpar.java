package PrimerTrimestre.Temario.Tema1.Normal;

public class NumeroImpar {
    
    public static void main(String[] args) throws Exception{
        
        int numero = 3;

        if (numero % 2 !=0) {
            System.out.println("El número " + numero + " es impar");
            
        } else {
            System.out.println("El número " + numero + " es par");
        }
    }
}
