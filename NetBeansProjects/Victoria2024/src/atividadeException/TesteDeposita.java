/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeException;

/**
 *
 * @author 13826640608
 */
public class TesteDeposita {

    public static void main(String[] args) {

        Conta cp = new ContaPoupanca();

        try {
            cp.deposita(-100);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());//aqui ele pega a mensagem que eu deixei no método dentro de ContaPoupanca
        }

        Conta cc = new ContaCorrente();
        try {
            cc.deposita(-100);
        } catch (IllegalArgumentException e) {
            System.out.println(" Você tentou depositar um valor inválido");
        }
        
    }

}
