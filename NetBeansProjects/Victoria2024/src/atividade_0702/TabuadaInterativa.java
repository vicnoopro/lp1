/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_0702;

import java.util.Scanner;

/**
 *
 * @author Juliana
 */
public class TabuadaInterativa {
    public static void main(String[] args) 
            
    {
        int cont=1; 
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();
        
        while (cont <= 10)
        {
            int multi=1;
            multi= num*cont;
            System.out.println(num+" * "+cont+" = "+multi);
            cont=cont+1;
            
        }
        
    }
    
}
