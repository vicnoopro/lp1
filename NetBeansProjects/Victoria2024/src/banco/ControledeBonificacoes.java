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
public class ControledeBonificacoes {

    //exemplo de polimorfismo, Funcionario f1 pode valer como qualquer objeto que eu instanciar em testeFuncionario
    //exemplos atuais que posso substituit Funcionario f1 na classe de teste: gerente, supervisor ou secretaria
    public void registra(Funcionario f1) {
        this.totalDeBonificacoes += f1.bonificacao();

    }
    private double totalDeBonificacoes = 0;

    public double TotalDeBonificacoes() {

        System.out.println("Total de bonificações: " + this.totalDeBonificacoes);
        return this.totalDeBonificacoes;
    }
}
