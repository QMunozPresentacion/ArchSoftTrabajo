package app.vistas;
import app.modelos.Usuario;
import app.vistas.*;

public class AmigoConsola implements AmigoVista{

    @Override
    public void open() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cambiarNombre(Usuario usuario, String nombre) {
        usuario.setNombre(nombre);
    }

    @Override
    public void agregarAmigo(Usuario usuario,int idAmigo) {
        usuario.addAmigo(idAmigo);
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
