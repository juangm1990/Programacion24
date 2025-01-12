package PrimerTrimestre.Temario.Tema1.Normal;

public class Hipotenusa {
    
    public static void main(String[] args) throws Exception{
        
        int cateto1 = 3;
        int cateto2 = 4;
        double hipotenusa = 0;

        // Math.sqrt se utiliza para la raiz cuadrada
        hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        System.out.println(hipotenusa);
    }
}
