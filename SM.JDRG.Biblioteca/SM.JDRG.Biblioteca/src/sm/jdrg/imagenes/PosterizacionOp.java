/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jdrg.imagenes;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import sm.image.BufferedImageOpAdapter;

/**
 * Herdeda de BufferedImageOP, consiste en ir reduciendo el numero de 
 * colores de una imagen en un numero especifico de niveles
 * @author jdrg
 */
public class PosterizacionOp extends BufferedImageOpAdapter {

    private int niveles;

    /**
     * Constructor por defecto
     * @param niveles numero de niveles para reducir los colores
     */
    public PosterizacionOp(int niveles) {
        this.niveles = niveles;
    }

    /**
     * Sobrecarga del metodo filter, reduce los colores de una imagen
     * @param src imagen origen
     * @param dest imagen destino
     * @return BufferedImage dest
     */
    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest) {
        if (src == null) {
            throw new NullPointerException("src image is null");
        }
        if (dest == null) {
            dest = createCompatibleDestImage(src, null);
        }
        WritableRaster srcRaster = src.getRaster();
        WritableRaster destRaster = dest.getRaster();
        int sample;
        float k = 256.f/niveles;

        for (int x = 0; x < src.getWidth(); x++) {
            for (int y = 0; y < src.getHeight(); y++) {
                for (int band = 0; band < srcRaster.getNumBands(); band++) {
                    sample = srcRaster.getSample(x, y, band);
                    sample  = (int)(k * (int)(sample/k));                   

                    destRaster.setSample(x, y, band, sample);
                }
            }
        }
        return dest;
    }
}
    

