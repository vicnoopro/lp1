/*
 Escreva um programa em Java que recebe a idade de uma pessoa como entrada
e verifica se ela é maior de idade ou não. Caso a idade seja maior ou igual a 18, o programa
deve exibir a mensagem &quot;Maior de Idade&quot;. Caso contrário, o programa deve exibir a
mensagem &quot;Menor de Idade&quot;.
 */
package atividade_0702;

import java.util.Scanner;

/**
 *
 * @author 13826640608
 */
public class VerificacaoIdade {
    
    public static void main(String[] args) 
    {
    Scanner entrada = new Scanner (System.in);
    
        System.out.println("Insira a sua idade: ");
        int idade = entrada.nextInt();
        
        if(idade >= 18)
        {
            System.out.println("Você é maior de idade.");
        }
        
        else
        {
            System.out.println("Você é menor de idade. ");
        }
        
        
    }
    
}
