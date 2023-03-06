/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jdrg.graficos;
import java.awt.geom.Point2D;
import java.awt.Dimension;
import java.awt.geom.Rectangle2D;

/**
 *Crea un nuevo rectangulo a partir de dos puntos
 * @author jdrgj
 */


public class Rectangulo2D extends myShape{
    
     /**
     * Contructor rectangulo
     * @param shape figura myshape de la que hereda para construirla
     */
    public Rectangulo2D(myShape shape) {
        this.copyAttributes(shape);
        this.figura = new Rectangle2D.Float();
    }
      /**
     * Crea los puntos del rectangulo
     * @param p1 punto inicial
     * @param p2 punto final
     */
    public void setPoints(Point2D p1, Point2D p2) {
        ((Rectangle2D)figura).setFrameFromDiagonal(p1, p2);
    }
    
    

}

