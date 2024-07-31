/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoescola;

import java.util.Scanner;

/**
 *
 * @author 13826640608
 */
public class Registra {
    
    Scanner entrada = new Scanner(System.in);
    
    Autoescola autoescola = new Autoescola();
    Carteira carteira = new Carteira();
    
    public void Registra (Pessoa p1){
        
        System.out.println("Nome da Auto Escola: ");
        String nome_AutoEscola = entrada.next();
        autoescola.setNome(nome_AutoEscola);
       
        
        System.out.println("Cidade situada: ");
        String cidade = entrada.next();
        autoescola.setCidade(cidade);
        
        System.out.println("Endereço: ");
        String endereco = entrada.next();
        autoescola.setEndereco(endereco);
        
        System.out.println("Nome:  ");
        String nomeCliente = entrada.next();
        p1.setCpf(nomeCliente);
        
        System.out.println("CPF: ");
        String cpfCliente = entrada.next();
        p1.setCpf(cpfCliente);
        
        System.out.println("Carteira desejada: ");
        String tipoCarteira = entrada.next();
        carteira.setTipo_carteira(tipoCarteira);
        
        System.out.println("Modelo do carro usado: ");
        String Modelo = entrada.next();
       
    }
    
    public void AulaTeorica(Teorica t1)
    {
         
        System.out.println("Insira a nota da prova teorica 1: ");
        double nota1 = entrada.nextDouble();
        t1.setNota1(nota1);
        
        System.out.println("Insira a nota da prova teorica 2: ");
        double nota2 = entrada.nextDouble();
        t1.setNota2(nota2);
        
        System.out.println("Insira a nota da prova teorica 3: ");
        double nota3 = entrada.nextDouble();
        t1.setNota3(nota3);
    }
    
    public void AulaPratica (Pratica p1)
    {
        System.out.println("Aulas feitas: ");
        int aulasFeitas = entrada.nextInt();
      p1.setAulasP_feitas(aulasFeitas);
        
        System.out.println("Valor por aula: ");
        double valor_aulaP = entrada.nextDouble();
       p1.setValor_aula(valor_aulaP);
        
        System.out.println("Taxa de aprovação nas provas práticas: ");
        double taxa_aprov = entrada.nextDouble();
        p1.setTaxa_aprov(taxa_aprov);
     
       
    }
            
}
