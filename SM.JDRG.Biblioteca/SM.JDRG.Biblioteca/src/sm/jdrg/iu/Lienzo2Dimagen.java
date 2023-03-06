/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jdrg.iu;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sm.jdrg.graficos.myShape;
import java.awt.image.BufferedImage;
import java.awt.Dimension;
import java.awt.Rectangle;



/**
 * Clase que hereda de lienzo y gestiona la imagen
 * @author jdrgj
 */


public class Lienzo2Dimagen extends Lienzo2D{
  
    private BufferedImage img = null;
    
    /**
     * Permite ver el lienzo y la imagen
     * @param g objeto Graphics 
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(img!=null)
            g.drawImage(img,0,0,this);
    }
    
    /**
     * Consultor de la imagen 
     * @return BufferedImage img
     */
    public BufferedImage getImg(){
        return img;
    }
    
   /**
    * Consultor de la imagen del lienzo con lo que hayamos pintado
    * @param vector boolean
    * @return BufferedImage img
    */
    public BufferedImage getImg(boolean vector){
        if (vector) {
            BufferedImage imgAux = new BufferedImage(this.img.getWidth(), this.img.getHeight(), this.img.getType());
            Graphics2D g2d = imgAux.createGraphics();
            this.paint(g2d);
            this.img = imgAux;
            return img;
        }
        else
            return getImg();
        
    }
    
    /**
     * Modificador de la imagen
     * @param img tipo BufferedImage
     */
    public void setImg(BufferedImage img){
        this.img = img;
        if(img!=null) {
            setPreferredSize(new Dimension(img.getWidth(),img.getHeight()));
        }
    }
    


}  

