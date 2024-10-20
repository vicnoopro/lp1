/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;
//estudo de heranças

/**
 *
 * @author 13826640608
 */
public class Gerente extends Funcionario {

    public Gerente(double salario) {
        super(salario);
    }

    private int senha, nfuncCad;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNfuncCad() {
        return nfuncCad;
    }

    public void setNfuncCad(int nfuncCad) {
        this.nfuncCad = nfuncCad;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }

    }

    @Override
    public double bonificacao() {
        return super.bonificacao() * 0.30;

    }

    @Override
    public double getBonificacao() {
        return super.getSalario() + 1100;
    }

}
