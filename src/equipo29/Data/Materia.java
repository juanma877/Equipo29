package equipo29.Data;

public class Materia implements Comparable<Materia>{

    private int idMateria = -1;
    private String nombre;
    private int año;
    private boolean estado;

    public Materia() {
        this.idMateria = -1;
    }

    public Materia(int idMateria, String nombre, int año, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.año = año;
        this.estado = estado;
    }

    public Materia(String nombre, int año, boolean estado) {
        this.idMateria = -1;
        this.nombre = nombre;
        this.año = año;
        this.estado = estado;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return idMateria + " - " + nombre;
    }


    @Override
    public int compareTo(Materia t) {
        if (idMateria == t.idMateria){
            return 0;
        }else if(idMateria > t.idMateria){
            return 1;
        }else{
            return -1;
        }
    }

}
