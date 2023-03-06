/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jdrg.imagenes;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import sm.image.BufferedImageOpAdapter;
import sm.image.BufferedImageOpAdapter;
import sm.image.BufferedImagePixelIterator;
import sm.image.BufferedImagePixelIterator;

/**
 * Operador nuevo píxel a píxel, aumenta el brillo con tonos azulados
 * @author jdrg
 */
public class PixelOp extends BufferedImageOpAdapter{
    
    /**
     * Constructor por defecto
     */
    public PixelOp() {
    }
    
    /**
     * Sobrecarga del método filter, aplica píxel a píxel un valor determinado
     * para obtener el resultado
     * 
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

        WritableRaster raster = dest.getRaster();
        BufferedImagePixelIterator.PixelData pixel;
        
        for (BufferedImagePixelIterator it = new BufferedImagePixelIterator(src); it.hasNext();) {
            pixel = it.next();

            float initRed = pixel.sample[0];
            float initGreen = pixel.sample[1];
            float initBlue = pixel.sample[2];

            pixel.sample[0] = Math.min(255, ((int)(initRed * 0.03f + initGreen * 2.7f + initBlue * 3.888f)));
            pixel.sample[1] = Math.min(255, ((int)( initRed * 1.634f + initGreen * 4.234f + initBlue * 0.563f)));
            pixel.sample[2] = Math.min(255, ((int)(initRed * 2.146f + initGreen * 3.454f + initBlue * 0.422f)));

            raster.setPixel(pixel.col, pixel.row, pixel.sample);
        }
        return dest;
    }
}
