/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aniversario;

/**
 *
 * @author victo
 */
public class FazAniversario {
    
    private int idade, nova;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNova() {
        return nova;
    }

    public void FazAniversario (int anos)
    {
         this.nova = this.getIdade()+anos;
         
         System.out.println("Parabéns! Em "+anos+" anos você terá "+this.nova+"!");
                 
    }
  
    
    
    
}
