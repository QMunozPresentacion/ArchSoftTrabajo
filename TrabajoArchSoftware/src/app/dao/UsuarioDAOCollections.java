package app.dao;

import app.modelos.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOCollections implements UsuarioDAO{
    
    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioDAOCollections() {
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        boolean estaEnLista = false;
        
        for (Usuario usr : usuarios){
            if(usr.getId() == usuario.getId()){
                estaEnLista = true;
                break;
            }
        }
        
        if(estaEnLista == false)
            usuarios.add(usuario);
    }

    @Override
    public List<Usuario> getUsuarios() {
        return new ArrayList<>(usuarios);
    }

    @Override
    public Usuario getUsuario(int idSeleccionado) {
        for(int i = 0; i  < usuarios.size(); i++){
            if(usuarios.get(i).getId() == idSeleccionado)
                return usuarios.get(i);
        }  
        return null;
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        for(int i = 0; i  < usuarios.size(); i++){
            if(usuarios.get(i).getId() == usuario.getId())
                usuarios.set(i,usuario);
        }  
    }
}
