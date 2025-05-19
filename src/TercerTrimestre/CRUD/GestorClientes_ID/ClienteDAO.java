package TercerTrimestre.CRUD.GestorClientes_ID;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public boolean registrarCliente(Cliente cliente) {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        boolean registrado = false;

        try {
            conexion = ConexionBD.conectar();
            String sql = "INSERT INTO Clientes (id, nombre, apellidos, email, telefono) VALUES (?, ?, ?, ?, ?)";
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, cliente.getId());
            sentencia.setString(2, cliente.getNombre());
            sentencia.setString(3, cliente.getApellidos());
            sentencia.setString(4, cliente.getEmail());
            sentencia.setString(5, cliente.getTelefono());

            int filas = sentencia.executeUpdate();
            registrado = (filas > 0);

        } catch (SQLException e) {
            System.out.println("Error al registrar cliente: " + e.getMessage());
        } finally {
            try {
                if (sentencia != null) sentencia.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }

        return registrado;
    }

    public List<Cliente> listarClientes(boolean ascendente) {
        List<Cliente> lista = new ArrayList<>();
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;

        try {
            conexion = ConexionBD.conectar();
            String orden = ascendente ? "ASC" : "DESC";
            String sql = "SELECT * FROM Clientes ORDER BY id " + orden;
            sentencia = conexion.prepareStatement(sql);
            resultado = sentencia.executeQuery();

            while (resultado.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(resultado.getInt("id"));
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setApellidos(resultado.getString("apellidos"));
                cliente.setEmail(resultado.getString("email"));
                cliente.setTelefono(resultado.getString("telefono"));
                lista.add(cliente);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar clientes: " + e.getMessage());
        } finally {
            try {
                if (resultado != null) resultado.close();
                if (sentencia != null) sentencia.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }

        return lista;
    }

    public boolean actualizarCliente(Cliente cliente) {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        boolean actualizado = false;

        try {
            conexion = ConexionBD.conectar();
            String sql = "UPDATE Clientes SET nombre = ?, apellidos = ?, email = ?, telefono = ? WHERE id = ?";
            sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, cliente.getNombre());
            sentencia.setString(2, cliente.getApellidos());
            sentencia.setString(3, cliente.getEmail());
            sentencia.setString(4, cliente.getTelefono());
            sentencia.setInt(5, cliente.getId());

            int filas = sentencia.executeUpdate();
            actualizado = (filas > 0);

        } catch (SQLException e) {
            System.out.println("Error al actualizar cliente: " + e.getMessage());
        } finally {
            try {
                if (sentencia != null) sentencia.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }

        return actualizado;
    }

    public boolean eliminarCliente(int id) {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        boolean eliminado = false;

        try {
            conexion = ConexionBD.conectar();
            String sql = "DELETE FROM Clientes WHERE id = ?";
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, id);

            int filas = sentencia.executeUpdate();
            eliminado = (filas > 0);

        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e.getMessage());
        } finally {
            try {
                if (sentencia != null) sentencia.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }

        return eliminado;
    }

    public Cliente buscarPorId(int id) {
        Cliente cliente = null;
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;

        try {
            conexion = ConexionBD.conectar();
            String sql = "SELECT * FROM Clientes WHERE id = ?";
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, id);
            resultado = sentencia.executeQuery();

            if (resultado.next()) {
                cliente = new Cliente();
                cliente.setId(resultado.getInt("id"));
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setApellidos(resultado.getString("apellidos"));
                cliente.setEmail(resultado.getString("email"));
                cliente.setTelefono(resultado.getString("telefono"));
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar por ID: " + e.getMessage());
        } finally {
            try {
                if (resultado != null) resultado.close();
                if (sentencia != null) sentencia.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }

        return cliente;
    }

    public List<Cliente> buscarPorCampo(String campo, String valor) {
        List<Cliente> lista = new ArrayList<>();
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;

        try {
            conexion = ConexionBD.conectar();
            String sql = "SELECT * FROM Clientes WHERE " + campo + " LIKE ?";
            sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, "%" + valor + "%");
            resultado = sentencia.executeQuery();

            while (resultado.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(resultado.getInt("id"));
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setApellidos(resultado.getString("apellidos"));
                cliente.setEmail(resultado.getString("email"));
                cliente.setTelefono(resultado.getString("telefono"));
                lista.add(cliente);
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar por campo: " + e.getMessage());
        } finally {
            try {
                if (resultado != null) resultado.close();
                if (sentencia != null) sentencia.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }

        return lista;
    }

    public boolean resetearBaseDeDatos() {
        Connection conexion = null;
        PreparedStatement borrar = null;
        boolean exito = false;

        try {
            conexion = ConexionBD.conectar();
            borrar = conexion.prepareStatement("DELETE FROM Clientes");
            borrar.executeUpdate();
            exito = true;

        } catch (SQLException e) {
            System.out.println("Error al resetear base de datos: " + e.getMessage());
        } finally {
            try {
                if (borrar != null) borrar.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }

        return exito;
    }
}
