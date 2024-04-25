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
public class TestaAtualiza {
    public static void main(String[] args) {
        
        Conta c = new Conta(0);
        ContaCorrente cc = new ContaCorrente(0);
        ContaPoupanca cp = new ContaPoupanca(0);
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        c.atualiza(0.10);
        cc.atualiza(0.10);
        cp.atualiza(0.10);
        
        System.out.println("Saldo da conta: "+c.getSaldo());
        System.out.println("Saldo da conta corrente: "+cc.getSaldo());
        System.out.println("Saldo da conta poupanca: "+cp.getSaldo());
        
    }
    
}
