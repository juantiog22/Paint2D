/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.jdrg.imagenes;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import sm.image.BufferedImageOpAdapter;

/**
 *Hereda de BufferedImageOpAdapter. Realiza la operación punto a punto 
 * para destacar los tonos rojos.
 * @author jdrg
 */
public class FiltroRojoOP extends BufferedImageOpAdapter{
  
/**
 * Sobrecarga del método filter, opera punto a punto hasta conseguir la
 * tonalidad roja
 * @param src imagen origen
 * @param dest imagen destino
 * @return BufferedImage dest
 */
    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest) {
        if(src == null){
            throw new NullPointerException("src image is null");
        }
        if(dest == null){
            dest = createCompatibleDestImage(src, null);
        }
        
        for(int x=0; x<src.getWidth(); x++){
            for(int y=0; y<src.getHeight(); y++){
                int destR, destG, destB;
                int srcR, srcG, srcB;
                Color colorSrc = new Color(src.getRGB(x, y));
                Color colorDest;
                srcR = colorSrc.getRed();
                srcG = colorSrc.getGreen();
                srcB = colorSrc.getBlue();
                destR = srcR;
                destG = (srcG+srcB)/2;
                destB = (srcG+srcB)/2;
                
                colorDest = new Color(destR, destG, destB);
                dest.setRGB(x, y, colorDest.getRGB());
            }
        }
        
        return dest;
}
}
