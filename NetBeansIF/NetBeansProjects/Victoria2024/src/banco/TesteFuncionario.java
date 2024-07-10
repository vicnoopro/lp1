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
        
        
        
        Funcionario objfunc = new Funcionario(0); 
        Funcionario objfunc2 = new Funcionario(0); 
        
        objfunc.setFuncionario("Alan");
        objfunc2.setFuncionario("Aldo");
         
        //objfunc.setSalario(100);
        objfunc.bonifica(50);
        
        //objfunc2.setSalario(1350);//metodo "mostra" da classe funcionário
        objfunc2.bonifica(10);
      
        objfunc.demite();
        objfunc.mostra();
        objfunc2.mostra();
        
        Gerente g1 = new Gerente(1000);
        Funcionario f1 = g1;
        
        f1.registra(f1);
        f1.TotalDeBonificacoes();
        
      /*  System.out.println("Nome: "+objfunc.getFuncionario());
        System.out.println("Salário atual = R$"+objfunc.getSalario());
        
        System.out.println("Nome: "+objfunc2.getFuncionario());
        System.out.println("Salário atual = R$"+objfunc2.getSalario());*/
    }
    
}
