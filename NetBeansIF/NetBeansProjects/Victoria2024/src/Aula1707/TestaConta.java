/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula1707;

/**
 *
 * @author 13826640608
 */
public class TestaConta {
    
    public static void main(String[] args) {
        
   ContaCorrente cc= new ContaCorrente();
   ContaPoupanca cp = new ContaPoupanca();
   
   cc.deposita(1000);
   cc.atualiza(0.1);
   System.out.println("Saldo da conta " + cc.getSaldo());
   
   cp.deposita(780);
   cp.atualiza(0.2);
   System.out.println("Saldo da conta " + cp.getSaldo());
   
    }
    
  
   
  
  
        
        
}
