package app.viewmodels.amigos;

public class Perfil {
    private int id;
    private String nombre;
    
    public Perfil(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    public Perfil(Perfil perfil) {
        this.id = perfil.getId();
        this.nombre = perfil.getNombre();
    }
    
    public int getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
}
