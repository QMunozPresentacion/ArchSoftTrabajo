package app.dao;

import app.modelos.Usuario;
import java.util.List;

public interface UsuarioDAO {
    public void agregarUsuario(Usuario usuario);
    public List<Usuario> getUsuarios();
    public Usuario getUsuario(int idSeleccionado);
    public void actualizarUsuario(Usuario usuario);
}
