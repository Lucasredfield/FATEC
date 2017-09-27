/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import javax.swing.JOptionPane;
import proposta01.Menu1;
import proposta02.Menu2;


public class MenuPrincipal {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
    int op = 1;
    String x;
        while(op != 0){
            x = JOptionPane.showInputDialog(null,"Menu PRINCIPAL: "
            + "\n 1- Proposta 01" 
            + "\n 2- Proposta 02"
            + "\n 0- Sair"
            );
            op = Integer.parseInt(x);
            
        switch(op){    
            case 1:
                Menu1.p1();
            break;
    
            case 2:
                Menu2.p2();
            break;
          
            default:
    }
}
}
}
