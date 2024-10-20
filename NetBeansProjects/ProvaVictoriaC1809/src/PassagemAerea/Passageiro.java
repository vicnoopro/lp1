/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassagemAerea;

/**
 *
 * @author 13826640608
 */
public class Passageiro implements Checkin {

    private int idPassageiro, idade;
    private String nome, email, telefone, nacionalidade;
    private boolean checkin;

    public Passageiro(int idPassageiro, String nome, String nacionalidade) {
        this.idPassageiro = idPassageiro;

        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.checkin = false;
    }

    public int getIdPassageiro() {
        return idPassageiro;
    }

    public void setIdPassageiro(int idPassageiro) {
        this.idPassageiro = idPassageiro;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public void FazerCheckin() {
        this.checkin = true;
    }

}
