/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layouts;

import javax.swing.JButton;

/**
 *
 * @author lucas
 */
public class NullLayout extends Jframe{
private JButton b1, b2, b3;
NullLayout(String nome)
{super(nome);
setLayout(null);
b1 = new Jbutton("Maça");
b2 = new Jbutton("Pera");
b3 = new Jbutton("Uva");
// parametros: x, y, largura e altura
b1.setBounds(10,10,150,40);
b2.setBounds(10,60,150,40);
b3.setBounds(10,110,150,40);
add(b1);add(b2);add(b3);
SetSize(180, 200);
setVisible(true);}

    private void setLayout(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
