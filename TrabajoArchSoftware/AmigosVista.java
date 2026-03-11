package app.vistas;


public interface AmigosVista {
    public void open();
    public void cambiarNombre(Usuario idUsuario, String nombre);
    public void agregarAmigo(int idAmigo);
    public void close();
}
