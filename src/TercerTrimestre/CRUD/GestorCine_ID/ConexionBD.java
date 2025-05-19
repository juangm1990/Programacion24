package TercerTrimestre.CRUD.GestorCine_ID;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/CineManual";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = ""; // Ajusta si tienes clave

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos CineManual: " + e.getMessage());
            return null;
        }
    }
}