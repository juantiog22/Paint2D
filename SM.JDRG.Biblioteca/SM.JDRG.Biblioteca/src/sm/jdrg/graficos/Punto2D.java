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
 * Crea un punto a partir de otro antrior
 * @author jdrgj
 */
public class Punto2D extends myShape{
    
     /**
     * Contructor punto
     * @param shape figura myshape de la que hereda para construirla
     */
     public Punto2D(myShape shape) {
        this.copyAttributes(shape);
        this.figura = new Line2D.Float();
    }

     /**
     * Crea los puntos
     * @param p1 punto inicial
     * @param p2 punto final
     */
   public void setPoints(Point2D p1, Point2D p2) {

        figura = new Line2D.Double(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
    
    
}
