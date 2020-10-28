/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Club;
import modelo.Federacion;
import modelo.Federaciones;
import modelo.Jugador;
import modelo.Provincias;

/**
 *
 * @author danielsanchezgarcia
 */
public class RegistroController {
    
    private Federaciones federaciones;
    private Provincias provincias;
    
    public RegistroController() {
        
        federaciones = new Federaciones();
        provincias = new Provincias();
    }
    
    public ArrayList<Federacion> getFederaciones() {
        return federaciones.getFederaciones();
    }
    
    public String[] getProvincias() {
        return provincias.getProvincias();
    }
    
    public ArrayList<Club> getClubs(String provincia) {
        
        ArrayList<Federacion> federaciones;
        ArrayList<Club> clubs = null;
        federaciones = this.federaciones.getFederaciones();
        boolean encontrado = false;        
        int indice = 0;
        
        while (!encontrado) {
            if (federaciones.get(indice).getComunidad().equals(provincia)) {
                clubs = federaciones.get(indice).getClubs();
                encontrado = true;
            }            
        }
        return clubs;
    }
    
    public void addJugador(Club club, Jugador jugador) {
        club.addJugador(jugador);
    }
    
}
