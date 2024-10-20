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
public class TesteMetodos 
{ 
    public static void main(String[] args) 
    {
        Metodos x = new Metodos(); //instanciando uma classe - criando um objeto 
        x.n1=10;
        x.n2=30;
        x.soma();
        System.out.println("Resultado da soma: "+x.resultado);
        
       
        Metodos y = new Metodos(); //instanciando uma classe - criando um objeto 
        y.n1=13;
        y.n2=115.50;
        y.soma();
        System.out.println("Resultado da soma: "+y.resultado);
        
        System.out.println(x); //enderço do objeto
        System.out.println(y); // endereço do objeto
    }
    
}
