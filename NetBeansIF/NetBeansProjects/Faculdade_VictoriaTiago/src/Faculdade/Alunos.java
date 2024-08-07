/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faculdade;

/**
 *
 * @author 13826640608
 */
public class Alunos extends Pessoa {

    public Alunos(String nome, String cpf, int idade, String nMatricula) {
        super(nome, cpf, idade);
    }

    private String nMatricula;

    public String getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(String nMatricula) {
        this.nMatricula = nMatricula;
    }
    
    
    @Override
    public void mostra() {
        
        System.out.println("Nome do aluno: "+super.getNome()+" CPF: "+super.getCpf());
        System.out.println("Idade: "+super.getIdade());
        
    }
    
}
