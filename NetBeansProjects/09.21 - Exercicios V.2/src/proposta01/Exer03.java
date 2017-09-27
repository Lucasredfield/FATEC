/*

 */
package proposta01;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Exer03 {
public static void x() {
    
    Calendar d = Calendar.getInstance(); // Ativando método
    int dia = d.get(Calendar.DATE); // Obtendo dia do sistema
    int mes = d.get(Calendar.MONTH); // Obtendo mes do sistema
    int ano = d.get(Calendar.YEAR); // Obtendo ano do sistema

    JOptionPane.showMessageDialog(null,"Entre com sua data de nascimento");
    int anoNasc = Integer.parseInt(JOptionPane.showInputDialog(null,"Ano: "));    
    int mesNasc = Integer.parseInt(JOptionPane.showInputDialog(null,"Mês: "));
    int diaNasc = Integer.parseInt(JOptionPane.showInputDialog(null,"Dia: "));

    Calendar Hoje = new GregorianCalendar(ano, mes - 1, dia);
    Calendar Nasc = new GregorianCalendar(anoNasc, mesNasc - 1, diaNasc);

    double diff = Hoje.getTimeInMillis() - Nasc.getTimeInMillis();
    diff = diff / (24 * 60 * 60 * 1000); // hours in a day, minutes in a hour,
                                    // seconds in a minute, millis in a
                                    // second.
    JOptionPane.showMessageDialog(null,Math.round(diff));
}
}

