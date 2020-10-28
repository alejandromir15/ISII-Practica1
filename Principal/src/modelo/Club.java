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
public class Club {
    
    private String nombre, comunidad;
    private ArrayList<Jugador> jugadores;

    public Club(String nombre, String comunidad) {
        this.nombre = nombre;
        this.comunidad = comunidad;
        jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    public void addJugador(Jugador jugador){
        jugadores.add(jugador);
    }
}
