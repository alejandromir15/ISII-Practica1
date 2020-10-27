/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Alejandro Mir
 */
public class Jugador {
    String nomUsuario;
    String contraseña;
    String correo;
    String cuentabancaria;
    int ELO;
    String club;
    String fechaNacimiento;

    public Jugador() {
    }

    public Jugador(String nomUsuario, String contraseña, String correo, String cuentabancaria, int ELO, String club, String fechaNacimiento) {
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

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
