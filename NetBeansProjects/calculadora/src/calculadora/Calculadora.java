/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class Calculadora {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número qualquer: ");
        int num1 = entrada.nextInt();
        
        System.out.println("Insira outro valor qualquer: ");
        int num2 = entrada.nextInt();
        
        System.out.println("Digite 1 para somar;");
        System.out.println("Digite 2 para subtrair;");
        System.out.println("Digite 3 para multiplicar;");
        System.out.println("Digite 4 para dividir;");
        int escolha = entrada.nextInt();
        
        int resultado;
        
        if(escolha==1){
            resultado = num1 + num2;
            System.out.println("O rdesultado é "+resultado);
        }
        else if(escolha==2){
            resultado = num1 - num2;
             System.out.println("O rdesultado é "+resultado);
        }
        else if (escolha==3){
            resultado = num1 * num2;
             System.out.println("O rdesultado é "+resultado);
        }
        else{
            resultado = num1 / num2;
             System.out.println("O rdesultado é "+resultado);
        }
    }
    
}
