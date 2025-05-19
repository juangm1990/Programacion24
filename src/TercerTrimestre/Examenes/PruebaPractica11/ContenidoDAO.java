package TercerTrimestre.Examenes.PruebaPractica11;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContenidoDAO {

    public void insertar(Contenido contenido) {
        String sql = "INSERT INTO Contenido (titulo, tipo, genero, duracion_min, estreno, valoracion) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, contenido.getTitulo());
            stmt.setString(2, contenido.getTipo());
            stmt.setString(3, contenido.getGenero());
            stmt.setInt(4, contenido.getDuracion());
            stmt.setInt(5, contenido.getEstreno());
            stmt.setDouble(6, contenido.getValoracion());

            stmt.executeUpdate();
            System.out.println("Contenido insertado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al insertar contenido: " + e.getMessage());
        }
    }

    public List<Contenido> listarPorTipo() {
        List<Contenido> lista = new ArrayList<>();
        String sql = "SELECT * FROM Contenido ORDER BY tipo, titulo";

        try (Connection conn = ConexionBD.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Contenido c = new Contenido(
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("tipo"),
                    rs.getString("genero"),
                    rs.getInt("duracion_min"),
                    rs.getInt("estreno"),
                    rs.getDouble("valoracion")
                );
                lista.add(c);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar contenidos: " + e.getMessage());
        }

        return lista;
    }

    public void actualizar(Contenido contenido) {
        String sql = "UPDATE Contenido SET titulo = ?, tipo = ?, genero = ?, duracion_min = ?, estreno = ?, valoracion = ? WHERE id = ?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, contenido.getTitulo());
            stmt.setString(2, contenido.getTipo());
            stmt.setString(3, contenido.getGenero());
            stmt.setInt(4, contenido.getDuracion());
            stmt.setInt(5, contenido.getEstreno());
            stmt.setDouble(6, contenido.getValoracion());
            stmt.setInt(7, contenido.getId());

            stmt.executeUpdate();
            System.out.println("Contenido actualizado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al actualizar contenido: " + e.getMessage());
        }
    }

    public void eliminarPorId(int id) {
        String sql = "DELETE FROM Contenido WHERE id = ?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Contenido eliminado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar contenido: " + e.getMessage());
        }
    }

    public void eliminarPorTitulo(String titulo) {
        String sql = "DELETE FROM Contenido WHERE titulo = ?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, titulo);
            stmt.executeUpdate();
            System.out.println("Contenido eliminado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar contenido: " + e.getMessage());
        }
    }

    public Contenido obtenerPorId(int id) {
        String sql = "SELECT * FROM Contenido WHERE id = ?";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Contenido(
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("tipo"),
                    rs.getString("genero"),
                    rs.getInt("duracion_min"),
                    rs.getInt("estreno"),
                    rs.getDouble("valoracion")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener contenido: " + e.getMessage());
        }
        return null;
    }

    public List<Contenido> buscarPorPalabraClave(String palabra) {
        List<Contenido> lista = new ArrayList<>();
        String sql = "SELECT * FROM Contenido WHERE titulo LIKE ? OR genero LIKE ?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + palabra + "%");
            stmt.setString(2, "%" + palabra + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Contenido c = new Contenido(
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("tipo"),
                    rs.getString("genero"),
                    rs.getInt("duracion_min"),
                    rs.getInt("estreno"),
                    rs.getDouble("valoracion")
                );
                lista.add(c);
            }
        } catch (SQLException e) {
            System.out.println("Error en la búsqueda: " + e.getMessage());
        }

        return lista;
    }

    public List<Contenido> listarSinValoracion() {
        List<Contenido> lista = new ArrayList<>();
        String sql = "SELECT * FROM Contenido WHERE valoracion = 0.0";

        try (Connection conn = ConexionBD.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Contenido c = new Contenido(
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("tipo"),
                    rs.getString("genero"),
                    rs.getInt("duracion_min"),
                    rs.getInt("estreno"),
                    rs.getDouble("valoracion")
                );
                lista.add(c);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar sin valoración: " + e.getMessage());
        }

        return lista;
    }

    public List<Contenido> listarConValoracion() {
        List<Contenido> lista = new ArrayList<>();
        String sql = "SELECT * FROM Contenido WHERE valoracion > 0.0";

        try (Connection conn = ConexionBD.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Contenido c = new Contenido(
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("tipo"),
                    rs.getString("genero"),
                    rs.getInt("duracion_min"),
                    rs.getInt("estreno"),
                    rs.getDouble("valoracion")
                );
                lista.add(c);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar contenidos con valoración: " + e.getMessage());
        }

        return lista;
    }

    public void mostrarMediaPorTipo() {
        String sql = "SELECT tipo, AVG(valoracion) AS media_valoracion FROM Contenido WHERE valoracion > 0.0 GROUP BY tipo";

        try (Connection conn = ConexionBD.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("----- MEDIA DE VALORACIÓN POR TIPO -----");
            while (rs.next()) {
                String tipo = rs.getString("tipo");
                double media = rs.getDouble("media_valoracion");
                System.out.println(tipo.toUpperCase() + ": " + media);
            }

        } catch (SQLException e) {
            System.out.println("Error al calcular la media: " + e.getMessage());
        }
    }
}
