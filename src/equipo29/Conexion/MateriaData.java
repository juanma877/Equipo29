package equipo29.Conexion;

import equipo29.Data.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaData {

    private Connection con = null;

    public MateriaData() {
        con = Conexion.buscarConexion();
    }

    public void guardarMateria(Materia materia) throws SQLIntegrityConstraintViolationException, SQLException {
        String sql = "INSERT INTO materia (nombre,año,estado)"
                + "VALUES(?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia guardada con éxito");
            }

        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "El Nombre de la Materia indicado ya se encuentra registrado");
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }

    }

    public void modificarMateria(Materia materia) throws SQLIntegrityConstraintViolationException, SQLException {
        String sql = "UPDATE materia SET nombre = ?, año = ? WHERE idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setInt(3, materia.getIdMateria());
            int actualizar = ps.executeUpdate();
            if (actualizar == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada");
            }

        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(null, "El Codigo de Materia indicado ya se encuentra registrado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
    }

    public void eliminarMateria(int id) {

        String sql = "UPDATE materia SET estado=0 WHERE idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int actualizar = ps.executeUpdate();

            if (actualizar == 1) {
                JOptionPane.showMessageDialog(null, "Materia eliminada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
    }

    public Materia buscarMateria(int id) {
        String sql = "SELECT idMateria, nombre, año FROM materia WHERE  idMateria= ? AND estado=1 ";

        Materia materia = new Materia();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe esa materia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
        return materia;
    }

    public List<Materia> listarMaterias() {
        String sql = "SELECT idMateria, nombre, año FROM materia WHERE estado=1 ";

        ArrayList<Materia> materias = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(true);

                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
        return materias;
    }
}
