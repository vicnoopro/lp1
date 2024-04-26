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
public class VerificacaoNumeros {
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escolha um número: ");
        int num1 = entrada.nextInt();
        System.out.println("Escolha um número: ");
        int num2 = entrada.nextInt();
        System.out.println("Escolha um número: ");
        int num3 = entrada.nextInt();
        
        if ((num1 > num2 )&&(num1 > num3))
        { 
            System.out.println("O número "+num1+" é o maior.");
        }
        else if ((num2 > num3 )&&(num2 > num1))
        {
            System.out.println("O número "+num2+" é o maior.");
        }
        else
        {
            System.out.println("O número "+num3+" é o maior.");
        }
        
        if (num1 > 0)
        {
            System.out.println("O primeiro é positivo");
        }
        else if (num1 == 0)
        { 
            System.out.println("O primeiro é igual a 0.");
        }
        else
        {
            System.out.println("O primeiro é negativo");
        }
        
        if (num2 > 0)
        {
            System.out.println("O segundo é positivo");
        }
        else if (num2 == 0)
        { 
            System.out.println("O segundo é igual a 0.");
        }
        else
        {
            System.out.println("O segundo é negativo");
        }
        
        if (num3 > 0)
        {
            System.out.println("O terceiro é positivo");
        }
        else if (num3 == 0)
        { 
            System.out.println("O terceiro é igual a 0.");
        }
        else
        {
            System.out.println("O terceiro é negativo");
        }
        
    }
    
}
