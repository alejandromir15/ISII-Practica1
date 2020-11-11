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
public class Federacion {
    
    private String comunidad;
    private ArrayList<Club> clubs;
    private ArrayList <Torneo> torneos;

    public Federacion() {
        comunidad = "";
        clubs = new ArrayList<>();
        torneos = new ArrayList<>();
    }

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    public ArrayList<Club> getClubs() {
        return clubs;
    }

    public void setClubs(ArrayList<Club> clubs) {
        this.clubs = clubs;
    }
    
    public void addClub(Club club)
    {
        clubs.add(club);
    }    

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(Torneo torneo) {
        this.torneos.add(torneo);
    }
    
    
}
