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
public class VooInternacional extends Voo {

    Aviao aviao;
    private double taxaEmbarque, taxaImigracao;

    public VooInternacional(int idVoo, int duracao, int embarcados, String origem, String destino, String data, String hora) {
        super(idVoo, duracao, embarcados, origem, destino, data, hora);
    }

    public double getTaxaEmbarque() {
        return taxaEmbarque;
    }

    public void setTaxaEmbarque(double taxaEmbarque) {
        this.taxaEmbarque = taxaEmbarque;
    }

    public double getTaxaImigracao() {
        return taxaImigracao;
    }

    public void setTaxaImigracao(double taxaImigracao) {
        this.taxaImigracao = taxaImigracao;
    }

    @Override
    public void calcularValor() {

        super.precoBase = super.precoBase + this.taxaEmbarque + this.taxaImigracao;
        System.out.println("O total do voo é R$" + super.precoBase);

    }

    @Override
    public void desconto() {
        super.precoBase = super.precoBase - (super.precoBase * 0.15);
        System.out.println("A passagem com desconto é R$" + super.getPrecoBase());
    }

    @Override
    void Disponibilidade() {
        if (super.getEmbarcados() < aviao.getCapacidade()) {

            System.out.println("Assentos disponíveis!");
        } else {

            System.out.println("Voo lotado!");
        }

    }
}


