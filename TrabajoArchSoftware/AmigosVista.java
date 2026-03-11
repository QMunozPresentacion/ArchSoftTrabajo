package app.vistas;


public interface AmigosVista {
    public void open();
    public void cambiarNombre(int idUsuario, String nombre);
    public void agregarAmigo(int idAmigo);
    public void close();
}
