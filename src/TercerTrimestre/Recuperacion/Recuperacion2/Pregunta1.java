package TercerTrimestre.Recuperacion.Recuperacion2;

public class Pregunta1 {
    public static void main(String[] args) throws Exception{
        System.out.println("Múltiplos de 5 entre 100 y 200:");

        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
