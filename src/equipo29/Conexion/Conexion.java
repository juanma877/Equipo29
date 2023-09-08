
package equipo29.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Conexion {
    private  String url;
    private  String usuario;    
    private  String password;   
    
    private static Connection conexion = null;  // lo que importa  
    
    public Conexion(String url, String usuario, String password){     
        this.url=url;  // "jdbc:mariabd://localhost:3306/universidad"
        this.usuario=usuario;
        this.password=password;
    }
      
    public Connection buscarConexion(){
        if (conexion==null) {  // si es la primera vez
            try {
                //cargamos las clases de mariadb que implementan JDBC
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(url, usuario, password);
            } catch (ClassNotFoundException ex) {  // si me olvide de importar la libreria // error al cargar los drivers
                JOptionPane.showMessageDialog(null, "Error al cargar driver" + ex.getMessage());
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos" + ex.getMessage());
            }
        }
        return conexion; // retorna la conexion establecida
    }
}