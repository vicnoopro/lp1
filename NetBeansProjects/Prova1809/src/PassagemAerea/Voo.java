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
public abstract class Voo {
    
    private int idVoo, duracao, embarcados;
    private String origem, destino, data, hora;
    double precoBase;
    private boolean disponibilidade;

    public Voo(int idVoo, int duracao, int embarcados, String origem, String destino, String data, String hora) {
        this.idVoo = idVoo;
        this.duracao = duracao;
        this.embarcados = embarcados;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.hora = hora;
        this.disponibilidade= false;
    }

    Aviao aviao;
    VooInternacional vi;
    VooNacional vn;
    
    public int getIdVoo() {
        return idVoo;
    }

    public void setIdVoo(int idVoo) {
        this.idVoo = idVoo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public int getEmbarcados() {
        return embarcados;
    }

    public void setEmbarcados(int embarcados) {
        this.embarcados = embarcados;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    
    public abstract void calcularValor();
    public abstract void desconto();        
    abstract void Disponibilidade();
       
}
