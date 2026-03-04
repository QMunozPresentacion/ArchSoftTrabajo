package app.modelos;

public class Ejercicio {
    private int idEjercicio;
    private String nombre;
    private String descripcion;
    private float dificultad;
    //private String imagen;

    public Ejercicio(int idEjercicio, String nombre, String descripcion, float dificultad) {
        this.idEjercicio = idEjercicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dificultad = dificultad;
    }

    public int getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(int idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getDificultad() {
        return dificultad;
    }

    public void setDificultad(float dificultad) {
        this.dificultad = dificultad;
    }
}