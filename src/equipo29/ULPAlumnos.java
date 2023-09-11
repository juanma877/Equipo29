
package equipo29;

import java.sql.Date;
import equipo29.Conexion.Conexion;
import equipo29.Data.Alumno;
import equipo29.Conexion.AlumnoData;


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
    

