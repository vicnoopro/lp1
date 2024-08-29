/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Juliana
 */
public class TesteFuncionario {

    public static void main(String[] args) {

        //deu erro pois a classe funcionario é abstrata
        //Funcionario objfunc = new Funcionario(0); 
        //Funcionario objfunc2 = new Funcionario(0); 
        
        //objfunc.setFuncionario("Alan");
        //objfunc2.setFuncionario("Aldo");
        
        //objfunc.setSalario(100);
        //objfunc.bonifica(50);
        
        //objfunc2.setSalario(1350);//metodo "mostra" da classe funcionário
        //objfunc2.bonifica(10);
        
        //objfunc.demite();
        //objfunc.mostra();
        
        //objfunc2.mostra();
        ControledeBonificacoes controle = new ControledeBonificacoes();

        Gerente g1 = new Gerente(2000);
        Supervisor s1 = new Supervisor(1750);
        Secretaria Sa1 = new Secretaria(1000);

        //aqui está pegando o método de controle de bonificacoes e usando o polimorfismo
        //onde g1 está valendo como f1 do tipo funcionario( filho por herança)
        controle.registra(g1);
        controle.registra(s1);
        controle.registra(Sa1);

        /*  System.out.println("Nome: "+objfunc.getFuncionario());
        System.out.println("Salário atual = R$"+objfunc.getSalario());
        
        System.out.println("Nome: "+objfunc2.getFuncionario());
        System.out.println("Salário atual = R$"+objfunc2.getSalario());*/
    }

}
