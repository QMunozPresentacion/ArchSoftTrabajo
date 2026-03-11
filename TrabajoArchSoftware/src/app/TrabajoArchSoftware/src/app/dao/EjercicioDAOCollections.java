package app.dao;

import app.modelos.Ejercicio;
import java.util.ArrayList;
import java.util.List;

public class EjercicioDAOCollections implements EjercicioDAO {
    private List<Ejercicio> ejercicios = new ArrayList<>();

    public EjercicioDAOCollections() {
        
    }

    @Override
    public void agregarEjercicio(Ejercicio nuevoEjercicio) {
        Ejercicio copiaNuevoEjercicio = new Ejercicio(nuevoEjercicio);
        for (Ejercicio ejercicio : ejercicios) {
            if (ejercicio.getId() == copiaNuevoEjercicio.getId()) {
                return;
            }
        }
        ejercicios.add(copiaNuevoEjercicio);
    }

    @Override
    public List<Ejercicio> getEjercicios() {
        return new ArrayList<>(ejercicios);
    }

    @Override
    public Ejercicio getEjercicio(int idSeleccionado) {
        for (Ejercicio ejercicio : ejercicios) {
            if (ejercicio.getId() == idSeleccionado) {
                return new Ejercicio(ejercicio);
            }
        }
        return null;
    }

    @Override
    public void actualizarEjercicio(Ejercicio ejercicioActualizado) {
        for (int i = 0; i < ejercicios.size(); i++) {
            if (ejercicios.get(i).getId() == ejercicioActualizado.getId()) {
                ejercicios.set(i, ejercicioActualizado);
            }
        }
    }   
}