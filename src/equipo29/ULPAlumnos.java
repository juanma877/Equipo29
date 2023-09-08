
package equipo29;



import java.sql.Date;
import ulpalumnos.Conexion.Conexion;
import ulpalumnos.Data.Alumno;
import ulpalumnos.Conexion.AlumnoData;


public class ULPAlumnos {
private AlumnoData alumnodata;
private Conexion conexion;
    
    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno(34862734,"Lopez","Ramiro",new Date(88,4,24),true);
        new ULPAlumnos().conectar(alumno1);
        System.out.println("Alumno "+ alumno1.getApellido()+ alumno1.getNombre()+ " guardado con exito");
       
       } 
        
       
        void conectar(Alumno alumno){
        
        conexion = new Conexion("jdbc:mariadb://localhost:3306/ulpalumnos?serverTimezone=UTC","root","");
        alumnodata= new AlumnoData(conexion);
        alumnodata.guardarAlumno(alumno);
        
      }
    }
    

