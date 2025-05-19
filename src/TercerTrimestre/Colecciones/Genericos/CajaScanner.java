package TercerTrimestre.Colecciones.Genericos;

import java.util.*;

public class CajaScanner<T> {
    private T contenido;

    public void guardar(T valor) {
        this.contenido = valor;
    }

    public T obtener() {
        return contenido;
    }

    @Override
    public String toString() {
        return "Contenido: " + contenido;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Caja<String>> lista = new ArrayList<>();

        System.out.print("¿Cuántos elementos quieres introducir? ");
        int cantidad = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce el contenido de la caja " + (i + 1) + ": ");
            String entrada = sc.nextLine();

            Caja<String> caja = new Caja<>();
            caja.guardar(entrada);

            lista.add(caja);
        }

        System.out.println("\nContenido de todas las cajas:");
        for (Caja<String> c : lista) {
            System.out.println(c);
        }

        sc.close();
    }
}