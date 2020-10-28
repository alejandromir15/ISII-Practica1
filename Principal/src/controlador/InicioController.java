/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Club;
import modelo.Federacion;
import modelo.Federaciones;
import modelo.Provincias;

/**
 *
 * @author danielsanchezgarcia
 */
public class InicioController {
    
    private Federaciones federaciones;
    private Federacion federacion;
    private Provincias provincias;

    public InicioController() {
        federacion = new Federacion();
        federaciones = new Federaciones();
        provincias = new Provincias();
    }
    
    public void llenarFederaciones(){
     
        for(int i = 0; i < provincias.getProvincias().length; i++){
            for(int j=0; j < 10; j++)
            {
                federacion.addClub(new Club("Club " + j, provincias.getProvincias()[i]));
            }
            federaciones.addFederacion(federacion);
        }
    }
}
