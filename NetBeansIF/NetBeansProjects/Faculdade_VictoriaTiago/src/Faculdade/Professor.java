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
public class Professor extends Pessoa {

    public Professor(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
    }

    private String MateriaLecionada;

    public Professor(String MateriaLecionada, String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.MateriaLecionada = MateriaLecionada;
    }

    public String getMateriaLecionada() {
        return MateriaLecionada;
    }

    public void setMateriaLecionada(String materiaLecionada) {
        this.MateriaLecionada = materiaLecionada;
    }

    @Override
    public void mostra() {

        System.out.println("______________________________________________________");
        System.out.println("Nome do professor: " + super.getNome() + " CPF: " + super.getCpf());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Matéria lecionada: " + this.getMateriaLecionada());

    }

}
