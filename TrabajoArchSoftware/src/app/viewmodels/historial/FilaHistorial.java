package app.viewmodels.historial;

import java.util.Date;

public class FilaHistorial {
    private Date fecha;
    private String nombreEjercicio;
    private int tiempo;
    
    public FilaHistorial(Date fecha, String nombreEjercicio, int tiempo) {
        this.fecha = fecha;
        this.nombreEjercicio = nombreEjercicio;
        this.tiempo = tiempo;
    }

    public FilaHistorial(FilaHistorial fila) {
        this.fecha = fila.getFecha();
        this.nombreEjercicio = fila.nombreEjercicio;
        this.tiempo = fila.getTiempo();
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public String getNombreEjercicio() {
        return nombreEjercicio;
    }
    
    public int getTiempo() {
        return tiempo;
    }
}