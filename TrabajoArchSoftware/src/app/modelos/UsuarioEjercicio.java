package app.modelos;

import java.util.Date;

public class UsuarioEjercicio {
    private int idUsuario;
    private int idEjercicio;
    private Date fecha;
    private int duracion;
    
    public UsuarioEjercicio(int idUsuario, int idEjercicio, Date fecha, int duracion) {
        this.idUsuario = idUsuario;
        this.fecha = fecha;
        this.idEjercicio = idEjercicio;
        this.duracion = duracion;
    }

    public UsuarioEjercicio(UsuarioEjercicio nuevoUsuarioEjercicio) {
        this.idUsuario = nuevoUsuarioEjercicio.idUsuario;
        this.fecha = nuevoUsuarioEjercicio.fecha;
        this.idEjercicio = nuevoUsuarioEjercicio.idEjercicio;
        this.duracion = nuevoUsuarioEjercicio.duracion;
    }
    
    public int getDuracion(){
        return duracion;
    }
    
    
    public Date getFecha(){
        return fecha;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdEjercicio() {
        return idEjercicio;
    }
}
