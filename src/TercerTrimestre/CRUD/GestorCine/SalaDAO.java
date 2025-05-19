package TercerTrimestre.CRUD.GestorCine;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SalaDAO {

    public void insertar(Sala sala) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "INSERT INTO Salas (Nombre, Capacidad) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, sala.getNombre());
            stmt.setInt(2, sala.getCapacidad());
            stmt.executeUpdate();
            System.out.println("Sala registrada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al registrar sala: " + e.getMessage());
        }
    }

    public List<Sala> obtenerTodosAscendente() {
        return obtenerSalasOrdenadas("ASC");
    }

    public List<Sala> obtenerTodosDescendente() {
        return obtenerSalasOrdenadas("DESC");
    }

    private List<Sala> obtenerSalasOrdenadas(String orden) {
        List<Sala> salas = new ArrayList<>();
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "SELECT * FROM Salas ORDER BY ID_Sala " + orden;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Sala sala = new Sala(
                    rs.getInt("ID_Sala"),
                    rs.getString("Nombre"),
                    rs.getInt("Capacidad")
                );
                salas.add(sala);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener salas: " + e.getMessage());
        }
        return salas;
    }

    public void modificar(Sala sala) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "UPDATE Salas SET Nombre = ?, Capacidad = ? WHERE ID_Sala = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, sala.getNombre());
            stmt.setInt(2, sala.getCapacidad());
            stmt.setInt(3, sala.getId());
            stmt.executeUpdate();
            System.out.println("Sala modificada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al modificar sala: " + e.getMessage());
        }
    }

    public void actualizarCampo(int id, String campo, String nuevoValor) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "UPDATE Salas SET " + campo + " = ? WHERE ID_Sala = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            if (campo.equals("Capacidad")) {
                stmt.setInt(1, Integer.parseInt(nuevoValor));
            } else {
                stmt.setString(1, nuevoValor);
            }
            stmt.setInt(2, id);
            stmt.executeUpdate();
            System.out.println("Campo actualizado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al actualizar campo: " + e.getMessage());
        }
    }

    public void eliminar(int id) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "DELETE FROM Salas WHERE ID_Sala = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Sala eliminada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar sala: " + e.getMessage());
        }
    }

    public Sala buscarPorId(int id) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "SELECT * FROM Salas WHERE ID_Sala = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Sala(
                    rs.getInt("ID_Sala"),
                    rs.getString("Nombre"),
                    rs.getInt("Capacidad")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar sala: " + e.getMessage());
        }
        return null;
    }

    public List<Sala> buscarPorCampo(String campo, String valor) {
        List<Sala> resultados = new ArrayList<>();
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "SELECT * FROM Salas WHERE " + campo + " LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + valor + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Sala sala = new Sala(
                    rs.getInt("ID_Sala"),
                    rs.getString("Nombre"),
                    rs.getInt("Capacidad")
                );
                resultados.add(sala);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar salas: " + e.getMessage());
        }
        return resultados;
    }

    public void resetearBaseDeDatos() {
        try (Connection conn = ConexionBD.conectar()) {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM Salas");
            stmt.executeUpdate("ALTER TABLE Salas AUTO_INCREMENT = 1");
            System.out.println("Base de datos de salas reseteada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al resetear base de datos: " + e.getMessage());
        }
    }
}