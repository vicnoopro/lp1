/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author victo
 */
public class Atlconta {
    
    private double saldototal=0;
    private double selic;

    public Atlconta(double selic) {
        this.selic = selic;
    }
    
    
    
    public void roda(Conta c){
        System.out.println("Saldo anterior: "+c.getSaldo());
        c.atualiza(selic);
        System.out.println("Saldo final: "+c.getSaldo());
                
       this.saldototal += c.getSaldo();
       
        System.out.println("Saldo total: "+this.saldototal);
        System.out.println("                              ");
        
    }

    public double getSaldototal() {
        return saldototal;
    }
    
    
    
}
