/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

/**
 *
 * @author 13826640608
 */
public class Metodos 
{
    double n1, n2,resultado; //atributos ou variáveis de instancia
    
    public  void soma() //método sem retorno e sem passagem de parametro
    {
        this.resultado = this.n1 + this.n2; //diferencia o método da classe
    }
    
    public double soma2(){ //método com retorno (double) e sem passagem de parametro
        return this.resultado = this.n1 + this.n2;
    }
    
    public double soma3 (double n1, double n2){ //com retorno e com parametro
        
        this.n1 = n1;
        this.n2 = n2;
        return this.resultado = this.n1 + this.n2;
    }
}    
   

