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
public class Federaciones {
    
    private ArrayList <Federacion> federaciones;

    public Federaciones() {
        federaciones = new ArrayList<>();
    }

    public ArrayList<Federacion> getFederaciones() {
        return federaciones;
    }

    public void setFederaciones(ArrayList<Federacion> federaciones) {
        this.federaciones = federaciones;
    }
    
    public void addFederacion(Federacion federacion){
        federaciones.add(federacion);
    }
}
