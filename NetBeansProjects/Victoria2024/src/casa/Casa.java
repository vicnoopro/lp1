/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author 13826640608
 */
public class Casa {
    
    private String cor;
    Porta porta1, porta2, porta3;
    
    public void pinta(String cor){
        
        this.cor = cor;
    }
    
    public int qntportaaberta(){
        
        int cont=0;
        if(porta1.estabaerta()==true){
            cont++;
        }
        
        if(porta2.estabaerta()==true){
            cont++;
        }
        
        if(porta3.estabaerta()==true){
            cont++;
        }
        return cont;
    }
    
}
