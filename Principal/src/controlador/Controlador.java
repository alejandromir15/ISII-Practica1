/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Club;
import modelo.Comunidades;
import modelo.Federacion;
import modelo.Federaciones;
import modelo.Jugador;
import modelo.Jugadores;
import vista.Inicio;

/**
 *
 * @author Alejandro Mir
 */
public class Controlador {

    private final Federaciones federaciones;
    private Comunidades comunidades;
    private final Federacion federacion;
    private final Jugadores jugadores;

    public Controlador( Federaciones federaciones) {
        this.federaciones = federaciones;
        federacion = new Federacion();
        jugadores = new Jugadores();
    }

    public void llenarFederaciones() {
        for (int i = 0; i < comunidades.getComunidades().length; i++) {
            for (int j = 0; j < 10; j++) {
                federacion.addClub(new Club("Club " + j, comunidades.getComunidades()[i]));
            }
            federaciones.addFederaciones(federacion);
        }
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

    public boolean comprobarUsuario(String usuario, String contraseña) {
        boolean encontrado = false;
        int indice = 0;
        while (!encontrado) {
            if (jugadores.getJugadores().get(indice).getNomUsuario().equals(usuario)) {
                if (jugadores.getJugadores().get(indice).getContraseña().equals(contraseña)) {
                    encontrado = true;
                    return encontrado;
                }
            }
            indice++;
        }
        return encontrado;
    }
}
