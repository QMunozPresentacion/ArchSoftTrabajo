package app.view_models;

public class FilaAmigo {
    private int idAmigo;
    private int idEjercicio;
    private int puntos;
    private float metros;
    private float estudio;
    
    public FilaAmigo(int idAmigo, int idEjercicio, int puntos, float metros, float estudio){
        this.idAmigo = idAmigo;
        this.idEjercicio = idEjercicio;
        this.puntos = puntos;
        this.metros = metros;
        this.estudio = estudio;
    }
    
    public int getidAmigo(){
        return idAmigo;
    }
    
    public int getIdEjercicio(){
        return idEjercicio;
    }
    
    public int getPuntos(){
        return puntos;
    }
    
    public float getMetros(){
        return metros;
    }
    public float getEstudio(){
        return estudio;
    }
    
}
