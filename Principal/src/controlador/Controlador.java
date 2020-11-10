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
import vista.ApuntarTorneo;
import vista.Inicio;
import vista.ReservarSede;
import vista.VentanaAdvertenciaRegistro;
import vista.VentanaRegistro;

/**
 *
 * @author Alejandro Mir
 */
public class Controlador {

    private final Federaciones federaciones;
    private Comunidades comunidades;
    private final Jugadores jugadores;
    private Jugador jugador;
    private Jugador jugadorTemporal;
    private VentanaAdvertenciaRegistro advertenciaRegistro;
    private VentanaRegistro ventanaRegistro;
    private ApuntarTorneo apuntarTorneo;
    private ReservarSede reservarSede;

    public Controlador() {
        federaciones = new Federaciones();
        jugadores = new Jugadores();
        comunidades = new Comunidades();
        ventanaRegistro = new VentanaRegistro(this);
        advertenciaRegistro = new VentanaAdvertenciaRegistro(this);
        apuntarTorneo = new ApuntarTorneo(this);
    }

    public void llenarFederaciones() {
        System.out.println(comunidades.getComunidades().length);
        for (int i = 0; i < comunidades.getComunidades().length; i++) {
            Federacion federacion = new Federacion();
            for (int j = 0; j < 10; j++) {
                federacion.addClub(new Club("Club " + j + "|" + comunidades.getComunidades()[i], comunidades.getComunidades()[i]));
            }
            federaciones.addFederaciones(federacion);
        }
    }

    public Jugador getJugador() {
        return jugador;
    }

    
    public ApuntarTorneo getApuntarTorneo() {
        return apuntarTorneo;
    }

    public VentanaAdvertenciaRegistro getAdvertenciaRegistro() {
        return advertenciaRegistro;
    }

    public VentanaRegistro getVentanaRegistro() {
        return ventanaRegistro;
    }

    public ReservarSede ReservarSede() {
        reservarSede = new ReservarSede(this);
        return reservarSede;
    }
    
    
    
    public void addJugador(Club club, Jugador jugador) {
        club.addJugador(jugador);
    }

    public boolean comprobarUsuario(String usuario, String contraseña) {
        boolean encontrado = false;
        for(int i = 0; i < comunidades.getComunidades().length; i++) {
            for(int j = 0; j < federaciones.getFederaciones().get(i).getClubs().size(); j++){
                for(int w = 0; w < federaciones.getFederaciones().get(i).getClubs().get(j).getJugadores().size(); w++)
                {
                    if(federaciones.getFederaciones().get(i).getClubs().get(j).getJugadores().get(w).getNomUsuario().equals(usuario) ||
                            federaciones.getFederaciones().get(i).getClubs().get(j).getJugadores().get(w).getContraseña().equals(contraseña))
                    {
                        encontrado = true;
                       this.jugador = federaciones.getFederaciones().get(i).getClubs().get(j).getJugadores().get(w);
                    }
                }
            }
           
        }
        return encontrado;
    }
   
    
    public void setJugadorTemporal(Jugador jugador)
    {
        this.jugadorTemporal = jugador;
    }
    
    public Jugador getJugadorTemporal()
    {
        return this.jugadorTemporal;
    }
    
    public String[] getComunidades()
    {
        return comunidades.getComunidades();
    }
    
    public ArrayList <Club> getClubs(int comunidad)
    {   
        return federaciones.getFederaciones().get(comunidad).getClubs();
    }
    
    public String[] getClubsName(int comunidada)
    {
    
        ArrayList <Club> clubs = getClubs(comunidada);
        System.out.println(clubs.size());
        String nombreClubs[] = new String[clubs.size()];
           
        for(int i = 0; i < clubs.size(); i++)
        {
            nombreClubs[i]=clubs.get(i).getNombre();
        }
        
        return nombreClubs;
    }
    
  
}
