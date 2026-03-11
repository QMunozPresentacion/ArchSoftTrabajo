package app.presentadores.amigos;

import java.util.ArrayList;
import java.util.List;

import app.dao.UsuarioDAO;
import app.modelos.Usuario;
import app.vistas.amigos.AmigoVista;
import app.viewmodels.amigos.FilaRanking;
import app.viewmodels.amigos.Perfil;

public class AmigoPresenter {

    private final AmigoVista vista;
    private final UsuarioDAO usuarioDAO;

    public AmigoPresenter(AmigoVista vista, UsuarioDAO usuarioDAO) {
        this.vista = vista;
        this.usuarioDAO = usuarioDAO;
    }

    public void cargarAmigos(int idUsuario) {
        Usuario usuario = usuarioDAO.getUsuario(idUsuario);

        if (usuario == null) {
            System.out.println("Usuario no encontrado");
            return;
        }

        Perfil perfil = new Perfil(
            usuario.getId(),
            usuario.getNombre()
        );

        List<FilaRanking> ranking = new ArrayList<>();

        for (Integer idAmigo : usuario.getAmigos()) {
            Usuario amigo = usuarioDAO.getUsuario(idAmigo);

            if (amigo != null) {
                FilaRanking fila = new FilaRanking(
                    amigo.getId(),
                    amigo.getNombre(),
                    0,
                    0,
                    0,
                    amigo.getPuntuacion()
                );

                ranking.add(fila);
            }
        }

        vista.setPerfil(perfil);
        vista.setRanking(ranking);
        vista.open();
    }
}