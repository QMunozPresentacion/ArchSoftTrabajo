package app.modelos;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private float tiempoTotalEstudio;
    private int puntuacion;
    private List<Integer> amigos;
    
    public Usuario(int idUsuario, String nombre, float tiempoTotalEstudio, int puntuacion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.tiempoTotalEstudio = tiempoTotalEstudio;
        this.puntuacion = puntuacion;
        
        this.amigos = new ArrayList<>();
    }
    
    public int getId(){
        return idUsuario;
    }

    public void setId(int idUsuario){
        this.idUsuario = idUsuario;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public float getTiempoTotalEstudio(){
        return tiempoTotalEstudio;
    }

    public void setTiempoTotalEstudio(float tiempoTotalEstudio){
        this.tiempoTotalEstudio = tiempoTotalEstudio;
    }
    
    public float getPuntuacion(){
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion){
        this.puntuacion = puntuacion;
    }
    
    public void addAmigo(int idAmigo){
        amigos.add(idAmigo);
    }
    
    public void deleteAmigo(int idAmigo){
        amigos.remove(idAmigo);
    }
}
