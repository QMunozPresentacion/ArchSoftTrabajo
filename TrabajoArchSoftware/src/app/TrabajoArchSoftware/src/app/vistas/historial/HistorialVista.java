package app.vistas.historial;

import app.viewmodels.historial.Analisis;
import app.viewmodels.historial.FilaHistorial;
import java.util.List;

public interface HistorialVista {
    void open();
    void close();
    void setHistorial(List<FilaHistorial> historial);
    void setAnalisis(Analisis analisis);
}