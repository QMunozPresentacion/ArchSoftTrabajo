package app.viewmodels.historial;

public class FilaHistorial {
    private String fecha;
    private String nombreEjercicio;
    private int tiempo;
    
    public FilaHistorial(String fecha, String nombreEjercicio, int tiempo) {
        this.fecha = fecha;
        this.nombreEjercicio = nombreEjercicio;
        this.tiempo = tiempo;
    }

    public FilaHistorial(FilaHistorial fila) {
        this.fecha = fila.getFecha();
        this.nombreEjercicio = fila.nombreEjercicio;
        this.tiempo = fila.getTiempo();
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public String getNombreEjercicio() {
        return nombreEjercicio;
    }
    
    public int getTiempo() {
        return tiempo;
    }
}