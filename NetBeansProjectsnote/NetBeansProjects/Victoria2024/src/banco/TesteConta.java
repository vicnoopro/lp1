/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author 13826640608
 */
public class TesteConta {
    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        Conta c2 = new Conta();//cria um objeto
        
        c1.deposita(3000.50);
        c2.deposita(1000000);
        c1.setCliente("Pedro");
        
        c1.saca(5000);
        c2.saca(100);
        
        System.out.println("Saldo da conta c1 = "+c1.saldo);
        System.out.println("Saldo da conta c2 = "+c2.saldo);
        System.out.println("Cliente c1 : "+c1.getCliente());
        
       
         
        
        
    }
    
}
