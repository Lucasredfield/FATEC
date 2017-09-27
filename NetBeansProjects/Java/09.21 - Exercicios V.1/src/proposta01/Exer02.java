/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proposta01;

import java.util.Calendar;
import javax.swing.*;

public class Exer02 {
    public static void x(){
        Calendar d = Calendar.getInstance();
        int dia = d.get(Calendar.DAY_OF_MONTH);
        JOptionPane.showMessageDialog(null, "Hoje é dia: " + dia);
    }
}
