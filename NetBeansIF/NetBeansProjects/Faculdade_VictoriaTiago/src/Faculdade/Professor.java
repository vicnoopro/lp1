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
public class Professor extends Pessoa {// classe filha de pessoa

    public Professor(String nome, String cpf, int idade) {//para a criação de um objeto aluno, esses parâmetros deverão ser passados
        super(nome, cpf, idade);// vieram da classe pessoa
        this.MateriaLecionada = MateriaLecionada;
    }

    private String MateriaLecionada;

    public String getMateriaLecionada() {
        return MateriaLecionada;
    }

    public void setMateriaLecionada(String materiaLecionada) {
        this.MateriaLecionada = materiaLecionada;
    }

    @Override
    public void mostra() {// método para mostrar dados referente ao professor

        System.out.println("______________________________________________________");
        System.out.println("Nome do professor: " + super.getNome() + " CPF: " + super.getCpf());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Matéria lecionada: " + this.getMateriaLecionada());

    }

}
