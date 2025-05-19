package TercerTrimestre.CRUD.GestorEmpresa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {

    // Insertar nuevo empleado (sin ID manual)
    public void insertar(Empleado empleado) {
        String sql = "INSERT INTO Empleados (Nombre, Apellidos, Puesto, Salario) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getApellidos());
            stmt.setString(3, empleado.getPuesto());
            stmt.setDouble(4, empleado.getSalario());
            stmt.executeUpdate();
            System.out.println("Empleado registrado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al registrar empleado: " + e.getMessage());
        }
    }

    // Listar todos los empleados en orden ascendente
    public List<Empleado> obtenerTodosAscendente() {
        return obtenerEmpleadosOrdenados("ASC");
    }

    // Listar todos los empleados en orden descendente
    public List<Empleado> obtenerTodosDescendente() {
        return obtenerEmpleadosOrdenados("DESC");
    }

    // Método auxiliar para listar empleados
    private List<Empleado> obtenerEmpleadosOrdenados(String orden) {
        List<Empleado> lista = new ArrayList<>();
        String sql = "SELECT * FROM Empleados ORDER BY ID_Empleado " + orden;

        try (Connection conn = ConexionBD.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Empleado emp = new Empleado(
                    rs.getInt("ID_Empleado"),
                    rs.getString("Nombre"),
                    rs.getString("Apellidos"),
                    rs.getString("Puesto"),
                    rs.getDouble("Salario")
                );
                lista.add(emp);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener empleados: " + e.getMessage());
        }

        return lista;
    }

    // Modificar empleado completo
    public void modificar(Empleado empleado) {
        String sql = "UPDATE Empleados SET Nombre = ?, Apellidos = ?, Puesto = ?, Salario = ? WHERE ID_Empleado = ?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getApellidos());
            stmt.setString(3, empleado.getPuesto());
            stmt.setDouble(4, empleado.getSalario());
            stmt.setInt(5, empleado.getId());
            stmt.executeUpdate();
            System.out.println("Empleado modificado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al modificar empleado: " + e.getMessage());
        }
    }

    // Eliminar empleado
    public void eliminar(int id) {
        String sql = "DELETE FROM Empleados WHERE ID_Empleado = ?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Empleado eliminado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al eliminar empleado: " + e.getMessage());
        }
    }

    // Buscar empleado por ID
    public Empleado buscarPorId(int id) {
        String sql = "SELECT * FROM Empleados WHERE ID_Empleado = ?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Empleado(
                    rs.getInt("ID_Empleado"),
                    rs.getString("Nombre"),
                    rs.getString("Apellidos"),
                    rs.getString("Puesto"),
                    rs.getDouble("Salario")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar empleado: " + e.getMessage());
        }

        return null;
    }

    // Resetear tabla Empleados
    public void resetearBaseDeDatos() {
        try (Connection conn = ConexionBD.conectar();
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate("DELETE FROM Empleados");
            stmt.executeUpdate("ALTER TABLE Empleados AUTO_INCREMENT = 1");
            System.out.println("Base de datos de empleados reseteada correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al resetear base de datos: " + e.getMessage());
        }
    }
}
