package PrimerTrimestre.TareasPracticasClase.Tarea_10;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Mundial mundial2010 = new Mundial(19, 2010);

        SeleccionFutbol espanya = new SeleccionFutbol(1, "España");
        SeleccionFutbol holanda = new SeleccionFutbol(2, "Holanda");

        mundial2010.anyadirSeleccion(1, "España");
        mundial2010.anyadirSeleccion(2, "Holanda");

        /* AÑADIR ENTRENADORES Y EQUIPOS */
        Entrenador entrenadorEspanya = new Entrenador(101, "Vicente", "Del Bosque", "1950-12-23", 85.0, 1.78, 1001);
        Entrenador entrenadorHolanda = new Entrenador(102, "Bert", "Van Marwijk", "1952-05-19", 80.0, 1.75, 1002);

        espanya.personas.add(entrenadorEspanya);
        holanda.personas.add(entrenadorHolanda);

        /* JUGADORES DE ESPAÑA */
        espanya.jugadores.add(new Futbolista(1, "Iker", "Casillas", "1981-05-20", 84.0, 1.85, 1, "Portero"));
        espanya.jugadores.add(new Futbolista(2, "Sergio", "Ramos", "1986-03-30", 81.0, 1.84, 15, "Defensa"));
        espanya.jugadores.add(new Futbolista(3, "Gerard", "Piqué", "1987-02-02", 85.0, 1.94, 3, "Defensa"));
        espanya.jugadores.add(new Futbolista(4, "Carles", "Puyol", "1978-04-13", 80.0, 1.78, 5, "Defensa"));
        espanya.jugadores.add(new Futbolista(5, "Joan", "Capdevila", "1978-02-03", 81.0, 1.82, 11, "Defensa"));
        espanya.jugadores.add(new Futbolista(6, "Xavi", "Hernández", "1980-01-25", 68.0, 1.70, 8, "Centrocampista"));
        espanya.jugadores.add(new Futbolista(7, "Sergio", "Busquets", "1988-07-16", 76.0, 1.89, 16, "Centrocampista"));
        espanya.jugadores.add(new Futbolista(8, "Andrés", "Iniesta", "1984-05-11", 68.0, 1.71, 6, "Centrocampista"));
        espanya.jugadores.add(new Futbolista(9, "David", "Villa", "1981-12-03", 69.0, 1.75, 7, "Delantero"));
        espanya.jugadores.add(new Futbolista(10, "Fernando", "Torres", "1984-03-20", 78.0, 1.86, 9, "Delantero"));
        espanya.jugadores.add(new Futbolista(11, "Pedro", "Rodríguez", "1987-07-28", 64.0, 1.69, 18, "Delantero"));

        System.out.println("Jugadores de España:");
        for (int i = 0; i < espanya.jugadores.size(); i++) {
            System.out.println(espanya.jugadores.get(i));
        }

        System.out.println();

        /* JUGADORES DE HOLANDA */
        holanda.jugadores.add(new Futbolista(1, "Maarten", "Stekelenburg", "1982-09-22", 84.0, 1.97, 1, "Portero"));
        holanda.jugadores.add(new Futbolista(2, "Gregory", "Van der Wiel", "1988-02-03", 69.0, 1.80, 2, "Defensa"));
        holanda.jugadores.add(new Futbolista(3, "John", "Heitinga", "1983-11-15", 77.0, 1.80, 3, "Defensa"));
        holanda.jugadores.add(new Futbolista(4, "Joris", "Mathijsen", "1980-04-05", 85.0, 1.82, 4, "Defensa"));
        holanda.jugadores.add(new Futbolista(5, "Giovanni", "Van Bronckhorst", "1975-02-05", 75.0, 1.78, 5, "Defensa"));
        holanda.jugadores.add(new Futbolista(6, "Mark", "Van Bommel", "1977-04-22", 85.0, 1.87, 6, "Centrocampista"));
        holanda.jugadores.add(new Futbolista(7, "Nigel", "De Jong", "1984-11-30", 77.0, 1.74, 8, "Centrocampista"));
        holanda.jugadores.add(new Futbolista(8, "Arjen", "Robben", "1984-01-23", 80.0, 1.80, 11, "Delantero"));
        holanda.jugadores.add(new Futbolista(9, "Wesley", "Sneijder", "1984-06-09", 70.0, 1.70, 10, "Centrocampista"));
        holanda.jugadores.add(new Futbolista(10, "Dirk", "Kuyt", "1980-07-22", 77.0, 1.84, 7, "Delantero"));
        holanda.jugadores.add(new Futbolista(11, "Robin", "Van Persie", "1983-08-06", 73.0, 1.88, 9, "Delantero"));

        System.out.println("Jugadores de Holanda:");
        for (int i = 0; i < holanda.jugadores.size(); i++) {
            System.out.println(holanda.jugadores.get(i));
        }

        System.out.println();

        /* ENTRENADORES */
        System.out.println("Entrenador de España: " + entrenadorEspanya);
        System.out.println("Entrenador de Holanda: " + entrenadorHolanda);

        System.out.println();

        /* JUGADORES CON SOBREPESO */
        System.out.println("Jugadores de España con sobrepeso:");
        for (int i = 0; i < espanya.jugadores.size(); i++) {
            Futbolista jugador = espanya.jugadores.get(i);
            if (jugador.tieneSobrepeso()) {
                System.out.println(jugador);
            }
        }

        System.out.println();
        
        System.out.println("Jugadores de Holanda con sobrepeso:");
        for (int i = 0; i < holanda.jugadores.size(); i++) {
            Futbolista jugador = holanda.jugadores.get(i);
            if (jugador.tieneSobrepeso()) {
                System.out.println(jugador);
            }
        }
        
    }
}
