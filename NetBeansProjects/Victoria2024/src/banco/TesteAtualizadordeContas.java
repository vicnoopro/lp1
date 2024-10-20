/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 13826640608
 */
public class TesteAtualizadordeContas {
    public static void main(String[] args) {
         
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        AtualizadorDeContas att = new AtualizadorDeContas(0.1);
        
        att.roda(c);
        att.roda(cc);
        att.roda(cp);
        System.out.println("Saldo total: "+att.getSaldoTotal());
    }
    
}
