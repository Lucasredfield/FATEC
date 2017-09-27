package systemlanguage;
import java.util.Locale;
/**
 * @author Lucas Joaquim
 */
public class SystemLanguage{  
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("System Language:");
        System.out.println(loc.getDisplayCountry()); // Print Language
        System.out.println(loc.getLanguage()); // imprime "En"
    } 
}
