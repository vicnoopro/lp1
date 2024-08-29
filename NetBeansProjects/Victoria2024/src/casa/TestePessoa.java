/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author Juliana
 */
public class TestePessoa {
    public static void main(String[] args) {
      
        Pessoa pessoa = new Pessoa();
        
    pessoa.setNome("Lucas");
    pessoa.setIdade(15);
    pessoa.fazAniversario(1);
    
    
        System.out.println(pessoa.getNome()+" fez aniversário. Agora possui: "+pessoa.getIdade()+" anos.");
    
    }
    
    
}
