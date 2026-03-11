package app.dao;

import app.modelos.UsuarioEjercicio;
import java.util.ArrayList;
import java.util.List;

public class UsuarioEjercicioDAOCollections implements UsuarioEjercicioDAO {
    private List<UsuarioEjercicio> usuariosEjercicios = new ArrayList<>();

    public UsuarioEjercicioDAOCollections() {
    }

    @Override
    public void agregarUsuarioEjercicio(UsuarioEjercicio nuevoUsuarioEjercicio) {
        UsuarioEjercicio copia = new UsuarioEjercicio(nuevoUsuarioEjercicio);

        for (UsuarioEjercicio usuarioEjercicio : usuariosEjercicios) {
            if (usuarioEjercicio.getIdEjercicio() == copia.getIdEjercicio()
                    && usuarioEjercicio.getFecha().equals(copia.getFecha())) {
                return;
            }
        }

        usuariosEjercicios.add(copia);
    }

    @Override
    public List<UsuarioEjercicio> getUsuarioEjercicios() {
        List<UsuarioEjercicio> copia = new ArrayList<>();

        for (UsuarioEjercicio usuarioEjercicio : usuariosEjercicios) {
            copia.add(new UsuarioEjercicio(usuarioEjercicio));
        }

        return copia;
    }

    @Override
    public UsuarioEjercicio getUsuarioEjercicio(int idEjercicio) {
        for (UsuarioEjercicio usuarioEjercicio : usuariosEjercicios) {
            if (usuarioEjercicio.getIdEjercicio() == idEjercicio) {
                return new UsuarioEjercicio(usuarioEjercicio);
            }
        }
        return null;
    }

    @Override
    public void actualizarUsuarioEjercicio(UsuarioEjercicio usuarioEjercicioActualizado) {
        for (int i = 0; i < usuariosEjercicios.size(); i++) {
            UsuarioEjercicio actual = usuariosEjercicios.get(i);

            if (actual.getIdEjercicio() == usuarioEjercicioActualizado.getIdEjercicio()
                    && actual.getFecha().equals(usuarioEjercicioActualizado.getFecha())) {
                usuariosEjercicios.set(i, new UsuarioEjercicio(usuarioEjercicioActualizado));
                return;
            }
        }
    }
}