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
public class Reserva {
    
    private int idReserva;
    private String assento,refeicao;
    private double precoTotatl;
    
    Passageiro passageiro;
    Voo voo;

    public Reserva(int idReserva, String assento) {
        this.idReserva = idReserva;
        this.assento = assento;
        
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public String getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(String refeicao) {
        this.refeicao = refeicao;
    }

    public double getPrecoTotatl() {
        return precoTotatl;
    }

    public void setPrecoTotatl(double precoTotatl) {
        this.precoTotatl = precoTotatl;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    
    
    
    public double CalcularPrecoTotal ()
    {
        this.precoTotatl=voo.getPrecoBase();
        return this.precoTotatl;
    }
   
    
}
