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
        
        if(estaEnLista)
            usuarios.add(usuario);
    }

    @Override
    public List<Usuario> getUsuarios() {
    }

    @Override
    public Usuario getUsuario(int idSeleccionado) {
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
    }

}
