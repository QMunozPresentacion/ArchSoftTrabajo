package app.viewmodels.historial;

public class Analisis {
    private int tiempoEstudio;
    private float tiempoMedioEjercicio;
    private int metrosRecorridos;
    
    public Analisis(int tiempoEstudio, float tiempoMedioEjercicio, int metrosRecorridos) {
        this.tiempoEstudio = tiempoEstudio;
        this.tiempoMedioEjercicio = tiempoMedioEjercicio;
        this.metrosRecorridos = metrosRecorridos;
    }
    
    public Analisis(Analisis analisis) {
        this.tiempoEstudio = analisis.getTiempoEstudio();
        this.tiempoMedioEjercicio = analisis.getTiempoMedioEjercicio();
        this.metrosRecorridos = analisis.getMetrosRecorridos();
    }
    
    public int getTiempoEstudio() {
        return tiempoEstudio;
    }
    
    public float getTiempoMedioEjercicio() {
        return tiempoMedioEjercicio;
    }
    
    public int getMetrosRecorridos() {
        return metrosRecorridos;
    }
}
