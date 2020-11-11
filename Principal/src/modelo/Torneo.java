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
public class Torneo {
    
    String nombre;
    private ArrayList <Jugador> jugadores;

    public Torneo(String nombre) {
        this.nombre = nombre;
        jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    public void addJugadores(Jugador jugador)
    {
        this.jugadores.add(jugador);
    }
}
