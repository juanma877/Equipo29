package equipo29.Data;

public class Inscripcion implements Comparable<Inscripcion>{

    private int idInscripcion = -1;
    private int nota;
    private Alumno alumno;
    private Materia materia;

    public Inscripcion() {
        this.idInscripcion = -1;
    }

    public Inscripcion(int nota, Alumno alumno, Materia materia) {
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripcion=" + idInscripcion + ", nota=" + nota + ", alumno=" + alumno + ", materia=" + materia + '}';
    }

    @Override
    public int compareTo(Inscripcion t) {
         if (materia.getIdMateria() == t.materia.getIdMateria()){
            return 0;
        }else if(materia.getIdMateria() > t.materia.getIdMateria()){
            return 1;
        }else{
            return -1;
        }
    }

}
