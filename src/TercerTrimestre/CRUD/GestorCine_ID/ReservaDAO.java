package TercerTrimestre.CRUD.GestorCine_ID;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO {

    // Registrar reserva con ID manual
    public boolean registrarReserva(Reserva reserva) {
        String sql = "INSERT INTO Reservas (ID_Reserva, ID_Pelicula, ID_Sala, Fecha, Hora, Nombre_Cliente, Asientos_Reservados) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, reserva.getId());
            ps.setInt(2, reserva.getIdPelicula());
            ps.setInt(3, reserva.getIdSala());
            ps.setDate(4, reserva.getFecha());
            ps.setTime(5, reserva.getHora());
            ps.setString(6, reserva.getNombreCliente());
            ps.setInt(7, reserva.getAsientosReservados());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al registrar reserva manual: " + e.getMessage());
            return false;
        }
    }

    // Listar reservas ordenadas por fecha y hora
    public List<Reserva> listarReservas() {
        List<Reserva> lista = new ArrayList<>();
        String sql = "SELECT * FROM Reservas ORDER BY Fecha, Hora";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(mapearReserva(rs));
            }
        } catch (SQLException e) {
            System.out.println("Error al listar reservas: " + e.getMessage());
        }
        return lista;
    }

    // Buscar por campo genérico
    public List<Reserva> buscarPorCampo(String campo, String valor) {
        List<Reserva> lista = new ArrayList<>();
        String sql = "SELECT * FROM Reservas WHERE " + campo + " LIKE ?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, "%" + valor + "%");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    lista.add(mapearReserva(rs));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar reserva por " + campo + ": " + e.getMessage());
        }
        return lista;
    }

    // Eliminar reserva por ID
    public boolean eliminarReserva(int id) {
        String sql = "DELETE FROM Reservas WHERE ID_Reserva=?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar reserva: " + e.getMessage());
            return false;
        }
    }

    // Resetear todas las reservas manualmente
    public boolean resetearReservas() {
        String sqlDelete = "DELETE FROM Reservas";
        try (Connection conexion = ConexionBD.conectar();
             Statement stmt = conexion.createStatement()) {

            stmt.executeUpdate(sqlDelete);
            return true;
        } catch (SQLException e) {
            System.out.println("Error al resetear reservas: " + e.getMessage());
            return false;
        }
    }

    // Métodos para actualizar campos individuales
    public boolean actualizarFecha(int id, Date nuevaFecha) {
        String sql = "UPDATE Reservas SET Fecha=? WHERE ID_Reserva=?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setDate(1, nuevaFecha);
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar fecha: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarHora(int id, Time nuevaHora) {
        String sql = "UPDATE Reservas SET Hora=? WHERE ID_Reserva=?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setTime(1, nuevaHora);
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar hora: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarCliente(int id, String nuevoCliente) {
        String sql = "UPDATE Reservas SET Nombre_Cliente=? WHERE ID_Reserva=?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, nuevoCliente);
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar cliente: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarAsientos(int id, int nuevosAsientos) {
        String sql = "UPDATE Reservas SET Asientos_Reservados=? WHERE ID_Reserva=?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, nuevosAsientos);
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar asientos: " + e.getMessage());
            return false;
        }
    }

    // Auxiliar para mapear ResultSet a Reserva
    private Reserva mapearReserva(ResultSet rs) throws SQLException {
        return new Reserva(
                rs.getInt("ID_Reserva"),
                rs.getInt("ID_Pelicula"),
                rs.getInt("ID_Sala"),
                rs.getDate("Fecha"),
                rs.getTime("Hora"),
                rs.getString("Nombre_Cliente"),
                rs.getInt("Asientos_Reservados")
        );
    }
}
