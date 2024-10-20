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
public class Secretaria extends Funcionario {

    public Secretaria(double salario) {
        super(salario);
    }

    @Override
    public double getBonificacao() {

        return super.getSalario();
    }

}
