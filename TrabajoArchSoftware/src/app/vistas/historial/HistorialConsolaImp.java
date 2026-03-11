package app.vistas.historial;

import app.viewmodels.historial.Analisis;
import app.viewmodels.historial.FilaHistorial;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistorialConsolaImp implements HistorialVista {
    private List<FilaHistorial> historial;
    private Analisis analisis;
    
    public HistorialConsolaImp() {
        
    }
    
    @Override
    public void open() {
        System.out.println("Historial:");
        System.out.println("    Fecha       Ejercicio       Tiempo");
        for (FilaHistorial fila : historial) {
            Date fecha = fila.getFecha();
            String nombreEjercicio = fila.getNombreEjercicio();
            int tiempo = fila.getTiempo();
            
            System.out.println(fecha + "    " + nombreEjercicio + "    " + tiempo);
        }
        
        System.out.println("    Análisis:");
        System.out.println("        Tiempo de estudio: " + analisis.getTiempoEstudio());
        System.out.println("        Tiempo medio ejercicio: "  + analisis.getTiempoMedioEjercicio());
        System.out.println("        Metros recorridos:" + analisis.getMetrosRecorridos());
    }

    @Override
    public void close() {
        System.out.println("------------------------------------------------------------------------------");
    }

    @Override
    public void setHistorial(List<FilaHistorial> historial) {
        this.historial = new ArrayList<>();
        for (FilaHistorial fila : historial) {
            this.historial.add(new FilaHistorial(fila));
        }
    }

    @Override
    public void setAnalisis(Analisis analisis) {
        this.analisis = new Analisis(analisis);
    }
}