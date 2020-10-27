/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import controlador.Controlador;
import modelo.Modelo;
import principal.Inicio;

/**
 *
 * @author Alejandro Mir
 */
public class MVC {
    
    
    public static void main (String[] args){
        
        Modelo mod = new Modelo();
        Inicio view = new Inicio();
        
        Controlador ctrl = new Controlador(view,mod);
        
        ctrl.iniciar();
        view.setVisible(true);
    }
    
}
