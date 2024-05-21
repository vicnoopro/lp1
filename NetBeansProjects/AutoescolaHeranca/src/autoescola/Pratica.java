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
public class Pratica extends Aula {

    private String modelo_carro;
    private int aulasP_feitas;
    private double taxa_aprov;

    public String getModelo_carro() {
        return modelo_carro;
    }

    public void setModelo_carro(String modelo_carro) {
        this.modelo_carro = modelo_carro;
    }

    public int getAulasP_feitas() {
        return aulasP_feitas;
    }

    public void setAulasP_feitas(int aulasP_feitas) {
        this.aulasP_feitas = aulasP_feitas;
    }

    public double getTaxa_aprov() {
        return taxa_aprov;
    }

    public void setTaxa_aprov(double taxa_aprov) {
        this.taxa_aprov = taxa_aprov;
    }
   
}
