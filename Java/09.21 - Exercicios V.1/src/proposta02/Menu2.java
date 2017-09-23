/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proposta02;
import javax.swing.JOptionPane;
/**
 *
 * @author lucas
 */
public class Menu2{
    public static void p2(){ 
    int op = 1;
    String x;
        while(op != 0){
            x = JOptionPane.showInputDialog(null,"Menu PROPOSTA02: "
            + "\n 1- Exercício 01" 
            + "\n 2- Exercício 02"
            + "\n 3- Exercício 03"
            + "\n 4- Exercício 04"
            + "\n 5- Exercício 05"
            + "\n 0- Voltar"
            );
            op = Integer.parseInt(x);
            
       switch(op){    
            case 1:
                Ex01.x();
            break;
    
            case 2:
                Ex02.x();
            break;
    
            case 3:
                Ex03.x();
            break;
            
            case 4:
                Ex04.x();
            break;
            
            case 5:
                Ex05.x();
            break;
            
            case 0:
            break;
            
            default:

        }
}
}
}