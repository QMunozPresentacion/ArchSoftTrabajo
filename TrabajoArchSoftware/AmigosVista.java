package app.vistas;

import app.modelos.Usuario;

public interface AmigosVista {
    public void open();
    public void cambiarNombre(Usuario usuario, String nombre);
    public void agregarAmigo(int idAmigo);
    public void close();
}
