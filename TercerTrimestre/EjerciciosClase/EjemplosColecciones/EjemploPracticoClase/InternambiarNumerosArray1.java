package TercerTrimestre.EjerciciosClase.EjemplosColecciones.EjemploPracticoClase;

public class InternambiarNumerosArray1 {
    
    public static void main(String[] args) throws Exception{
        
        String[] array1 = {"tres", "dos", "uno"};
        Integer[] array2 = {3, 2, 1};

        // CAMBIO PARA ARRAY1
        intercambiar(array1, 0, 2);

        for (int i = 0; i < 3; i++) {
            System.out.print(array1[i]);
            
        }

        System.out.println("");
        System.out.println("////////////////////////////");

        // CAMBIO PARA ARRAY2
        intercambiar(array2, 0, 2);

        for (int i = 0; i < 3; i++) {
            System.out.print(array2[i]);
        }

        
    }

    public static <T> void intercambiar(T[] intercambioNumeros, int i, int j) {
        T cambioArray = intercambioNumeros[i];
        intercambioNumeros[i] = intercambioNumeros[j];
        intercambioNumeros[j] = cambioArray;
    }
}

