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
         String nomeA = entrada.next();
         System.out.println("Insira o CPF: ");
         String cpfA = entrada.next();
         System.out.println("Idade: ");
         int idadeA = entrada.nextInt();
         System.out.println("Insira o número de matrícula:");
         String nMatricula = entrada.next();
        
         
         System.out.println("Insira o nome do professor: ");
         String nomeP = entrada.next();
         System.out.println("Insira o CPF: ");
         String cpfP = entrada.next();
         System.out.println("Idade: ");
         int idadeP = entrada.nextInt();
         System.out.println("Insira a matér ia lecionada: ");
         String materiaLecionada = entrada.next();
         
         
         
         
         Alunos objAluno = new Alunos(nomeA, cpfA, idadeA, nMatricula);
         objAluno.mostra();
         
         Professor objProfessor = new Professor(nomeP, cpfP, idadeP, materiaLecionada);
         objProfessor.mostra();
         
       
         
         
    }
   
    
    
    
    
}
