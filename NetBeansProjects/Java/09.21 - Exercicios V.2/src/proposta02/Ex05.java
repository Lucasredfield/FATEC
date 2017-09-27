package proposta02;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ex05 {
   public static void x(){
       
    int[] num = new int[5]; // Declarando Vetor Num e atribuindo o tamanho
 
    for(int i = 0; i < 5; i++){ // Defição dos valores de cada vetor
    num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor"
        +" da posição ["+i+"]")); 
    } // for

    Arrays.sort(num); //Organizar uma quantidade de números fornecidos pelo usuário    
    JOptionPane.showMessageDialog(null,"Números PARES em forma crescente");
    for(int i2 = 0; i2 < 5; i2++){ // Percorrendo vetor
        if(num[i2]% 2 == 0){ // Verificação de PAR            
            JOptionPane.showMessageDialog(null,num[i2]);// Mostrar números pares em ordem crescente
            } //if
        }//for
    
    JOptionPane.showMessageDialog(null,"Números ÍMPARES em forma decrescente");
    for(int i3 = 4; i3 >= 0; i3--){
            if(num[i3]% 2 == 1){            
                JOptionPane.showMessageDialog(null,num[i3]);
                // Mostrar números pares em ordem Decrescente
            } //if
        }//for
   } // void x
} //class