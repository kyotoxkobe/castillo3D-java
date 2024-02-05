    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import com.sun.j3d.utils.image.TextureLoader;
import java.awt.Color;
import java.awt.Container;
import javax.media.j3d.Appearance;
import javax.media.j3d.Material;
import javax.media.j3d.Texture;
import javax.media.j3d.TransparencyAttributes;
import javax.vecmath.Color3f;


public class Apariencia {
    Appearance ap;
    public Appearance setImagen(String nomarch) {
        ap = new Appearance();
        Material material = new Material();
        ap.setCapability(Appearance.ALLOW_MATERIAL_WRITE);
        ap.setCapability(Appearance.ALLOW_MATERIAL_READ);
        material.setAmbientColor(new Color3f(Color.DARK_GRAY));
        material.setDiffuseColor(new Color3f(Color.RED));
        material.setSpecularColor(new Color3f(Color.WHITE));
        material.setEmissiveColor(new Color3f(Color.BLACK));
        material.setShininess(50.0f);
        ap.setMaterial(material);
        String ruta = "src/img/";
        TextureLoader loader = new TextureLoader((ruta + nomarch), new Container());
        Texture texture = loader.getTexture();
        ap.setTexture(texture);

        return ap;
    }  
  
        public Appearance getTransparencia() {
            ap = new Appearance();         
            TransparencyAttributes trans = new TransparencyAttributes(TransparencyAttributes.BLENDED,0.85f);
            ap.setTransparencyAttributes(trans);
        
        return ap;
    }
}
