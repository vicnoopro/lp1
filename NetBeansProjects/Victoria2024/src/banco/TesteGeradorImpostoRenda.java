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
public class TesteGeradorImpostoRenda {

    public static void main(String[] args) {
        GerenciadordeImpostodeRenda gerenciadorIR = new GerenciadordeImpostodeRenda();
        SegurodeVida seguro = new SegurodeVida();
        gerenciadorIR.adiciona(seguro);
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        gerenciadorIR.adiciona(cc);
        System.out.println(gerenciadorIR.getTotal());
        
        System.out.println("O saldo é %.2f "+cc.getSaldo());
    }
}
