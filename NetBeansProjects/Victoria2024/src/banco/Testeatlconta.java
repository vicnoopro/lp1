/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author victo
 */
public class Testeatlconta {
    public static void main(String[] args) {
        
        Conta c = new Conta(0);
        ContaCorrente cc = new ContaCorrente(0);
        ContaPoupanca cp = new ContaPoupanca(0);
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        Atlconta att = new Atlconta(0.1);
         att.roda(c);
         att.roda(cc);
         att.roda(cp);
        
         
         
        
    }
    
}
