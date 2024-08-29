/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

import java.util.Scanner;

/**
 *
 * @author 13826640608
 */
public class TestePorta {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Porta objPorta = new Porta();
        Porta objPorta2 = new Porta();
        
        objPorta.setDimensaox(75);
        objPorta.setDimensaoy(200);
        objPorta.setDimensaoz(8);
        
        objPorta2.setDimensaox(80);
        objPorta2.setDimensaoy(220);
        objPorta2.setDimensaoz(9);
        
        objPorta.abre();
        objPorta2.fecha();
        
        System.out.println("Digite a cor da porta 1: ");
        String cor = entrada.nextLine();
        objPorta.pinta(cor);
        
        System.out.println("Digite a cor da porta 2: ");
       String cor2 = entrada.nextLine();
        objPorta2.pinta(cor2);
        
        System.out.println("Porta 1: ");
        System.out.println("Dimensões: "+objPorta.getDimensaox()+"x"+objPorta.getDimensaoy()+"x"+objPorta.getDimensaoz());
        System.out.println("Cor: "+objPorta.getCor());
        System.out.println("Porta aberta? "+(objPorta.estabaerta()==true?"Sim":"Não"));
        
        System.out.println("Porta 2: ");
        System.out.println("Dimensões: "+objPorta2.getDimensaox()+"cm x "+objPorta2.getDimensaoy()+"cm x "+objPorta2.getDimensaoz()+"cm");
        System.out.println("Cor: "+objPorta2.getCor());
        System.out.println("Porta aberta? "+(objPorta2.estabaerta()==true?"Sim":"Não"));
        
    }
}
