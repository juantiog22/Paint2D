/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaFinal;


import java.awt.image.BufferedImage;
import java.io.File;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.player.MediaPlayerEventListener;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;

/**
 *  Clase VentanaInternaVideo. Ventana interna que permite vídeo.
 *  @author jdrgj
 */
public class VentanaInternaVideo extends VentanaInternaMultimedia {

   
    private EmbeddedMediaPlayer vlcplayer = null;
    private File fMedia;

    /**
     * 
     * Creates new from VentanaInternaVideo
     */
    public VentanaInternaVideo(File f) {
        initComponents();
        fMedia = f;
        EmbeddedMediaPlayerComponent aVisual = new EmbeddedMediaPlayerComponent();
        getContentPane().add(aVisual, java.awt.BorderLayout.CENTER);
        vlcplayer = aVisual.getMediaPlayer();
    }
    /**
     * 
     * Devuelve una instancia de VentanaInternaVideo
     * @param f File abrir archivo
     * @return EmbeddeMediaPlayer vlcplayer
     */
    public static VentanaInternaVideo getInstance(File f) {
        VentanaInternaVideo v = new VentanaInternaVideo(f);
        return (v.vlcplayer != null ? v : null);
    }
    
    /**
     * Comenzar reproduccion de video
     */
    public void play() {
        if (vlcplayer != null) {
            if (vlcplayer.isPlayable()) {              
                vlcplayer.play(); //Si se estaba reproduciendo
            } else {
                vlcplayer.playMedia(fMedia.getAbsolutePath());
            }
        }
    }

    /**
     * Terminar reproduccion de video
     */
    public void stop() {
        if (vlcplayer != null) {
            if (vlcplayer.isPlaying()) {
                vlcplayer.pause();
            } else {
                vlcplayer.stop();
            }
        }
    }
    
    /**
     * 
     * Añade un manejador para gestionar eventos.
     * @param ml MediaPlayerEventListener manejador
     */
    public void addMediaPlayerEventListener(MediaPlayerEventListener ml) {
        if (vlcplayer != null) {
            vlcplayer.addMediaPlayerEventListener(ml);
        }
    }
    
    /**
     * Hace una captura de pantalla 
     * @return BufferedImage
     */
    public BufferedImage getCaptura(){
       return vlcplayer.getSnapshot();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Video");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        setBounds(0, 0, 410, 308);
    }// </editor-fold>//GEN-END:initComponents
/**
 * Cierra la ventana
 * @param evt 
 */
    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
            if(vlcplayer!=null){
            vlcplayer.stop();
            vlcplayer=null;
        }
            // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
