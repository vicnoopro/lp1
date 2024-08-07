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

    public Alunos(String nMatricula, Avaliacao objAvaliacao, String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.nMatricula = nMatricula;
        this.objAvaliacao = objAvaliacao;
    }

    private String nMatricula;

    Avaliacao objAvaliacao;

    public String getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(String nMatricula) {
        this.nMatricula = nMatricula;
    }

    @Override
    public void mostra() {

        System.out.println("______________________________________________________");
        System.out.println("Nome do aluno: " + super.getNome() + " CPF: " + super.getCpf());
        System.out.println("Número de matrícula: " + this.getnMatricula());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Nota 1 do aluno: " + objAvaliacao.getNota1());
        System.out.println("Nota 2 do aluno: " + objAvaliacao.getNota2());
        System.out.println("Nota 3 do aluno: " + objAvaliacao.getNota3());
        System.out.println("Nota 4 do aluno: " + objAvaliacao.getNota4());
        System.out.println("Média de notas: " + objAvaliacao.getMediaNotas());

        if (objAvaliacao.getMediaNotas() >= 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

    }

}
