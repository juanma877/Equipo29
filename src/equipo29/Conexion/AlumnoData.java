
package equipo29.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import equipo29.Data.Alumno;


public class AlumnoData {
    private Connection con = null;
    
    public AlumnoData(Conexion conexion){
        this.con = conexion.buscarConexion();
    }
    
    public void guardarAlumno(Alumno a) {
    String query = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
    try {
        PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, a.getDni());
        ps.setString(2, a.getApellido());
        ps.setString(3, a.getNombre());
        ps.setDate(4, a.getFechaNacimiento());
        ps.setBoolean(5, a.isEstado());

        int affectedRows = ps.executeUpdate();
        if (affectedRows == 0) {
            System.out.println("No se pudo insertar el registro.");
        } else {
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                a.setIdAlumno(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el ID generado.");
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}
