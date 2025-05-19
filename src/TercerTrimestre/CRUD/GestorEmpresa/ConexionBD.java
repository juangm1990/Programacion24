package TercerTrimestre.CRUD.GestorEmpresa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/Empresa";
    private static final String USUARIO = "root";
    private static final String CLAVE = "";

    // Método para conectar a la base de datos
    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CLAVE);
    }

    // Método para cerrar la conexión
    public static void desconectar(Connection conn) {
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.out.println("Error al desconectar: " + e.getMessage());
        }
    }
}
