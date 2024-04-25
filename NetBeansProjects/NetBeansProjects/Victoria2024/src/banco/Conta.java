/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 13826640608
 */
public class Conta 
{
    
    private int numero;
    private String cliente;
    private double saldo, limite;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    
    
    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }

    public String getCliente() 
    {
        return cliente ;
    }

    public void setCliente(String cliente) 
    {
        this.cliente = cliente = cliente.toUpperCase();
    }

    public double getSaldo()
    {
        return saldo + limite;
    }

     
    public double getLimite() 
    {
        return limite;
    }

    public void setLimite(double limite) 
    {
        this.limite = limite;
    }

   
    
     
    public boolean saca (double quantidade)//dentro do () insere o valor no código
    { 
        if ( this.getSaldo() >= quantidade)
        {
        this.saldo = this.saldo - quantidade;//subtrai do saldo o saque
        return true;
        }
        
        else 
        {
        System.out.println("Saldo insuficiente: "+this.getSaldo());
        return false;
        }
    }
    
    
    public void deposita (double quantidade){//dentro do () insere o valor no código
        this.saldo = this.saldo + quantidade;//soma o saldo com o depósito
    }
    
    public void transfere (Conta destino, double quantidade)
    { 
        if (this.saca (quantidade))
        {
            destino.deposita(quantidade);
            System.out.println("Transfência realizada com sucesso");
        }
        
        else
        {
            System.out.println("Transferência não realizada");
        }
         
    }
       
    
    public void atualiza (double taxa){
        
        this.saldo += this.saldo*taxa;
       
}
}
