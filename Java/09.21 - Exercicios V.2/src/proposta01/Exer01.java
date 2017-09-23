/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proposta01;

import java.util.Calendar;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author lucas
 */
public class Exer01{
    public static void x(){
	Date d = new Date();
	Calendar c = Calendar.getInstance();
	int dia = c.get(Calendar.DAY_OF_WEEK);
	switch(dia){
        case Calendar.SUNDAY: 
             JOptionPane.showMessageDialog(null, "Domingo - Almôndegas"); 
            break;
            
	case Calendar.MONDAY: 
            JOptionPane.showMessageDialog(null, "Segunda- Feira - Frango Teriyaki "
                + "(Frango grelhado temperado com molho teriaki, a base de shoyo)"); 
            break;
            
	case Calendar.TUESDAY: 
            JOptionPane.showMessageDialog(null, "Terça-Feira - Churrasco"
                    + " (steak de carne bovina com sabor churrasco)"); 
            break;
            
	case Calendar.WEDNESDAY:
            JOptionPane.showMessageDialog(null, "Quarta-Feira - Frango Defumado"
                    + " com Cream Cheese"); 
            break;
            
	case Calendar.THURSDAY: 
            JOptionPane.showMessageDialog(null, "Quinta-Feira - Italiano "
                    + "(Salame e Peperoni)"); 
            break;
            
	case Calendar.FRIDAY: 
            JOptionPane.showMessageDialog(null, "Sexta-Feira - Peito de Peru"); 
            break;
            
	case Calendar.SATURDAY: 
            JOptionPane.showMessageDialog(null, "Sábado - Peito de "
                    + "Peru e Presunto "); 
            break;
        }
    }
}
