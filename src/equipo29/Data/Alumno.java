package equipo29.Data;

import java.time.LocalDate;

public class Alumno implements Comparable<Alumno>{

    private int idAlumno = -1;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    private boolean estado;

    public Alumno() {
        this.idAlumno = -1;
    }

    public Alumno(int idAlumno, int dni, String apellido, String nombre, LocalDate fechaNacimiento, boolean estado) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;

    }

    public Alumno(int dni, String apellido, String nombre, LocalDate fechaNacimiento, boolean estado) {
        this.idAlumno = -1;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return idAlumno + " - " + apellido + ", " + nombre;
    }

    @Override
    public int compareTo(Alumno t) {
        if (idAlumno == t.idAlumno){
            return 0;
        }else if(idAlumno > t.idAlumno){
            return 1;
        }else{
            return -1;
        }
    }

}
