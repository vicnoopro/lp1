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
public class TestaTributavel {
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        
       
        System.out.println(cc.CalculaTributos());
        Tributavel t = cc; //exemplo de polimorfismo
        
        System.out.println(t.CalculaTributos());
    }
    
}
