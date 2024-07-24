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
public class Conta {

    private int numero;
    private String cliente;
    double saldo;
    private double limite;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean saca(double quantidade)//dentro do () insere o valor a ser sacado no código
    {
        if (this.getSaldo() >= quantidade) {
            this.saldo = this.saldo - quantidade;//subtrai do saldo o saque
            return true;
        } else {
            System.out.println("Saldo insuficiente: " + this.getSaldo());
            return false;
        }
    }

    public void transfere(banco.Conta destino, double quantidade) {
        if (this.saca(quantidade)) {
            destino.deposita(quantidade);
            System.out.println("Transfência realizada com sucesso");
        } else {
            System.out.println("Transferência não realizada");
        }

    }

    void deposita(double valor) {
    if (valor <0){
    throw new ValorInvalidoExcecao(valor);
    }
    else {
    this.saldo += valor - 0.10;
    }
    }

    void atualiza(double taxa) {
        this.saldo = this.getSaldo() * taxa;
    }
}
