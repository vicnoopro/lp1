/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco2;

/**
 *
 * @author victo
 */
public interface Conta {

    double getSaldo();

    void deposita(double valor);

    void retira(double valor);

    void atualiza(double taxaSelic);
}
