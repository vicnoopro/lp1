/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

import java.util.Scanner;

/**
 *
 * @author 13826640608
 */
public class TesteMetodo3 {
    
    public static void main(String[] args) {
        
        Metodos x = new Metodos();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite n1: ");
        double n1 = entrada.nextInt();
        
        System.out.println("Digite n2: ");
        double n2 = entrada.nextInt();
        
        System.out.println("Resutado = "+x.soma3(315, 404));
    }
    
}
