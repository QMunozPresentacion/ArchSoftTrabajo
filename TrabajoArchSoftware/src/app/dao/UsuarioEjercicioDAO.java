package app.dao;

import app.modelos.UsuarioEjercicio;
import java.util.List;

public interface UsuarioEjercicioDAO {
    void agregarUsuarioEjercicio(UsuarioEjercicio nuevoUsuarioEjercicio);
    List<UsuarioEjercicio> getUsuarioEjercicios();
    UsuarioEjercicio getUsuarioEjercicio(int idEjercicio);
    void actualizarUsuarioEjercicio(UsuarioEjercicio usuarioEjercicioActualizado);
}