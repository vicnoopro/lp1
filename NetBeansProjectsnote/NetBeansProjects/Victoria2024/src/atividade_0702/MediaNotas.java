/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_0702;

import java.util.Scanner;

/**
 *
 * @author 13826640608
 */
public class MediaNotas {
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner (System.in);
    
       System.out.print("Digite o número de alunos: ");
       int alunos = entrada.nextInt();
       
      double notas[] = new double[alunos];
      double soma = 0;
      
       for (int i = 0; i < alunos; i++) 
       {
       System.out.printf("Digite a nota do aluno %d: ", i+1);
       notas[i] = entrada.nextDouble();
       soma=soma+notas[i];
       }
      
       double media = soma / alunos;
       System.out.printf("A média das notas é: %.1f\n ", media);
    }
}

    
    
