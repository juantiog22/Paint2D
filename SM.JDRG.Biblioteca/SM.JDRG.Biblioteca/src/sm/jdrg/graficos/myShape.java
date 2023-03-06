/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jdrg.graficos;

/**
 *Clase padre que contiene los atributos  y métodos de las figuras
 * @author jdrgj
 */
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Shape;
import java.awt.Color;
import java.awt.RenderingHints;
import java.awt.GradientPaint;
import java.awt.Stroke;
import java.awt.geom.GeneralPath;
import java.awt.Composite;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;



public class myShape {
    Point punto;
    Point2D p1,p2;
    Color color, colorRelleno, colorTrazo;
    boolean colorPlano;
    boolean relleno, transparencia, alisado, discontinuidad, editar;
    float grosor;
      Shape figura;
    Shape figuraArea;
    RenderingHints alis;
    RenderingHints noAlis;
    Composite noTrans;
    Composite trans;
    Stroke trazo;


    /**
     * Constructor de myShape donde se inicializan las variables.
     * 
     */
    public myShape(){
        colorPlano = false;
        color = color.BLACK;
        colorRelleno = color.BLACK;
        colorTrazo = color.BLACK;
        alisado = false;
        discontinuidad = false;
        transparencia = false;
        editar = false;
        relleno = false;   
        alis = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        noTrans = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
        noAlis = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_OFF);
        trazo = new BasicStroke(0);  
    }
    
 
     /** 
      * Copia atributos de otra forma para no perderlos
     * @param otherShape figura que queremos copiar
     */
    protected void copyAttributes(myShape otherShape){
        this.p1 = otherShape.p1;
        this.p2 = otherShape.p2;
        this.colorPlano = otherShape.colorPlano;
        this.color = otherShape.color;
        this.colorRelleno = otherShape.colorRelleno;
        this.colorTrazo = otherShape.colorTrazo;
        this.relleno = otherShape.relleno;
        this.alisado = otherShape.alisado;
        this.transparencia=otherShape.transparencia;
        this.grosor = otherShape.grosor;
        this.trazo = new BasicStroke(grosor);
        this.discontinuidad = otherShape.discontinuidad;
        this.trans = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        if(discontinuidad){
            float pd[] = {15.0f, 15.0f};
            trazo = new BasicStroke(grosor, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, 1.0f, pd, 0.0f);
        }
        
    }
    
    /**
     * Modificador del primero punto
     * @param p1 primer punto
     */
    public void setP1(Point2D p1){
        this.p1 = p1;
    }
    
   /**
    * Consultor del primer punto
    * @return punto
    */
    public Point2D getP1(){
        return p1;
    }
     /**
     * Modificador del segundo punto
     * @param p2 punto
     */
    public void setP2(Point2D p2){
        this.p2 = p2;
    }
 
    /**
    * Consultor del segundo punto
    * @return punto
    */
    public Point2D getP2(){
        return p2;
    }
    
    public boolean getEditar() {
        return editar;
    }
    public void setEditar(boolean editar) {
        this.editar = editar;
    }
 
    /**
     * Consultor del color 
     * @return color dentro de los disponibles
     */
    public Color getColor(){
        return color;
    }
    
/**
 * Modificador del color de la figura
 * @param color que queramos dentro de los disponibles
 */
    public void setColor(Color color){
        this.color = color;
    }
    
     /**
     * Consultor del colorPlano usado para determinar si solo se ha usado un color para pintar la figura
     * @return colorPlano
     */
    public boolean getPlano(){
        return colorPlano;
    }
    
    /**
     * Modificador del colorPlano usado para determinar si solo se ha usado un color para pintar la figura
     * @param colorPlano boolean
     */
    public void setPlano(boolean colorPlano){
        this.colorPlano = colorPlano;
    }
    
     /**
     * Consultor del color del trazo
     * @return color
     */
    public Color getColorTrazo(){
        return colorTrazo;
    }
    
   /**
    * Modificador del color del trazo de la figura
    * @param colorTrazo color que queramos dentro de los disponibles
    */
    public void setColorTrazo(Color colorTrazo){
        this.colorTrazo = colorTrazo;
    }
    
    /**
     * Consultor del color de relleno de la figura
     * @return color devuelve un color
     */
    public Color getColorRelleno(){
        return colorRelleno;
    }
    
    /**
     * Modificador de color de relleno de la figura
     * @param colorRelleno color que queramos dentro de los disponibles
     */
    public void setColorRelleno(Color colorRelleno){
        this.colorRelleno = colorRelleno;
    }
    
     /**
     * Consultor para determinar si la figura tiene relleno
     * @return boolean relleno
     */
    public boolean getRelleno() {
        return relleno;
    }

    /**
     * Modificador para establecer el relleno de la figura
     * @param relleno boolean
     */
    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
    

    /**
     * Consultor para determinar si la figura tiene linea discontinua
     * @return boolean discontinuidad
     */
    public boolean getDiscontinuidad(){
        return discontinuidad;
    }
    

    /**
     * Modificador para establecer la discontinuidad
     * @param discontinuidad boolean
     */
    public void setDiscontinuidad(boolean discontinuidad){
        this.discontinuidad= discontinuidad;
    }
     /**
     * Consultor del grosor del trazo de la figura
     * @return float grosor
     */
    public float getGrosor(){
        return grosor;
    }
    

    /**
     * Modificador del grosor del trazo de la figura
     * @param grosor float
     */
    public void setGrosor(float grosor){
        this.grosor = grosor;
    }
    
    /**
     * Consultor para determinar si la figura es transparente 
     * @return boolean transparencia
     */
    public boolean getTransparencia(){
        return transparencia;
    }
    
    /**
     * Modificador para establecer la transparencia de una figura
     * @param transparencia boolean
     */
    public void setTransparencia(boolean transparencia){
        this.transparencia = transparencia;
    }
     /**
     * Consultor para determinar el alisado de una figura
     * @return boolean alisado
     */
    public boolean getAlisado(){
        return alisado;
    }
    
    /**
     * Modificador de alisado de la figura
     * @param alisado boolean
     */
    public void setAlisado(boolean alisado){
        this.alisado = alisado;
    }
    
     /**
      * Método paint donde se aplican los cambios que realizaremos
      * @param g2d objeto Graphics2D que pasemos
      */
    public void paint(Graphics2D g2d) {
        
       
        if(colorPlano)
            g2d.setColor(color);
        
        g2d.setStroke(trazo);
        
        
        if (transparencia) {
            g2d.setComposite(noTrans);
        }
        else  g2d.setComposite(trans);

        if (alisado) {
            g2d.setRenderingHints(this.alis);
        } 
        else
            g2d.setRenderingHints(noAlis);
       
        if (relleno==true && !colorPlano){
            
            g2d.setColor(colorRelleno);
            g2d.fill(figura);
            g2d.setColor(colorTrazo);
            g2d.draw(figura);
        }
        else if(relleno ==true && colorPlano)
            g2d.fill(figura);
        
        else if (relleno ==false){
            
            g2d.draw(figura);
            if(figuraArea!=null)
                g2d.draw(figuraArea);
        }
       
            
    }
}
