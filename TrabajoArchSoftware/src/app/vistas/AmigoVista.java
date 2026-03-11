package app.vistas;

import app.modelos.Usuario;

interface AmigoVista {
    public void open();
    public void cambiarNombre(Usuario usuario, String nombre);
    public void agregarAmigo(Usuario usuario,int idAmigo);
    public void close();
}
