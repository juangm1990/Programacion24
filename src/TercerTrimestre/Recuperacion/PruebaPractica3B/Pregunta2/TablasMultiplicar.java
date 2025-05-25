package TercerTrimestre.Recuperacion.PruebaPractica3B.Pregunta2;

public class TablasMultiplicar {

    public static void main(String[] args) {
        int[] tablas = {4, 5, 10, 2, 3};

        for (int i = 0; i < tablas.length; i++) {
            System.out.println("Tabla del " + tablas[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(tablas[i] + " x " + j + " = " + (tablas[i] * j));
            }
            System.out.println(); // salto de línea entre tablas
        }
    }
}
