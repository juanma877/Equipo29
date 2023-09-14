package equipo29.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import equipo29.Data.Alumno;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlumnoData {

    private Connection con = null;

    public  AlumnoData() {
        con = Conexion.buscarConexion();
    }

  
        
    

    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, alumno.getDni());
                ps.setString(2, alumno.getApellido());
                ps.setString(3, alumno.getNombre());
                ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
                ps.setBoolean(5, alumno.isEstado());
                
                int affectedRows = ps.executeUpdate();
                if (affectedRows == 0) {
                    System.out.println("No se pudo insertar el registro.");
                } else {
                    ResultSet rs = ps.getGeneratedKeys();
                    if (rs.next()) {
                        alumno.setIdAlumno(rs.getInt(1));
                    } else {
                        System.out.println("No se pudo obtener el ID generado.");
                    }
                    JOptionPane.showMessageDialog(null, "Alumno Guardado");
                }
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectase a la base de datos");
        }

    }

    public void modificarAlumno(Alumno alumno) {

        String sql = "UPDATE alumno SET dni=?, apellido=?, nombre=?, fechaNacimineto=? WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getIdAlumno());

            int affectedRows = ps.executeUpdate();
            if (affectedRows == 1) {

                JOptionPane.showMessageDialog(null, "Alumno modificado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectase a la base de datos");
        }

    }

    public void eliminarAlumno(int idAlumno) {
        String sql = "UPDATE alumno SET estado=0 WHERE idAlumno=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            int affectedRows = ps.executeUpdate();
            if (affectedRows == 1) {    

                JOptionPane.showMessageDialog(null, "Alumno Eliminado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectase a la base de datos eliminarID"+ex.getMessage());
        }

    }

    public Alumno buscarAlumnoPorId(int idAlumno) {

        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno=? AND estado=1";
        Alumno alumno = null;

        
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idAlumno);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    alumno = new Alumno();
                    alumno.setIdAlumno(idAlumno);
                    alumno.setDni(rs.getInt("dni"));
                    alumno.setApellido(rs.getString("apellido"));
                    alumno.setNombre(rs.getString("nombre"));
                    alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                    alumno.setEstado(true);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Este alumno no existe como activo en la base de datos ");
                    
                }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectase a la base de datos");
        }
        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dni) throws NullPointerException{

        String sql = "SELECT idAlumno,dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni=? AND estado=1";
        Alumno alumno = null;

        
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, dni);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    alumno = new Alumno();
                    alumno.setIdAlumno(rs.getInt("idAlumno"));
                    alumno.setDni(rs.getInt("dni"));
                    alumno.setApellido(rs.getString("apellido"));
                    alumno.setNombre(rs.getString("nombre"));
                    alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                    alumno.setEstado(true);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Este alumno no existe como activo en la base de datos ");
                    
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectase a la base de datos");
        }
        return alumno;
    }

    public List<Alumno> listarAlumnos() {

        String sql = "SELECT idAlumno,dni, apellido, nombre, fechaNacimiento FROM alumno WHERE estado=1";
        ArrayList<Alumno> alumnos = new ArrayList<>();

        
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Alumno alumno = new Alumno();
                    alumno.setIdAlumno(rs.getInt("idAlumno"));
                    alumno.setDni(rs.getInt("dni"));
                    alumno.setApellido(rs.getString("apellido"));
                    alumno.setNombre(rs.getString("nombre"));
                    alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                    alumno.setEstado(true);
                    alumnos.add(alumno);
                    
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectase a la base de datos");
        }
        return alumnos;
    }

}


