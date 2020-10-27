/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Jugador;
import java.util.Arrays;

/**
 *
 * @author Alejandro Mir
 */
public class Modelo {
    
    Jugador usuariosRegistrados[] = new Jugador[99];
    
    private String nomUsuario;
    private String contraseña;

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
    
    public boolean comprobarUsuario(){

        for (Jugador usuariosRegistrado : usuariosRegistrados) {
            if (usuariosRegistrado.getNomUsuario().equals(this.nomUsuario)) {
                if (usuariosRegistrado.getContraseña().equals(this.contraseña)) {
                    return true; 
                }
            }
        }
        return false;
    }
    
}
