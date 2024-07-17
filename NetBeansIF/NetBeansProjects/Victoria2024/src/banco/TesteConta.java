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

       
        Conta c = new Conta();//cria um objeto
        c.deposita(1000);
        c.atualiza(0.1);
        System.out.println("Saldo da conta " + c.getSaldo());
        
        ContaCorrente cc = new ContaCorrente();
   
        cc.deposita(1000);
        cc.atualiza(0.1);
        System.out.println("Conta Corrente: " + cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca();
      
        cp.deposita(1000);
        cp.atualiza(0.1);
        System.out.println("Conta Poupança: " + cp.getSaldo());

        
    }

}
