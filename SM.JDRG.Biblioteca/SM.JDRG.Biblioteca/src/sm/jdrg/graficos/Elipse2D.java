/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jdrg.graficos;
import java.awt.geom.Point2D;
import java.awt.Dimension;
import java.awt.geom.Ellipse2D;

/**
 * Crea una nueva elipse a partir de dos puntos
 * @author jdrgj
 */
public class Elipse2D extends myShape{

    /**
     * Contructor elipse
     * @param shape figura myshape de la que hereda para construirla
     */
    public Elipse2D(myShape shape) {
        this.copyAttributes(shape);
        this.figura = new Ellipse2D.Double();
    }

    /**
     * Crea los puntos de la elipse
     * @param p1 punto inicial
     * @param p2 punto final
     */
    public void setPoints(Point2D p1, Point2D p2) {
        ((Ellipse2D)figura).setFrameFromDiagonal(p1, p2);
    }
    

}

