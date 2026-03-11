package app.vistas.amigos;

import app.viewmodels.amigos.FilaRanking;
import app.viewmodels.amigos.Perfil;
import java.util.List;

interface AmigoVista {
    void open();
    void close();
    void setRanking(List<FilaRanking> ranking);
    void setPerfil(Perfil perfil);
    void setEventoCambiarNombre(Runnable evtCambiarNombre);
    void setEventoAgregarAmigo(Runnable evtAgregarAmigo);
    List<FilaRanking> getRanking();
    Perfil getPerfil();
    int getIdAmigo();
}