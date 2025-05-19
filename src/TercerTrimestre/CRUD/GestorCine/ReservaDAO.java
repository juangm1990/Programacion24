package TercerTrimestre.CRUD.GestorCine;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO {

    public void insertar(Reserva reserva) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "INSERT INTO Reservas (ID_Pelicula, ID_Sala, Fecha, Hora, Nombre_Cliente, Asientos_Reservados) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, reserva.getPeliculaID());
            stmt.setInt(2, reserva.getSalaID());
            stmt.setDate(3, reserva.getFecha());
            stmt.setTime(4, reserva.getHora());
            stmt.setString(5, reserva.getCliente());
            stmt.setInt(6, reserva.getAsientos());
            stmt.executeUpdate();
            System.out.println("Reserva registrada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al registrar reserva: " + e.getMessage());
        }
    }

    public List<Reserva> obtenerTodosAscendente() {
        return obtenerReservasOrdenadas("ASC");
    }

    public List<Reserva> obtenerTodosDescendente() {
        return obtenerReservasOrdenadas("DESC");
    }

    private List<Reserva> obtenerReservasOrdenadas(String orden) {
        List<Reserva> reservas = new ArrayList<>();
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "SELECT * FROM Reservas ORDER BY ID_Reserva " + orden;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Reserva reserva = new Reserva(
                    rs.getInt("ID_Reserva"),
                    rs.getInt("ID_Pelicula"),
                    rs.getInt("ID_Sala"),
                    rs.getDate("Fecha"),
                    rs.getTime("Hora"),
                    rs.getString("Nombre_Cliente"),
                    rs.getInt("Asientos_Reservados")
                );
                reservas.add(reserva);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener reservas: " + e.getMessage());
        }
        return reservas;
    }

    public void modificar(Reserva reserva) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "UPDATE Reservas SET ID_Pelicula = ?, ID_Sala = ?, Fecha = ?, Hora = ?, Nombre_Cliente = ?, Asientos_Reservados = ? WHERE ID_Reserva = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, reserva.getPeliculaID());
            stmt.setInt(2, reserva.getSalaID());
            stmt.setDate(3, reserva.getFecha());
            stmt.setTime(4, reserva.getHora());
            stmt.setString(5, reserva.getCliente());
            stmt.setInt(6, reserva.getAsientos());
            stmt.setInt(7, reserva.getId());
            stmt.executeUpdate();
            System.out.println("Reserva modificada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al modificar reserva: " + e.getMessage());
        }
    }

    public void actualizarCampo(int id, String campo, String nuevoValor) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "UPDATE Reservas SET " + campo + " = ? WHERE ID_Reserva = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Tipo según campo
            if (campo.equals("ID_Pelicula") || campo.equals("ID_Sala") || campo.equals("Asientos_Reservados")) {
                stmt.setInt(1, Integer.parseInt(nuevoValor));
            } else if (campo.equals("Fecha")) {
                stmt.setDate(1, Date.valueOf(nuevoValor)); // formato: YYYY-MM-DD
            } else if (campo.equals("Hora")) {
                stmt.setTime(1, Time.valueOf(nuevoValor)); // formato: HH:MM:SS
            } else {
                stmt.setString(1, nuevoValor);
            }

            stmt.setInt(2, id);
            stmt.executeUpdate();
            System.out.println("Campo actualizado correctamente.");
        } catch (SQLException | IllegalArgumentException e) {
            System.out.println("Error al actualizar campo: " + e.getMessage());
        }
    }

    public void eliminar(int id) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "DELETE FROM Reservas WHERE ID_Reserva = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Reserva eliminada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar reserva: " + e.getMessage());
        }
    }

    public Reserva buscarPorId(int id) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "SELECT * FROM Reservas WHERE ID_Reserva = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
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
        } catch (SQLException e) {
            System.out.println("Error al buscar reserva: " + e.getMessage());
        }
        return null;
    }

    public List<Reserva> buscarPorCampo(String campo, String valor) {
        List<Reserva> resultados = new ArrayList<>();
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "SELECT * FROM Reservas WHERE " + campo + " LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + valor + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Reserva reserva = new Reserva(
                    rs.getInt("ID_Reserva"),
                    rs.getInt("ID_Pelicula"),
                    rs.getInt("ID_Sala"),
                    rs.getDate("Fecha"),
                    rs.getTime("Hora"),
                    rs.getString("Nombre_Cliente"),
                    rs.getInt("Asientos_Reservados")
                );
                resultados.add(reserva);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar reservas: " + e.getMessage());
        }
        return resultados;
    }

    public void resetearBaseDeDatos() {
        try (Connection conn = ConexionBD.conectar()) {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM Reservas");
            stmt.executeUpdate("ALTER TABLE Reservas AUTO_INCREMENT = 1");
            System.out.println("Base de datos de reservas reseteada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al resetear base de datos: " + e.getMessage());
        }
    }
}
