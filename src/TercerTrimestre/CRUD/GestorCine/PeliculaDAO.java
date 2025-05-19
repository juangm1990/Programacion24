package TercerTrimestre.CRUD.GestorCine;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PeliculaDAO {

    public void insertar(Pelicula pelicula) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "INSERT INTO Peliculas (Titulo, Genero, Duracion) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, pelicula.getTitulo());
            stmt.setString(2, pelicula.getGenero());
            stmt.setInt(3, pelicula.getDuracion());
            stmt.executeUpdate();
            System.out.println("Película registrada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al registrar película: " + e.getMessage());
        }
    }

    public List<Pelicula> obtenerTodosAscendente() {
        return obtenerPeliculasOrdenadas("ASC");
    }

    public List<Pelicula> obtenerTodosDescendente() {
        return obtenerPeliculasOrdenadas("DESC");
    }

    private List<Pelicula> obtenerPeliculasOrdenadas(String orden) {
        List<Pelicula> peliculas = new ArrayList<>();
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "SELECT * FROM Peliculas ORDER BY ID_Pelicula " + orden;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Pelicula pelicula = new Pelicula(
                    rs.getInt("ID_Pelicula"),
                    rs.getString("Titulo"),
                    rs.getString("Genero"),
                    rs.getInt("Duracion")
                );
                peliculas.add(pelicula);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener películas: " + e.getMessage());
        }
        return peliculas;
    }

    public void modificar(Pelicula pelicula) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "UPDATE Peliculas SET Titulo = ?, Genero = ?, Duracion = ? WHERE ID_Pelicula = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, pelicula.getTitulo());
            stmt.setString(2, pelicula.getGenero());
            stmt.setInt(3, pelicula.getDuracion());
            stmt.setInt(4, pelicula.getId());
            stmt.executeUpdate();
            System.out.println("Película modificada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al modificar película: " + e.getMessage());
        }
    }

    public void actualizarCampo(int id, String campo, String nuevoValor) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "UPDATE Peliculas SET " + campo + " = ? WHERE ID_Pelicula = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            if (campo.equals("Duracion")) {
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
            String sql = "DELETE FROM Peliculas WHERE ID_Pelicula = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Película eliminada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar película: " + e.getMessage());
        }
    }

    public Pelicula buscarPorId(int id) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "SELECT * FROM Peliculas WHERE ID_Pelicula = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Pelicula(
                    rs.getInt("ID_Pelicula"),
                    rs.getString("Titulo"),
                    rs.getString("Genero"),
                    rs.getInt("Duracion")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar película: " + e.getMessage());
        }
        return null;
    }

    public List<Pelicula> buscarPorCampo(String campo, String valor) {
        List<Pelicula> resultados = new ArrayList<>();
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "SELECT * FROM Peliculas WHERE " + campo + " LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + valor + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Pelicula pelicula = new Pelicula(
                    rs.getInt("ID_Pelicula"),
                    rs.getString("Titulo"),
                    rs.getString("Genero"),
                    rs.getInt("Duracion")
                );
                resultados.add(pelicula);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar películas: " + e.getMessage());
        }
        return resultados;
    }

    public void resetearBaseDeDatos() {
        try (Connection conn = ConexionBD.conectar()) {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM Peliculas");
            stmt.executeUpdate("ALTER TABLE Peliculas AUTO_INCREMENT = 1");
            System.out.println("Base de datos de películas reseteada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al resetear base de datos: " + e.getMessage());
        }
    }
}
