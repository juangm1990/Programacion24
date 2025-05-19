package PrimerTrimestre.Clases.Unidireccional;

public class PruebaPorReferencia {
    public static void main(String[] args) {
        
        Contador contador = new Contador();
        System.out.println(contador);

        contador.sumar();
        System.out.println(contador);
    }
}
