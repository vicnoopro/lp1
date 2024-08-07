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

    public Professor(String nome, String cpf, int idade, String materiaLecionada) {
        super(nome, cpf, idade);
    }

    private String materiaLecionada;

    public String getMateriaLecionada() {
        return materiaLecionada;
    }

    public void setMateriaLecionada(String materiaLecionada) {
        this.materiaLecionada = materiaLecionada;
    }

    @Override
    public void mostra() {

        System.out.println("Nome do professor: " + super.getNome() + " CPF: " + super.getCpf());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Matéria lecionada:" + this.getMateriaLecionada());

    }

}
