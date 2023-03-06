/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jdrg.iu;
import sm.jdrg.graficos.*;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Clase lienzo, es la encargada de pintar las figuras y gestionar las operaciones
 * @author jdrgj
 */

          
  public class Lienzo2D extends javax.swing.JPanel {

    Point punto;
    private myShape myshape = new myShape();
    private Formas forma;
    List<myShape> vShape;
    Point2D p, p1, p2;
    Linea2D linea;
    Punto2D punto2D;
    Rectangulo2D rectangulo;  
    Elipse2D elipse;
    
    
  /**
   * Constructor por defecto
   */
    public Lienzo2D() {
        this.forma = Formas.PUNTO;
        this.vShape = new ArrayList();
        
        initComponents();
    }
    
    /**
     * Método paint de lienzo, que llama al paint de myShape 
     * @param g objeto Graphics que pasemos
     */
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        for( myShape s: vShape) { 
            s.paint(g2d);
        }
    }
  
    /**
     * Modificador del primero punto
     * @param p1 primer punto
     */
    public void setP1(Point2D p1){
        myshape.setP1(p1);
    }
    
     /**
     * Modificador del segundo punto
     * @param p2 punto
     */
    public void setP2(Point2D p2){
        myshape.setP2(p2);
    }
 
  
    
    /**
     * Consultor del color de relleno de la figura
     * @return color devuelve un color
     */
    public Color getColorRelleno(){
        
        return myshape.getColorRelleno();
    }
    
    /**
     * Modificador de color de relleno de la figura
     * @param color color que queramos dentro de los disponibles
     */
     public void setColorRelleno(Color color){
        myshape.setColorRelleno(color);    
    }
    

     /**
     * Consultor del color del trazo
     * @return color dentro de los disponibles
     */ 
    public Color getColorTrazo(){
        
        return myshape.getColorTrazo();
    }
    
    /**
     * Consultor del color
     * @return color
     */
    public Color getColor(){       
        return myshape.getColor();
    }
    
 /**
  * Modificador del color
  * @param color dentro de los disponibles
  */
    public void setColor(Color color){
        myshape.setColor(color);    
    }
    /**
    * Modificador del color del trazo de la figura
    * @param color color que queramos dentro de los disponibles
    */
    public void setColorTrazo(Color color){
        myshape.setColorTrazo(color);    
    }
    
     /**
     * Consultor del colorPlano usado para determinar si solo se ha usado un color para pintar la figura
     * @return colorPlano
     */
    public boolean getPlano(){
        
        return myshape.getPlano();
    }
    
    
      /**
     * Modificador del colorPlano usado para determinar si solo se ha usado un color para pintar la figura
     * @param colorPlano boolean
     */
    public void setPlano(boolean colorPlano){
        myshape.setPlano(colorPlano);    
    }
    


    
     /**
     * Consultor para determinar si la figura tiene relleno
     * @return boolean relleno
     */
    public boolean getRelleno() {
        return myshape.getRelleno();
    }

    /**
     * Modificador para establecer el relleno de la figura
     * @param relleno boolean
     */
    public void setRelleno(boolean relleno) {
        myshape.setRelleno(relleno);
    }

    /**
     * Consultor para determinar el alisado de una figura
     * @return boolean alisado
     */
    public boolean getAlisado(){
        return myshape.getAlisado();
    }
    
    /**
     * Modificador de alisado de la figura
     * @param alisado boolean
     */
    public void setAlisado(boolean alisado){
        myshape.setAlisado(alisado);
    }
    
    /**
     * Modificador para establecer la forma de la figura
     * @param forma dentro de las 4 disponibles
     */
    public void setForma(Formas forma) {
        this.forma = forma;
    }
    /**
     * Consultor para obtener la forma de la figura
     * @return forma
     */
    public Formas getForma() {
        return forma;
    }
     
    /**
     * Consultor para determinar si la figura tiene linea discontinua
     * @return boolean discontinuidad
     */
    public boolean getDiscontinuidad(){
        return myshape.getDiscontinuidad();
    }
    
       /**
     * Modificador para establecer la discontinuidad
     * @param discontinuidad boolean
     */
    public void setDiscontinuidad(boolean discontinuidad){
        myshape.setDiscontinuidad(discontinuidad);
    }
    
    /**
     * Consultor del grosor del trazo de la figura
     * @return float grosor
     */
    public float getGrosor(){
        return myshape.getGrosor();
    }
    
    /**
     * Modificador del grosor del trazo de la figura
     * @param grosor float
     */
    public void setGrosor(float grosor){
        myshape.setGrosor(grosor);
    }
    
    public boolean getEditar() {
        return myshape.getEditar();
    }
    public void setEditar(boolean editar) {
        myshape.setEditar(editar);
    }
    
    /**
     * Consultor para determinar si la figura es transparente 
     * @return boolean transparencia
     */
     public boolean getTransparencia(){
        return myshape.getTransparencia();
    }
     
     /**
     * Modificador para establecer la transparencia de una figura
     * @param transparencia boolean
     */
    public void setTransparencia(boolean transparencia){
        myshape.setTransparencia(transparencia);
    }
    

   
    
   

    

    
     /* This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       p = evt.getPoint();
        if(forma==Formas.PUNTO){
            punto2D = new Punto2D(myshape);
            vShape.add(punto2D);
        }
        else if(forma==Formas.LINEA){
            linea = new Linea2D(myshape);
            vShape.add(linea);
        }
        else if(forma==Formas.RECTANGULO){
            rectangulo = new Rectangulo2D(myshape);
            vShape.add(rectangulo);
        }
        else if(forma==Formas.ELIPSE){
             elipse = new Elipse2D(myshape);
             vShape.add(elipse);
                    
        }
      
        
        
    }//GEN-LAST:event_formMousePressed
/**
 * Establecer funcionalidad al dejar de hacer click en el raton
 * @param evt EventSet
 */
    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        this.formMouseDragged(evt);
        this.repaint();
    }//GEN-LAST:event_formMouseReleased
/**
 * Establecer funcionalidad al arrastrar el raton
 * @param evt EventSet
 */
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        if(forma == Formas.PUNTO){
            punto2D.setPoints(p,p);
        }
        else if(forma==Formas.LINEA)
            linea.setPoints(p,evt.getPoint());
        else if(forma==Formas.RECTANGULO){
            setP1(p);
            setP2(evt.getPoint());
            rectangulo.setPoints(p, evt.getPoint());
        }
        else if(forma==Formas.ELIPSE){
            setP1(p);
            setP2(evt.getPoint());
            elipse.setPoints(p, evt.getPoint());
        }
        
        this.repaint();
    }//GEN-LAST:event_formMouseDragged
/***
 * Establecer funcionalidad al hacer click
 * @param evt EventSet
 */
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        punto = evt.getPoint();
        this.repaint();
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
