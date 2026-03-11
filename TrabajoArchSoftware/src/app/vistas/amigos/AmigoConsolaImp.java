package app.vistas.amigos;
import app.viewmodels.amigos.FilaRanking;
import app.viewmodels.amigos.Perfil;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AmigoConsolaImp implements AmigoVista {
    private Scanner teclado;
    
    private List<FilaRanking> ranking;
    private Perfil perfil;
    private int idAmigo;
    private Runnable evtCambiarNombre;
    private Runnable evtAgregarAmigo;
    
    public AmigoConsolaImp() {
        this.teclado = new Scanner(System.in);
    }
    
    @Override
    public void open() {
        System.out.println("Amigos:");
        System.out.println("    Ranking:");
        System.out.println("        Usuario    TiempoEstudio    TiempoMedioEjercicio    Metros    Puntos");
        for (FilaRanking fila : this.ranking) {
            System.out.print("        " + fila.getNombreAmigo());
            System.out.print("   " + fila.getTiempoEstudio());
            System.out.print("   " + fila.getTiempoMedioEjercicio());
            System.out.print("   " + fila.getMetrosRecorridos());
            System.out.println("   " + fila.getPuntos());
        }
        
        System.out.println("    Perfil:");
        System.out.println("        Nombre: " + this.perfil.getNombre());
        System.out.println("        Tu id: " + this.perfil.getId());
        
        System.out.println("    Opciones:");
        System.out.println("        1) Cerrar pantalla Amigos.");
        System.out.println("        2) Agregar un amigo.");
        System.out.println("        3) Actualizar perfil.");
        
        int opcion;
        do {
            try {
                System.out.print("            Opcion -> ");
                opcion = Integer.parseInt(this.teclado.nextLine());
                System.out.println("");
            } catch (Exception ex) { opcion = -1; }
        } while (opcion < 1 || opcion > 3);
        
        switch (opcion) {
            case 1: this.close(); break;
            case 2: this.evtAgregarAmigo.run(); break;
            case 3: this.evtCambiarNombre.run(); break;
            default: break;
        }
    }

    @Override
    public void close() {
        System.out.println("------------------------------------------------------------------------------");
    }

    @Override
    public void setRanking(List<FilaRanking> ranking) {
        this.ranking = new ArrayList<>();
        for (FilaRanking fila : ranking) {
            this.ranking.add(new FilaRanking(fila));
        }
    }

    @Override
    public void setPerfil(Perfil perfil) {
        this.perfil = new Perfil(perfil);
    }

    @Override
    public void setEventoCambiarNombre(Runnable evtCambiarNombre) {
        this.evtCambiarNombre = evtCambiarNombre;
    }

    @Override
    public void setEventoAgregarAmigo(Runnable evtAgregarAmigo) {
        this.evtAgregarAmigo = evtAgregarAmigo;
    }

    @Override
    public List<FilaRanking> getRanking() {
        List<FilaRanking> copiaRanking = new ArrayList<>();
        for (FilaRanking fila : this.ranking) {
            copiaRanking.add(new FilaRanking(fila));
        }
        return copiaRanking;
    }

    @Override
    public Perfil getPerfil() {
        return new Perfil(this.perfil);
    }

    @Override
    public int getIdAmigo() {
        return this.idAmigo;
    }
}
