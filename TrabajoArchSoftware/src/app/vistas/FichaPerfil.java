package app.view_models;

public class FichaPerfil {
    private int id;
    private String nombre;
    
    public FichaPerfil(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
}
