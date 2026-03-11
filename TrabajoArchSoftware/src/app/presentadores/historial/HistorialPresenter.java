package app.presentadores.historial;

import java.util.ArrayList;
import java.util.List;

import app.dao.EjercicioDAO;
import app.dao.UsuarioEjercicioDAO;
import app.modelos.Ejercicio;
import app.modelos.UsuarioEjercicio;
import app.viewmodels.historial.FilaHistorial;
import app.vistas.historial.HistorialVista;

public class HistorialPresenter {

    private final HistorialVista vista;
    private final EjercicioDAO ejercicioDAO;
    private final UsuarioEjercicioDAO usuarioEjercicioDAO;

    public HistorialPresenter(HistorialVista vista, EjercicioDAO ejercicioDAO, UsuarioEjercicioDAO usuarioEjercicioDAO) {
        this.vista = vista;
        this.ejercicioDAO = ejercicioDAO;
        this.usuarioEjercicioDAO = usuarioEjercicioDAO;
    }

    public void cargarHistorial() {
        List<UsuarioEjercicio> ejerciciosUsuario = usuarioEjercicioDAO.getUsuarioEjercicios();
        List<FilaHistorial> historial = new ArrayList<>();

        for (UsuarioEjercicio usuarioEjercicio : ejerciciosUsuario) {
            Ejercicio ejercicio = ejercicioDAO.getEjercicio(usuarioEjercicio.getIdEjercicio());

            if (ejercicio != null) {
                FilaHistorial fila = new FilaHistorial(
                    usuarioEjercicio.getFecha(),
                    ejercicio.getNombre(),
                    usuarioEjercicio.getDuracion()
                );

                historial.add(fila);
            }
        }

        vista.setHistorial(historial);
        vista.open();
    }
}