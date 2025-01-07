package PrimerTrimestre.Examenes.BolaExtra2;

public class Pregunta4 {
    
    /*
     * Crea un programa que dibuje por consola las tablas de multiplicar 
     * especificadas en el siguiente array: [4, 5, 10, 2, 3]
     */
    
    public static void main(String[] args) throws Exception {

        int[] numeros = {4,5,10,2,3};
        int resultado = 0;
        for( int i = 0; i< numeros.length; i++){
            System.out.println("La tabla del " + numeros[i] + " es:");
            for(int j = 0; j <=10; j++){
                resultado = numeros[i] * j;
                System.out.println(numeros[i] + " x " + j + " = " + resultado );
            }
        } 
        
    }
}
