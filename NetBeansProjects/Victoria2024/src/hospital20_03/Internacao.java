/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital20_03;

/**
 *
 * @author 13826640608
 */
public class Internacao {
    
    private int identificacao, quantDias;
    private String motivo;
    private double valorDia, valorTotal;
    
    Paciente objPaciente;
    Medico objMedico;
    Enfermeiro objEnfermeiro;

    public Internacao(int identificacao, int quantDias, String motivo, double valorDia, Paciente objPaciente, Medico objMedico, Enfermeiro objEnfermeiro) {
        this.identificacao = identificacao;
        this.quantDias = quantDias;
        this.motivo = motivo;
        this.valorDia = valorDia;
        this.objPaciente = objPaciente;
        this.objMedico = objMedico;
        this.objEnfermeiro = objEnfermeiro;
    }



    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public int getQuantDias() {
        return quantDias;
    }

    public void setQuantDias(int quantDias) {
        this.quantDias = quantDias;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    public double getValorTotal() {
        this.valorTotal= this.valorDia*this.quantDias;
        return valorTotal;
    }
    

    public void VisualizarInternacao()
    {
        System.out.println("Identificador: "+this.getIdentificacao());
        System.out.println("Nome do Paciente: "+objPaciente.getNomePaciente());
        System.out.println("Nome do Médico: "+objMedico.getNomeMedico());
        System.out.println("Nome do Enfermeiro: "+objEnfermeiro.getNomeEnfermeiro());
        System.out.println("Motivo da internação: "+this.getMotivo());
        System.out.println("Valor do dia da internação: R$"+this.getValorDia());
        System.out.println("Quantidade de dias internados: "+this.getQuantDias());
        System.out.println("Valor total da internação: R$"+this.getValorTotal());
        
    }
    
    
    
}
