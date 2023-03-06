/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jdrg.graficos;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Dimension;

/**
 *Crea una nueva elipse a partir de dos puntos
 * @author jdrgj
 */
    
public class Linea2D extends myShape{

     /**
     * Contructor linea
     * @param shape figura myshape de la que hereda para construirla
     */  
    public Linea2D(myShape shape) {
        this.copyAttributes(shape);
        this.figura = new Line2D.Float();
    }
    /**
     * Crea los puntos de la linea
     * @param p1 punto inicial
     * @param p2 punto final
     */
    public void setPoints(Point2D p1, Point2D p2) {
        ((Line2D)figura).setLine(p1, p2);
    }
}
