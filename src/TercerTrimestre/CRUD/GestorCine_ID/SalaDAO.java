package TercerTrimestre.CRUD.GestorCine_ID;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SalaDAO {

    // Registrar sala con ID manual
    public boolean registrarSala(Sala sala) {
        String sql = "INSERT INTO Salas (ID_Sala, Nombre, Capacidad) VALUES (?, ?, ?)";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, sala.getId());
            ps.setString(2, sala.getNombre());
            ps.setInt(3, sala.getCapacidad());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al registrar sala manual: " + e.getMessage());
            return false;
        }
    }

    // Listar salas ordenadas por ID (ascendente o descendente)
    public List<Sala> listarSalas(boolean ascendente) {
        List<Sala> lista = new ArrayList<>();
        String orden = ascendente ? "ASC" : "DESC";
        String sql = "SELECT * FROM Salas ORDER BY ID_Sala " + orden;

        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Sala s = new Sala(
                        rs.getInt("ID_Sala"),
                        rs.getString("Nombre"),
                        rs.getInt("Capacidad")
                );
                lista.add(s);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar salas: " + e.getMessage());
        }
        return lista;
    }

    // Actualizar sala completa
    public boolean actualizarSala(Sala sala) {
        String sql = "UPDATE Salas SET Nombre=?, Capacidad=? WHERE ID_Sala=?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, sala.getNombre());
            ps.setInt(2, sala.getCapacidad());
            ps.setInt(3, sala.getId());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar sala: " + e.getMessage());
            return false;
        }
    }

    // Eliminar sala por ID
    public boolean eliminarSala(int id) {
        String sql = "DELETE FROM Salas WHERE ID_Sala=?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar sala: " + e.getMessage());
            return false;
        }
    }

    // Resetear todas las salas manualmente
    public boolean resetearSalas() {
        String sqlDelete = "DELETE FROM Salas";
        try (Connection conexion = ConexionBD.conectar();
             Statement stmt = conexion.createStatement()) {

            stmt.executeUpdate(sqlDelete);
            return true;
        } catch (SQLException e) {
            System.out.println("Error al resetear salas: " + e.getMessage());
            return false;
        }
    }

    // Buscar por campo genérico
    public List<Sala> buscarPorCampo(String campo, String valor) {
        List<Sala> lista = new ArrayList<>();
        String sql = "SELECT * FROM Salas WHERE " + campo + " LIKE ?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, "%" + valor + "%");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    lista.add(new Sala(
                        rs.getInt("ID_Sala"),
                        rs.getString("Nombre"),
                        rs.getInt("Capacidad")
                    ));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar sala por " + campo + ": " + e.getMessage());
        }
        return lista;
    }

    public List<Sala> buscarPorNombre(String nombre) {
        return buscarPorCampo("Nombre", nombre);
    }

    public List<Sala> buscarPorCapacidad(int capacidad) {
        return buscarPorCampo("Capacidad", String.valueOf(capacidad));
    }

    // Métodos para actualizar campos individuales
    public boolean actualizarNombre(int id, String nuevoNombre) {
        String sql = "UPDATE Salas SET Nombre=? WHERE ID_Sala=?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, nuevoNombre);
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar nombre: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarCapacidad(int id, int nuevaCapacidad) {
        String sql = "UPDATE Salas SET Capacidad=? WHERE ID_Sala=?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, nuevaCapacidad);
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar capacidad: " + e.getMessage());
            return false;
        }
    }
}