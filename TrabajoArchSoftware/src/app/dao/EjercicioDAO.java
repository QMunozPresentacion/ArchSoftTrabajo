package app.dao;

import app.modelos.Ejercicio;
import java.util.List;

public interface EjercicioDAO {
    public void agregarEjercicio(Ejercicio ejercicio);
    public List<Ejercicio> getEjercicios();
    public Ejercicio getEjercicio(int idSeleccionado);
    public void actualizarEjercicio(Ejercicio ejercicio);
}