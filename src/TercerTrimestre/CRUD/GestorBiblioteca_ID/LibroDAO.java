package TercerTrimestre.CRUD.GestorBiblioteca_ID;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibroDAO {

    public void insertar(Libro libro) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "INSERT INTO Libros (ID_Libro, Titulo, Autor, Año_Publicacion, Genero, Disponible) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, libro.getId());
            stmt.setString(2, libro.getTitulo());
            stmt.setString(3, libro.getAutor());
            stmt.setInt(4, libro.getAñoPublicacion());
            stmt.setString(5, libro.getGenero());
            stmt.setBoolean(6, libro.isDisponible());
            stmt.executeUpdate();
            System.out.println("Libro insertado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al insertar libro: " + e.getMessage());
        }
    }

    public List<Libro> obtenerTodosAscendente() {
        return obtenerLibrosOrdenados("ASC");
    }

    public List<Libro> obtenerTodosDescendente() {
        return obtenerLibrosOrdenados("DESC");
    }

    private List<Libro> obtenerLibrosOrdenados(String orden) {
        List<Libro> libros = new ArrayList<>();
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "SELECT * FROM Libros ORDER BY ID_Libro " + orden;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Libro libro = new Libro(
                    rs.getInt("ID_Libro"),
                    rs.getString("Titulo"),
                    rs.getString("Autor"),
                    rs.getInt("Año_Publicacion"),
                    rs.getString("Genero"),
                    rs.getBoolean("Disponible")
                );
                libros.add(libro);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener libros: " + e.getMessage());
        }
        return libros;
    }

    public void modificar(Libro libro) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "UPDATE Libros SET Titulo = ?, Autor = ?, Año_Publicacion = ?, Genero = ?, Disponible = ? WHERE ID_Libro = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, libro.getTitulo());
            stmt.setString(2, libro.getAutor());
            stmt.setInt(3, libro.getAñoPublicacion());
            stmt.setString(4, libro.getGenero());
            stmt.setBoolean(5, libro.isDisponible());
            stmt.setInt(6, libro.getId());
            stmt.executeUpdate();
            System.out.println("Libro modificado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al modificar libro: " + e.getMessage());
        }
    }

    public void actualizarCampo(int id, String campo, String nuevoValor) {
        String[] camposPermitidos = { "Titulo", "Autor", "Año_Publicacion", "Genero", "Disponible" };
        boolean campoValido = false;
        for (String c : camposPermitidos) {
            if (c.equals(campo)) {
                campoValido = true;
                break;
            }
        }

        if (!campoValido) {
            System.out.println("Campo no permitido.");
            return;
        }

        try (Connection conn = ConexionBD.conectar()) {
            String sql = "UPDATE Libros SET " + campo + " = ? WHERE ID_Libro = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            if (campo.equals("Año_Publicacion")) {
                stmt.setInt(1, Integer.parseInt(nuevoValor));
            } else if (campo.equals("Disponible")) {
                stmt.setBoolean(1, Boolean.parseBoolean(nuevoValor));
            } else {
                stmt.setString(1, nuevoValor);
            }

            stmt.setInt(2, id);
            int filas = stmt.executeUpdate();
            if (filas > 0) {
                System.out.println("Campo actualizado correctamente.");
            } else {
                System.out.println("No se encontró el libro con ese ID.");
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar campo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Formato inválido para número.");
        }
    }

    public void eliminar(int id) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "DELETE FROM Libros WHERE ID_Libro = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Libro eliminado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar libro: " + e.getMessage());
        }
    }

    public Libro buscarPorID(int id) {
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "SELECT * FROM Libros WHERE ID_Libro = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Libro(
                    rs.getInt("ID_Libro"),
                    rs.getString("Titulo"),
                    rs.getString("Autor"),
                    rs.getInt("Año_Publicacion"),
                    rs.getString("Genero"),
                    rs.getBoolean("Disponible")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar libro por ID: " + e.getMessage());
        }
        return null;
    }

    public List<Libro> buscarPorTitulo(String titulo) {
        return buscarPorCampo("Titulo", titulo);
    }

    public List<Libro> buscarPorAutor(String autor) {
        return buscarPorCampo("Autor", autor);
    }

    public List<Libro> buscarPorAnio(int anio) {
        return buscarPorCampo("Año_Publicacion", String.valueOf(anio));
    }

    public List<Libro> buscarPorGenero(String genero) {
        return buscarPorCampo("Genero", genero);
    }

    private List<Libro> buscarPorCampo(String campo, String valor) {
        List<Libro> libros = new ArrayList<>();
        try (Connection conn = ConexionBD.conectar()) {
            String sql = "SELECT * FROM Libros WHERE " + campo + " LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + valor + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Libro libro = new Libro(
                    rs.getInt("ID_Libro"),
                    rs.getString("Titulo"),
                    rs.getString("Autor"),
                    rs.getInt("Año_Publicacion"),
                    rs.getString("Genero"),
                    rs.getBoolean("Disponible")
                );
                libros.add(libro);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar libros: " + e.getMessage());
        }
        return libros;
    }

    public void resetearBaseDeDatos() {
        try (Connection conn = ConexionBD.conectar()) {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM Libros");
            stmt.executeUpdate("ALTER TABLE Libros AUTO_INCREMENT = 1");
            System.out.println("Base de datos reseteada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al resetear base de datos: " + e.getMessage());
        }
    }
}
