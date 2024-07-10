/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_2102;

/**
 *
 * @author 13826640608
 */
public class Aritmetica {

    private double n1;
    private double n2;
    private double resultado;
    
    public double soma (double n1, double n2){ //com retorno e com parametro
        
        this.n1 = n1;
        this.n2 = n2;
        return this.resultado = this.n1 + this.n2;
    
}
    public double subtracao (double n1, double n2){ //com retorno e com parametro
        
        this.n1 = n1;
        this.n2 = n2;
        return this.resultado = this.n1 - this.n2;
    }
    
    public double divisao (double n1, double n2){ //com retorno e com parametro
        
        this.n1 = n1;
        this.n2 = n2;
        return this.resultado = this.n1 / this.n2;
    }
    
    public double multiplicaco (double n1, double n2){ //com retorno e com parametro
        
        this.n1 = n1;
        this.n2 = n2;
        return this.resultado = this.n1 * this.n2;
    }
    
    public double resto (double n1, double n2){ //com retorno e com parametro
        
        this.n1 = n1;
        this.n2 = n2;
        return this.resultado = this.n1 % this.n2;
    }
}
