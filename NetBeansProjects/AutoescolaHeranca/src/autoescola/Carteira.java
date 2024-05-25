/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoescola;

/**
 *
 * @author victo
 */
public class Carteira {
    
    private String tipo_carteira;
    private double valor_carteira, valor_taxa=10;
    
    private boolean aprovado;

    public String getTipo_carteira() {
        return tipo_carteira;
    }

    public void setTipo_carteira(String tipo_carteira) {
        this.tipo_carteira = tipo_carteira;
    }

    public double getValor_carteira() {
        return valor_carteira;
    }

    public void setValor_carteira(double valor_carteira) {
        this.valor_carteira = valor_carteira;
    }

    public double getValor_taxa() {
        return valor_taxa;
    }

    public void setValor_taxa(double valor_taxa) {
        this.valor_taxa = valor_taxa;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    
    
}
