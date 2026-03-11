/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.vistas;
import app.modelos.Usuario;
import app.vistas.*;
/**
 *
 * @author alumno
 */
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
