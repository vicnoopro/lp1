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
public class Embarcar {
   
    Aviao aviao;
    Passageiro passageiro;
    Reserva reserva;

    public Embarcar(Aviao aviao, Passageiro passageiro, Reserva reserva) {
        this.aviao = aviao;
        this.passageiro = passageiro;
        this.reserva = reserva;
    }
    

    public void Relatorio (Aviao aviao, Passageiro passageiro, Reserva reserva) {
        System.out.println("Nome do passageiro: "+passageiro.getNome()+" ID: "+passageiro.getIdPassageiro()+" Nacionalidade: "+passageiro.getNacionalidade());
        System.out.println(" ");
        System.out.println("_____________________________________________________________________________________________________________________");
        System.out.println("ID do avião: "+aviao.getIdAviao()+" Modelo: "+aviao.getModelo()+" Capacidade: "+aviao.getCapacidade()+" pessoas");
        System.out.println(" ");
        System.out.println("______________________________________________________________________________________________________________");
        System.out.println(" ");
        System.out.println("ID da reserva: "+reserva.getIdReserva()+" Assento: "+reserva.getAssento());
        
        
    }
    
}
