/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Alejandro Mir
 */
public class Jugador {
   
    String nomUsuario, contraseña, correo, cuentabancaria;
    int ELO;
    Club club;
    Date fechaNacimiento;

    public Jugador(String nomUsuario, String contraseña, String correo, String cuentabancaria, int ELO, Club club, Date fechaNacimiento) {
        this.nomUsuario = nomUsuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.cuentabancaria = cuentabancaria;
        this.ELO = ELO;
        this.club = club;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCuentabancaria() {
        return cuentabancaria;
    }

    public void setCuentabancaria(String cuentabancaria) {
        this.cuentabancaria = cuentabancaria;
    }

    public int getELO() {
        return ELO;
    }

    public void setELO(int ELO) {
        this.ELO = ELO;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
