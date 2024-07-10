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
public class ContaCorrente extends Conta {

    public ContaCorrente() {
    }

    @Override
    void atualiza(double taxa) {
        super.deposita(super.getSaldo() * (taxa * 2));
    }

    @Override
    public void deposita(double quantidade) {//dentro do () insere o valor no código
        super.deposita(super.getSaldo() + (quantidade));//soma o saldo com o depósito
       // System.out.println("Saldo conta corrente: " + super.getSaldo());
    }

}
