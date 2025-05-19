package TercerTrimestre.CRUD.GestorCine_ID;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PeliculaDAO {

    // Registrar película con ID manual
    public boolean registrarPelicula(Pelicula pelicula) {
        String sql = "INSERT INTO Peliculas (ID_Pelicula, Titulo, Genero, Duracion) VALUES (?, ?, ?, ?)";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, pelicula.getId());
            ps.setString(2, pelicula.getTitulo());
            ps.setString(3, pelicula.getGenero());
            ps.setInt(4, pelicula.getDuracion());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al registrar película manual: " + e.getMessage());
            return false;
        }
    }

    // Listar películas ordenadas por ID (ascendente o descendente)
    public List<Pelicula> listarPeliculas(boolean ascendente) {
        List<Pelicula> lista = new ArrayList<>();
        String orden = ascendente ? "ASC" : "DESC";
        String sql = "SELECT * FROM Peliculas ORDER BY ID_Pelicula " + orden;

        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Pelicula p = new Pelicula(
                        rs.getInt("ID_Pelicula"),
                        rs.getString("Titulo"),
                        rs.getString("Genero"),
                        rs.getInt("Duracion")
                );
                lista.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar películas: " + e.getMessage());
        }
        return lista;
    }

    // Actualizar película completa
    public boolean actualizarPelicula(Pelicula pelicula) {
        String sql = "UPDATE Peliculas SET Titulo=?, Genero=?, Duracion=? WHERE ID_Pelicula=?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, pelicula.getTitulo());
            ps.setString(2, pelicula.getGenero());
            ps.setInt(3, pelicula.getDuracion());
            ps.setInt(4, pelicula.getId());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar película: " + e.getMessage());
            return false;
        }
    }

    // Eliminar una película por ID
    public boolean eliminarPelicula(int id) {
        String sql = "DELETE FROM Peliculas WHERE ID_Pelicula=?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar película: " + e.getMessage());
            return false;
        }
    }

    // Resetear todas las películas manualmente
    public boolean resetearPeliculas() {
        String sqlDelete = "DELETE FROM Peliculas";
        try (Connection conexion = ConexionBD.conectar();
             Statement stmt = conexion.createStatement()) {

            stmt.executeUpdate(sqlDelete);
            return true;
        } catch (SQLException e) {
            System.out.println("Error al resetear películas: " + e.getMessage());
            return false;
        }
    }

    // Buscar por campo
    private List<Pelicula> buscarPorCampo(String campo, String valor) {
        List<Pelicula> lista = new ArrayList<>();
        String sql = "SELECT * FROM Peliculas WHERE " + campo + " LIKE ?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, "%" + valor + "%");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    lista.add(new Pelicula(
                        rs.getInt("ID_Pelicula"),
                        rs.getString("Titulo"),
                        rs.getString("Genero"),
                        rs.getInt("Duracion")
                    ));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar película por " + campo + ": " + e.getMessage());
        }
        return lista;
    }

    public List<Pelicula> buscarPorTitulo(String titulo) {
        return buscarPorCampo("Titulo", titulo);
    }

    public List<Pelicula> buscarPorGenero(String genero) {
        return buscarPorCampo("Genero", genero);
    }

    public List<Pelicula> buscarPorDuracion(int duracion) {
        return buscarPorCampo("Duracion", String.valueOf(duracion));
    }

    // Métodos para modificar un solo campo
    public boolean actualizarTitulo(int id, String nuevoTitulo) {
        String sql = "UPDATE Peliculas SET Titulo=? WHERE ID_Pelicula=?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, nuevoTitulo);
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar título: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarGenero(int id, String nuevoGenero) {
        String sql = "UPDATE Peliculas SET Genero=? WHERE ID_Pelicula=?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, nuevoGenero);
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar género: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarDuracion(int id, int nuevaDuracion) {
        String sql = "UPDATE Peliculas SET Duracion=? WHERE ID_Pelicula=?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, nuevaDuracion);
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar duración: " + e.getMessage());
            return false;
        }
    }
}
