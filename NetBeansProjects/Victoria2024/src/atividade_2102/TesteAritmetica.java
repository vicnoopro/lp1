/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_2102;

import java.util.Scanner;

/**
 *
 * @author 13826640608
 */
public class TesteAritmetica {
    
    public static void main(String[] args) {
        
        Aritmetica x = new Aritmetica();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite n1: ");
        double n1 = entrada.nextInt();
        
        System.out.println("Digite n2: ");
        double n2 = entrada.nextInt();
        
        System.out.println("Resultado da soma : "+x.soma(n1, n2));
        System.out.println("Resultado da subtração : "+x.subtracao(n1, n2));
        System.out.println("Resultado da divisão : "+x.divisao(n1, n2));
        System.out.println("Resultado da Multiplicação : "+x.multiplicaco(n1, n2));
        System.out.println("Resto da divisão : "+x.resto(n1, n2));
        
    }
    
}
