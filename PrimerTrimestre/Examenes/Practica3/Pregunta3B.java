package PrimerTrimestre.Examenes.Practica3;

public class Pregunta3B {

    /*
     * Crear una aplicación en Java que realice la conversión de una cantidad de euros a diferentes monedas 
     * utilizando constantes. La cantidad de euros debe ser convertida a dólares, libras y yenes, y los resultados 
     * deben ser mostrados en la consola. Para este ejercicio:
     * 
     * Utiliza un valor de ejemplo para la cantidad de euros (por ejemplo, 5.87).
     * La conversión de euros a las diferentes monedas se realizará utilizando los siguientes factores de conversión:
     * 
     * 1 euro = 0.98 dólares
     * 1 euro = 0.87 libras
     * 1 euro = 144.73 yenes
     * 
     * El resultado de la conversión debe ser impreso en consola. 
     */
    
    public static void main(String[] args) throws Exception {
        
        double euros = 5.87;

        double [] convertidos = convertir(euros);
        for (int i=0;i<convertidos.length; i++) {
            System.out.println(convertidos[i]);
        }
    }

    public static double [] convertir(double e){
        double [] resultado = {e*0.98,e*0.87,e*144.73};
        return resultado;
    }
}
