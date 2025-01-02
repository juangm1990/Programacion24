package PrimerTrimestre.Examenes.Practica3;

public class Pregunta3B {
    
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
