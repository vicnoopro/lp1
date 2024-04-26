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
public class AgenteViagens {
    
    private String nomeAgencia;

    public String getNomeAgencia() {
        return nomeAgencia.toUpperCase();
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }
    public void MostraServiços()
    {
         System.out.println("___________________________________________________________");
         System.out.println("Pacotes de viagem disponibilizados pela VOA TURISMO");
        System.out.println("Pacote 1: 5 diárias para o exterior com direito à 1 acomapanhante.");
        System.out.println("Valor: R$7.824");
        System.out.println("");
        
        System.out.println("Pacote 2: 10 diárias para o litoral brasileiro com direito à 2 acomapanhantes.");
        System.out.println("Valor: R$5.689");
        System.out.println("");
        
        System.out.println("Pacote 3: 7 diárias para o EuroTour, com direito à 1 acompanhante.");
        System.out.println("Valor: R$10.658");
        System.out.println("");
    }
    
}
