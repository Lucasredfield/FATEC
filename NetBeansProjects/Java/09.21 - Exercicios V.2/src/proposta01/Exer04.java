/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proposta01;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Exer04 {
    public static void x(){
    int pernas = Integer.parseInt(JOptionPane.showInputDialog("Insira a"+
        " quantidade de patas para verificar que tipo de Animal se trata: "));
    String tipo;
    switch(pernas){
        case 1:
            tipo = "Saci";
            break;
        case 2:
            tipo = "Bípede";            
            break;
        case 3:
            tipo = "Tripé";
            break;
        case 4:
            tipo = "Quadrúpede";
            break;
        case 6:
            tipo = "Aranha";            
            break;
        default:
            tipo = "ET";            
            break;
    }
    JOptionPane.showMessageDialog(null,"Isso é um(a): " + tipo);  
    }
    
}
