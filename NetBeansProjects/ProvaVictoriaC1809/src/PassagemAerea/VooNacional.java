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
public class VooNacional extends Voo {
    
    private double taxaEmbarque;

    public VooNacional(int idVoo, int duracao,int embarcados, String origem, String destino, String data, String hora) {
        super(idVoo, duracao, embarcados, origem, destino, data, hora);
    }

    public double getTaxaEmbarque() {
        return taxaEmbarque;
    }

    public void setTaxaEmbarque(double taxaEmbarque) {
        this.taxaEmbarque = taxaEmbarque;
    }

    @Override
    public void calcularValor() {
        super.precoBase = super.precoBase+this.taxaEmbarque;
        System.out.println("O total do voo é R$"+super.precoBase);
    }

    @Override
    public void desconto() {
        super.precoBase = super.precoBase - (super.precoBase * 0.10);
        System.out.println("A passagem com desconto é R$"+super.getPrecoBase());
        
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
