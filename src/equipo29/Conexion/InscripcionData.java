package equipo29.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import equipo29.Data.Alumno;
import equipo29.Data.Inscripcion;
import equipo29.Data.Materia;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InscripcionData {

    private Connection con = null;
    private MateriaData matData = new MateriaData();
    private AlumnoData aluData = new AlumnoData();

    public InscripcionData() {
        this.con = Conexion.buscarConexion();
    }

    public void guardarInscripcion(Inscripcion insc) {
        try {
            String query = "SELECT idInscripcion FROM inscripcion WHERE inscripcion.idAlumno = ? AND inscripcion.idMateria = ?";
            PreparedStatement ps = con.prepareStatement(query);;
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Alumno ya inscripto a la materia seleccionada");
            } else {
                String insert = "INSERT INTO inscripcion(idAlumno, idMateria) VALUES (?, ?)";
                PreparedStatement ps2 = con.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
                ps2.setInt(1, insc.getAlumno().getIdAlumno());
                ps2.setInt(2, insc.getMateria().getIdMateria());
                int affectedRows = ps2.executeUpdate();
                if (affectedRows == 0) {
                    JOptionPane.showMessageDialog(null, "No se pudo insertar el registro.");
                } else {
                    ResultSet rs2 = ps2.getGeneratedKeys();
                    if (rs2.next()) {
                        //insc.setIdInscripcion(rs2.getInt("idInscripcion"));
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo obtener el ID generado.");
                    }
                    JOptionPane.showMessageDialog(null, "Inscipcion realizada");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar inscripcion" + ex.getMessage());
        }
        
    }

    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String query = "SELECT * FROM inscripcion";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idIscripcion"));
                inscripcion.setNota(rs.getInt("nota"));
                inscripcion.setAlumno(aluData.buscarAlumnoPorId(rs.getInt("idAlumno")));
                inscripcion.setMateria(matData.buscarMateria(rs.getInt("idMateria")));
                inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripcion " + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        List<Inscripcion> inscripciones = new ArrayList<>();  
        try {
            String query = "SELECT * FROM inscripcion WHERE idAlumno = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getInt("nota"));
                inscripcion.setAlumno(aluData.buscarAlumnoPorId(rs.getInt("idAlumno")));
                inscripcion.setMateria(matData.buscarMateria(rs.getInt("idMateria")));
                inscripciones.add(inscripcion);
            }
            //ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripcion " + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materiasC = new ArrayList<>();
        try {
            String query = "SELECT idMateria, nombre, año from materia where idMateria IN (SELECT idMateria from inscripcion WHERE idAlumno = ?) AND materia.estado = 1";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materiasC.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener materias cursadas " + ex.getMessage());
        }
        return materiasC;
    }

    public List<Materia> obtenerMateriasNOCursadas(int id) {
        List<Materia> materiasNC = new ArrayList<>();
        try {
            String query = "SELECT idMateria, nombre, año from materia where idMateria NOT IN (SELECT idMateria from inscripcion WHERE idAlumno = ?) AND materia.estado = 1";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materiasNC.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener materias NO cursadas ");
        }
        return materiasNC;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String del = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(del);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int registro = ps.executeUpdate();
            if (registro == 1) {
                JOptionPane.showMessageDialog(null, "Inscripcion borrada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar inscripcion a materia " + ex.getMessage());
        }
    }

    public void actualizarNota(int idMateria, int idAlumno, int nota) {
        String upd = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(upd);
            ps.setInt(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int registro = ps.executeUpdate();
            if (registro == 1) {
                JOptionPane.showMessageDialog(null, "Nota modificada");
            }
//            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar Nota " + ex.getMessage());
        }
    }

    public List<Alumno> obtenerAlumnoXMateria(int idMateria) {
        List<Alumno> alumnos = new ArrayList<>();
        String query = "SELECT idAlumno, dni, apellido, alumno.nombre  FROM alumno, materia, inscripcion "
                + "WHERE inscripcion.idAlumno = alumno.idAlumno AND inscripcion.idMateria = materia.idMateria "
                + "AND materia.idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            Alumno alumno = new Alumno();
            while (rs.next()) {
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Alumnos por materia " + ex.getMessage());
        }
        return alumnos;
    }
    
//    public List<String> obtenerInscripcionesPorAlumnoV2(int id) {
//        List<String> inscripciones = new ArrayList<>();  
//        try {
//            String query = "SELECT materia.idMateria, nombre, nota FROM materia JOIN inscripcion ON (materia.idMateria=inscripcion.idMateria) WHERE inscripcion.idAlumno= ?";
//            PreparedStatement ps = con.prepareStatement(query);
//            ps.setInt(1, id);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                int idIsc=(rs.getInt("idMateria"));
//                String nombreMat=(rs.getString("nombre"));
//                int nota=(rs.getInt("nota"));
//                inscripciones.add(inscripcion);
//            }
//            //ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripcion " + ex.getMessage());
//        }
//        return inscripciones;
//    }
    
}
