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
public class TesteTransfere {
    
    public static void main(String[] args) {
         
        Conta minhaconta = new Conta(0);
        Conta outraconta = new Conta(0);
        
        minhaconta.deposita(1000);//indica o saldo
        outraconta.deposita(1000);//indica o saldo
        
        minhaconta.transfere(outraconta, 500);//faz a tranferencia
        
        System.out.println("Saldo minhaconta: "+minhaconta.getSaldo());
        System.out.println("Saldo outraaconta: "+outraconta.getSaldo());
        

    }
    
}
