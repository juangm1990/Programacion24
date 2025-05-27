package TercerTrimestre.Recuperacion.PruebaPractica7;

public class Main {
    public static void main(String[] args) {
        // Crear el mundial
        Mundial mundial2022 = new Mundial(2022);

        // Crear selecciones
        SeleccionFutbol argentina = new SeleccionFutbol(1, "Argentina");
        SeleccionFutbol espana = new SeleccionFutbol(2, "España");

        // Añadir selecciones al mundial
        mundial2022.anyadirSeleccion(argentina);
        mundial2022.anyadirSeleccion(espana);

        // Crear integrantes y asignarlos manualmente

        // Argentina
        Futbolista messi = new Futbolista(1, "Lionel", "Messi", 35, 1.69, 72, 10, "Delantero");
        Futbolista gordito = new Futbolista(2, "Juan", "Gordito", 28, 1.70, 85, 9, "Mediocentro"); // con sobrepeso
        Entrenador dtArgentina = new Entrenador(3, "Scaloni", "DT", 44, 1.75, 70, 101);
        Fisioterapeuta fisioArg = new Fisioterapeuta(4, "Pedro", "Kinesio", 40, 1.80, 80, 10);

        argentina.anyadir(messi);
        argentina.anyadir(gordito);
        argentina.anyadir(dtArgentina);
        argentina.anyadir(fisioArg);

        // España
        Futbolista pedri = new Futbolista(5, "Pedri", "González", 20, 1.74, 65, 8, "Centrocampista");
        Entrenador dtEsp = new Entrenador(6, "Luis", "Enrique", 50, 1.80, 78, 102);
        Fisioterapeuta fisioEsp = new Fisioterapeuta(7, "Carlos", "Fisio", 38, 1.75, 75, 12);

        espana.anyadir(pedri);
        espana.anyadir(dtEsp);
        espana.anyadir(fisioEsp);

        // Mostrar los datos de prueba según pide el examen

        System.out.println("\n==== ENTRENADOR DE ARGENTINA COMIENDO ====");
        dtArgentina.comer();

        System.out.println("\n==== FISIOTERAPEUTA DE ESPAÑA CONCENTRÁNDOSE ====");
        fisioEsp.concentrarse();

        System.out.println("\n==== INTEGRANTES DE CADA SELECCIÓN ====");
        argentina.listarIntegrantes();
        espana.listarIntegrantes();

        System.out.println("\n==== FUTBOLISTAS CON SOBREPESO EN ARGENTINA ====");
        argentina.listarFutbolistasSobrepeso();
    }
}
