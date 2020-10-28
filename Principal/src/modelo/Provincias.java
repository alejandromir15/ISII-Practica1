/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author danielsanchezgarcia
 */
public class Provincias {
    
    private String provincias[];

    public Provincias() {
        
        provincias = new String[] {"Andalucía", "Aragón", "Canarias", "Cantabria", "Castilla y León", "Castilla-La Mancha", "Cataluña", "Ceuta", 
        "Comunidad Valenciana", "Comunidad de Madrid", "Extremadura", "Galicia", "Islas Baleares", "La Rioja", "Melilla", "Navarra", "País Vasco", 
        "Principado de Asturias", "Región de Murcia"};
    }
    
    public String[] getProvincias() {
        return provincias;
    }

    public void setProvincias(String[] provincias) {
        this.provincias = provincias;
    }
    
    

}
