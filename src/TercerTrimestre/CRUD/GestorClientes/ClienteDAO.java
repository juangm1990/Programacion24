package TercerTrimestre.CRUD.GestorClientes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    // Insertar cliente sin ID manual
    public void insertar(Cliente cliente) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "INSERT INTO Clientes (Nombre, Apellidos, Email, Telefono) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellidos());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefono());
            stmt.executeUpdate();
            System.out.println("Cliente registrado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al registrar cliente: " + e.getMessage());
        }
    }

    // Obtener todos los clientes en orden ascendente o descendente
    private List<Cliente> obtenerClientesOrdenados(String orden) {
        List<Cliente> clientes = new ArrayList<>();
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "SELECT * FROM Clientes ORDER BY ID " + orden;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Cliente cliente = new Cliente(
                    rs.getInt("ID"),
                    rs.getString("Nombre"),
                    rs.getString("Apellidos"),
                    rs.getString("Email"),
                    rs.getString("Telefono")
                );
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener clientes: " + e.getMessage());
        }
        return clientes;
    }

    public List<Cliente> obtenerTodosAscendente() {
        return obtenerClientesOrdenados("ASC");
    }

    public List<Cliente> obtenerTodosDescendente() {
        return obtenerClientesOrdenados("DESC");
    }

    // Modificar cliente completo
    public void modificar(Cliente cliente) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "UPDATE Clientes SET Nombre = ?, Apellidos = ?, Email = ?, Telefono = ? WHERE ID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellidos());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefono());
            stmt.setInt(5, cliente.getId());
            stmt.executeUpdate();
            System.out.println("Cliente modificado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al modificar cliente: " + e.getMessage());
        }
    }

    // Actualizar campo individual
    public void actualizarCampo(int id, String campo, String nuevoValor) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "UPDATE Clientes SET " + campo + " = ? WHERE ID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nuevoValor);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            System.out.println("Campo actualizado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al actualizar campo: " + e.getMessage());
        }
    }

    // Eliminar cliente
    public void eliminar(int id) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "DELETE FROM Clientes WHERE ID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Cliente eliminado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e.getMessage());
        }
    }

    // Buscar por ID
    public Cliente buscarPorId(int id) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "SELECT * FROM Clientes WHERE ID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Cliente(
                    rs.getInt("ID"),
                    rs.getString("Nombre"),
                    rs.getString("Apellidos"),
                    rs.getString("Email"),
                    rs.getString("Telefono")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar cliente: " + e.getMessage());
        }
        return null;
    }

    // Buscar por campo
    public List<Cliente> buscarPorCampo(String campo, String valor) {
        List<Cliente> resultados = new ArrayList<>();
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "SELECT * FROM Clientes WHERE " + campo + " LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + valor + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente(
                    rs.getInt("ID"),
                    rs.getString("Nombre"),
                    rs.getString("Apellidos"),
                    rs.getString("Email"),
                    rs.getString("Telefono")
                );
                resultados.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar clientes: " + e.getMessage());
        }
        return resultados;
    }

    // Resetear tabla Clientes
    public void resetearBaseDeDatos() {
        try (Connection conn = ConexionBD.conectar()) {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM Clientes");
            stmt.executeUpdate("ALTER TABLE Clientes AUTO_INCREMENT = 1");
            System.out.println("Base de datos reseteada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al resetear la base de datos: " + e.getMessage());
        }
    }
}
