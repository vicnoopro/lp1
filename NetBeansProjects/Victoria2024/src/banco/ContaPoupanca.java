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
public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }
    
    @Override
    public void atualiza (double taxa){
        
            super.deposita(super.getSaldo()*(taxa*3)); 
}
    
    
}
