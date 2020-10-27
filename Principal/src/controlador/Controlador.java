/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import principal.Inicio;

/**
 *
 * @author Alejandro Mir
 */
public class Controlador implements ActionListener{
    
    private Inicio view;
    private Modelo model;
    
    public Controlador(Inicio view, Modelo model)
    {
        this.view = view;
        this.model= model;
        this.view.btnOk.addActionListener(this);
        this.view.btnRegistrame.addActionListener(this);
    }
    
    public void iniciar()
    {
        view.setTitle("MVC Inicio");
        view.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        model.setNomUsuario(view.txtNomUsuario.getText());
        model.setContraseña(view.txtContraseña.getName());
        model.comprobarUsuario();
    }
    
}
