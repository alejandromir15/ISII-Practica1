/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author danielsanchezgarcia
 */
public class Jugadores {

    private ArrayList<Jugador> jugadores;

    public Jugadores() {
        jugadores = new ArrayList<>();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void addJugadores(Jugador jugador) {
        jugadores.add(jugador);
    }

}
