package app.viewmodels.amigos;

public class FilaRanking {
    private int idAmigo;
    private String nombreAmigo;
    private float tiempoEstudio;
    private float tiempoMedioEjercicio;
    private float metrosRecorridos;
    private int puntos;
    
    public FilaRanking(
            int idAmigo,
            String nombreAmigo,
            float tiempoEstudio,
            float tiempoMedioEjercicio,
            float metrosRecorridos,
            int puntos) {
        
        this.idAmigo = idAmigo;
        this.nombreAmigo = nombreAmigo;
        this.tiempoEstudio = tiempoEstudio;
        this.tiempoMedioEjercicio = tiempoMedioEjercicio;
        this.metrosRecorridos = metrosRecorridos;
        this.puntos = puntos;
    }
    
    public FilaRanking(FilaRanking fila) {
        this.idAmigo = fila.getIdAmigo();
        this.nombreAmigo = fila.getNombreAmigo();
        this.tiempoEstudio = fila.getTiempoEstudio();
        this.tiempoMedioEjercicio = fila.getTiempoMedioEjercicio();
        this.metrosRecorridos = fila.getMetrosRecorridos();
        this.puntos = fila.getPuntos();
    }
    
    public int getIdAmigo(){
        return idAmigo;
    }
    
    public String getNombreAmigo() {
        return nombreAmigo;
    }
    
    public float getTiempoEstudio() {
        return tiempoEstudio;
    }
    
    public float getTiempoMedioEjercicio() {
        return tiempoMedioEjercicio;
    }
    
    public float getMetrosRecorridos() {
        return metrosRecorridos;
    }
    
    public int getPuntos() {
        return puntos;
    }
}