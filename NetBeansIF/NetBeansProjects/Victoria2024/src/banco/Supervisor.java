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
public class Supervisor extends Funcionario {

    public Supervisor(double salario) {
        super(salario);
    }

    

     @Override
     public double bonificacao()
    {
        return super.bonificacao()*0.15;
    }
    
}
