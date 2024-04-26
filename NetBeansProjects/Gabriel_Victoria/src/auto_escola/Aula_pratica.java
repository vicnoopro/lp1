/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto_escola;

/**
 *
 * @author 16189074685
 */
public class Aula_pratica {
    private String modelo_carro, aulas_feitas;
    private int aulasP_feitas;
    private double valor_aula, taxa_aprov;

    
    
    public double getTaxa_aprov() {
        return taxa_aprov;
    }

    public void setTaxa_aprov(double taxa_aprov) {
        this.taxa_aprov = taxa_aprov;
    }

    public String getModelo_carro() {
        return modelo_carro;
    }

    public void setModelo_carro(String modelo_carro) {
        this.modelo_carro = modelo_carro;
    }

    public String getAulas_feitas() {
        return aulas_feitas;
    }

    public void setAulas_feitas(String aulas_feitas) {
        this.aulas_feitas = aulas_feitas;
    }

    public int getAulasP_feitas() {
        return aulasP_feitas;
    }

    public void setAulasP_feitas(int aulasP_feitas) {
        this.aulasP_feitas = aulasP_feitas;
    }

    public double getValor_aula() {
        return valor_aula;
    }

    public void setValor_aula(double valor_aula) {
        this.valor_aula = valor_aula;
    }
    
    
}
