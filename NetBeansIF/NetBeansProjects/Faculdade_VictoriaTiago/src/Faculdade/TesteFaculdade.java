/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faculdade;

import java.util.Scanner;

/**
 *
 * @author 13826640608
 */
public class TesteFaculdade {
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);
      
        
         
         System.out.println("Insira o nome do aluno: ");
         String nome = entrada.next();
         System.out.println("Insira o CPF: ");
         String cpf = entrada.next();
         System.out.println("Insira o número de matrícula:");
         String nMatricula = entrada.next();
         
         System.out.println("Idade: ");
         int idade = entrada.nextInt();
         
         Alunos objAluno = new Alunos(nome, cpf, idade, nMatricula);
         objAluno.mostra();
       
         
         
    }
   
    
    
    
    
}
