package PrimerTrimestre.Examenes.Practica7;


public class Main {
    public static void main(String[] args) throws Exception {

        // Crear el Mundial
        Mundial mundial_2022 = new Mundial(1, 2022);
        System.out.println("Mundial " + mundial_2022.getAnyo() + " creado.");

        // Crear las Selecciones
        mundial_2022.anyadirSeleccion(1, "España");
        mundial_2022.anyadirSeleccion(2, "Argentina");

        // Asignar el Mundial a las selecciones
        mundial_2022.getSeleccion(1).asignarMundial(mundial_2022);
        mundial_2022.getSeleccion(2).asignarMundial(mundial_2022);

        System.out.println("\nSelecciones asignadas al Mundial:");
        // Mostrar las selecciones
        System.out.println("Selección 1: " + mundial_2022.getSeleccion(1).getNombre());
        System.out.println("Selección 2: " + mundial_2022.getSeleccion(2).getNombre());

        ///////////// FUTBOLISTAS SELECCIÓN ESPAÑOLA /////////////
        Futbolista es1 = new Futbolista(1, "Unai", "Simón Mendibil", "1997-06-11", 88, 1.90, 23, "Portero");
        mundial_2022.getSeleccion(1).anadirPersona(es1);
        Futbolista es2 = new Futbolista(2, "César", "Azpilicueta Tanco", "1989-08-28", 78, 1.78, 2, "Defensa");
        mundial_2022.getSeleccion(1).anadirPersona(es2);
        Futbolista es3 = new Futbolista(3, "Eric", "García Martret", "2001-01-09", 73, 1.83, 3, "Defensa");
        mundial_2022.getSeleccion(1).anadirPersona(es3);
        Futbolista es4 = new Futbolista(4, "Pau", "Torres Ayala", "1997-01-16", 80, 1.91, 4, "Defensa");
        mundial_2022.getSeleccion(1).anadirPersona(es4);
        Futbolista es5 = new Futbolista(5, "Jordi", "Alba Ramos", "1989-03-21", 68, 1.70, 18, "Defensa");
        mundial_2022.getSeleccion(1).anadirPersona(es5);
        Futbolista es6 = new Futbolista(6, "Rodri", "Hernández Cascante", "1996-06-22", 82, 1.91, 16, "Centrocampista");
        mundial_2022.getSeleccion(1).anadirPersona(es6);
        Futbolista es7 = new Futbolista(7, "Gavi", "Paéz Gavira", "2004-08-05", 68, 1.73, 9, "Centrocampista");
        mundial_2022.getSeleccion(1).anadirPersona(es7);
        Futbolista es8 = new Futbolista(8, "Pedri", "González López", "2002-11-25", 60, 1.74, 26, "Centrocampista");
        mundial_2022.getSeleccion(1).anadirPersona(es8);
        Futbolista es9 = new Futbolista(9, "Sergio", "Busquets Burgos", "1988-07-16", 76, 1.89, 5, "Centrocampista");
        mundial_2022.getSeleccion(1).anadirPersona(es9);
        Futbolista es10 = new Futbolista(10, "Koke", "Resurrección Merodio", "1992-01-08", 77, 1.78, 8, "Centrocampista");
        mundial_2022.getSeleccion(1).anadirPersona(es10);
        Futbolista es11 = new Futbolista(11, "Dani", "Olmo Carvajal", "1998-05-07", 72, 1.79, 21, "Delantero");
        mundial_2022.getSeleccion(1).anadirPersona(es11);
        Futbolista es12 = new Futbolista(12, "Ferran", "Torres García", "2000-02-29", 77, 1.84, 11, "Delantero");
        mundial_2022.getSeleccion(1).anadirPersona(es12);

        // Entrenador y Fisioterapeuta para la selección de España
        Entrenador entrenadorES = new Entrenador(13, "Luis", "Enrique Martínez", "1970-05-08", 80, 1.80, 1);
        mundial_2022.getSeleccion(1).anadirPersona(entrenadorES);
        
        Fisioterapeuta fisioES = new Fisioterapeuta(14, "Manolo", "García Pérez", "02/12/2000", 80.2, 1.80, "Fisioterapeuta", 3);
        mundial_2022.getSeleccion(1).anadirPersona(fisioES);

        ///////////// FUTBOLISTAS SELECCIÓN ARGENTINA /////////////
        Futbolista ar1 = new Futbolista(1, "Emiliano", "Martínez", "1992-09-02", 95, 1.97, 23, "Portero");
        mundial_2022.getSeleccion(2).anadirPersona(ar1);
        Futbolista ar2 = new Futbolista(2, "Nahuel", "Molina Lucero", "1997-04-06", 73, 1.78, 2, "Defensa");
        mundial_2022.getSeleccion(2).anadirPersona(ar2);
        Futbolista ar3 = new Futbolista(3, "Germán", "Pezzella", "1991-06-27", 81, 1.86, 6, "Defensa");
        mundial_2022.getSeleccion(2).anadirPersona(ar3);
        Futbolista ar4 = new Futbolista(4, "Nicolás", "Otamendi", "1988-02-12", 79, 1.83, 19, "Defensa");
        mundial_2022.getSeleccion(2).anadirPersona(ar4);
        Futbolista ar5 = new Futbolista(5, "Lisandro", "Martínez", "1998-01-18", 70, 1.75, 25, "Defensa");
        mundial_2022.getSeleccion(2).anadirPersona(ar5);
        Futbolista ar6 = new Futbolista(6, "Marcos", "Acuña", "1991-10-28", 70, 1.74, 8, "Defensa");
        mundial_2022.getSeleccion(2).anadirPersona(ar6);
        Futbolista ar7 = new Futbolista(7, "Julián", "Álvarez", "2000-01-31", 70, 1.73, 9, "Delantero");
        mundial_2022.getSeleccion(2).anadirPersona(ar7);
        Futbolista ar8 = new Futbolista(8, "Enzo", "Fernández", "2001-01-17", 73, 1.80, 24, "Centrocampista");
        mundial_2022.getSeleccion(2).anadirPersona(ar8);
        Futbolista ar9 = new Futbolista(9, "Rodrigo", "De Paul", "1994-05-24", 76, 1.82, 7, "Centrocampista");
        mundial_2022.getSeleccion(2).anadirPersona(ar9);
        Futbolista ar10 = new Futbolista(10, "Leandro", "Paredes", "1994-06-29", 75, 1.80, 5, "Centrocampista");
        mundial_2022.getSeleccion(2).anadirPersona(ar10);
        Futbolista ar11 = new Futbolista(11, "Ángel", "Di María", "1988-02-14", 75, 1.79, 11, "Delantero");
        mundial_2022.getSeleccion(2).anadirPersona(ar11);
        Futbolista ar12 = new Futbolista(12, "Lionel", "Messi", "1987-06-24", 72, 1.70, 10, "Delantero");
        mundial_2022.getSeleccion(2).anadirPersona(ar12);

        // Entrenador y Fisioterapeuta para la selección de Argentina
        Entrenador entrenadorAR = new Entrenador(13, "Lionel", "Scaloni", "1978-05-16", 80, 1.80, 2);
        mundial_2022.getSeleccion(2).anadirPersona(entrenadorAR);
        
        Fisioterapeuta fisioAR = new Fisioterapeuta(14, "Pepe", "Moyano Torres", "06/10/1999", 75.6, 1.76, "Fisioterapeuta", 5);
        mundial_2022.getSeleccion(2).anadirPersona(fisioAR);

        ///////////////////////////////////

        // Selección de España
        System.out.println("---------------------------------------------------------");
        System.out.println("Integrantes de la Selección de España:");
        mundial_2022.getSeleccion(1).listarIntegrantes();

        // Selección de Argentina
        System.out.println("---------------------------------------------------------");
        System.out.println("Integrantes de la Selección de Argentina:");
        mundial_2022.getSeleccion(2).listarIntegrantes();

        // Jugadores con sobrepeso de España
        System.out.println("---------------------------------------------------------");
        System.out.println("Futbolistas con sobrepeso en la Selección de España:");
        mundial_2022.getSeleccion(1).listarFutbolistasSobrepeso();

        // Jugadores con sobrepeso de Argentina
        System.out.println("---------------------------------------------------------");
        System.out.println("Integrantes de la Selección de Argentina con sobrepeso:");
        mundial_2022.getSeleccion(2).listarIntegrantes();

        // Fisioterapeutas
        System.out.println("---------------------------------------------------------");
        System.out.println("Estado del fisioterapeuta de España:");
        mundial_2022.getSeleccion(1).concentrarFisioterapeuta();  
        System.out.println("Estado del fisioterapeuta de Argentina:");
        mundial_2022.getSeleccion(2).concentrarFisioterapeuta();  
    }
}
