package horadosistema;

import java.util.Date;

/**
* @author Lucas Joaquim
 */
public class HoraDoSistema {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date clock = new Date();
        System.out.println("System Time: ");
        System.out.println(clock.toString());
    }
}
