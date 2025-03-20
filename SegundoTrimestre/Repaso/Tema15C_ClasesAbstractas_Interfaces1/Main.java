package SegundoTrimestre.Repaso.Tema15C_ClasesAbstractas_Interfaces1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear ArratList para la lista de jugadores
        List<Jugador> jugadores = new ArrayList<>();

        // Agregar jugadores (Delantero y Portero)
        jugadores.add(new Portero("Iker Casillas", 1, "Portero"));
        jugadores.add(new Delantero("Cristiano Ronaldo", 10, "Delantero"));

        for (int i = 0; i < jugadores.size(); i++) {
            Jugador jugador = jugadores.get(i);
            System.out.println(jugador.toString()); // Mostrar información

                // Tenemos que comprobar si es Portero/Delantero y llamarlo para la instancia entrenar()
                if (jugador instanceof Portero) {
                    ((Portero) jugador).entrenar();
                }

                else if (jugador instanceof Delantero) {
                    ((Delantero) jugador).entrenar();
                }

            jugador.accionEspecial(); // Ejecutar acción especial
            System.out.println(); // Espacio para mejor visualización en la consola

        }
    }
}