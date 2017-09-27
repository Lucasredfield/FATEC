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
public class Menu1 {
    public static void p1(){ 
    int op = 1;
    String x;
        while(op != 0){
            x = JOptionPane.showInputDialog(null,"Menu PROPOSTA01: "
            + "\n 1- Promoção do Dia" 
            + "\n 2- Dia de Hoje"
            + "\n 3- Exercício 03"
            + "\n 4- Exercício 04"
            + "\n 5- Exercício 05"
            + "\n 0- Voltar"
            );
            op = Integer.parseInt(x);
            
        switch(op){    
            case 1:
                Exer01.x();
            break;
    
            case 2:
                Exer02.x();
            break;
    
            case 3:
                Exer03.x();
            break;
            
            case 4:
                Exer04.x();
            break;
            
            case 5:
                Exer05.x();
            break;
            
            case 0:
            break;
            
            default:

    }
}
}
}
