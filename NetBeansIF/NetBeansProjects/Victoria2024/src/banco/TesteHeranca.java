/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author 13826640608
 */
public class TesteHeranca {

    public static void main(String[] args) {

        Funcionario objFuncionario = new Funcionario(1000);
        Gerente objGerente = new Gerente(1000);
        Supervisor objSupervisor = new Supervisor(1000);

        objFuncionario.setFuncionario("Maria");
        objGerente.setFuncionario("Pedro");
        objSupervisor.setFuncionario("Carlos");

        //objGerente.setSalario(1000);
        objGerente.bonificacao();
        objGerente.setDepartamento("Gerência");
        objGerente.setSenha(123);

        //objFuncionario.setSalario(1000);
        objFuncionario.bonificacao();

        //objSupervisor.setSalario(1000);
        objSupervisor.bonificacao();

        //método mostra está na classe funcionário
        //método autentica está na classe 
        objGerente.autentica(145);
        objGerente.mostra();
        objSupervisor.mostra();
        objFuncionario.mostra();

    }
}
