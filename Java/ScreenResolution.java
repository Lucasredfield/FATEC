package screenresolution;

import java.awt.Dimension;
import java.awt.Toolkit;
/**
    * @author Lucas Joaquim
 */
public class ScreenResolution {
    public static void main(String[] args) {
          Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
          int lar = (int) screen.getWidth();
          int alt = (int) screen.getHeight();
          System.out.println("Screen Resolution: " + lar + "x" + alt);
    }    
}
