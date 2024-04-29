/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aniversario;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class TesteAniversario {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
               
        
        System.out.println("Insira a sua idade atual: ");
        int idade = entrada.nextInt();
        
        FazAniversario pessoa = new FazAniversario(idade);
        pessoa.FazAniversario(1);
    }
    
}
