/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jdrg.graficos;

/**
 *Clase enumerado que contiene las formas
 * @author jdrgj
 */
public enum Formas {
    PUNTO("sm.jdrg.graficos.Punto2D"),
    LINEA("sm.jdrg.graficos.Linea2D"),
    RECTANGULO("sm.jdrg.graficos.Rectangulo2D"),
    ELIPSE("sm.jdrg.graficos.Elipse2D");
    

    private final String clase;
    /**
     * Constructor de la forma
     * @param nombre nombre de la forma
     */
    private Formas(String nombre) {
        this.clase = nombre;
    }
    /** 
     * Consultor del nombre
     * @return devuelve el nombre de la forma
     */
    public String getNombreForma() {
        return clase;
    }
}
