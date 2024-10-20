/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviagemm;

/**
 *
 * @author 13826640608
 */
public class Cliente {
    
    private String nome, cpf, metodopag;
    private double nacomp;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMetodopag() {
        return metodopag;
    }

    public void setMetodopag(String metodopag) {
        this.metodopag = metodopag;
    }

    public Double getNacomp() {
        return nacomp;
    }

    public void setNacomp(double nacomp) {
        this.nacomp = nacomp;
    }
    
    
}
