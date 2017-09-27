/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proposta02;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ex01 {
    public static void x(){
        int[] num = new int[10]; // Vetor para armazenar 10 números
        float soma = 0; // Variável auxiliar
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 10 numeros Inteiros: ");
        for(int i = 0; i < 10; i++){
            num[i] = teclado.nextInt();      
        }//for
            for(int i2 = 0; i2 < 10; i2++){ // Calcular a media do vetor
            soma = soma + num[i2];
        }//for
        float media = soma/10;        
        System.out.println(media);
    }//void
}//clas