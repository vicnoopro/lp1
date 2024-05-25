/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoescola;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Autoescola autoescola = new Autoescola();
        Aula aula = new Aula();
        Carteira carteira = new Carteira();
        Pessoa pessoa = new Pessoa();
        
        
         System.out.println("Nome da Auto Escola: ");
        String nome_AutoEscola = entrada.next();
        autoescola.setNome(nome_AutoEscola);
       
        
        System.out.println("Cidade situada: ");
        String cidade = entrada.next();
        autoescola.setCidade(cidade);
        
        System.out.println("Endereço: ");
        String endereco = entrada.next();
        autoescola.setEndereco(endereco);
       
        
        System.out.println("Nome do cliente: ");
        String nomeCliente = entrada.next();
        pessoa.setNome(nomeCliente);
       
        
        System.out.println("CPF do Cliente: ");
        String cpfCliente = entrada.next();
        pessoa.setCpf(cpfCliente);
       
        
        System.out.println("Carteira desejada: ");
        String tipoCarteira = entrada.next();
        carteira.setTipo_carteira(tipoCarteira);
      
        
        System.out.println("Nome do intrutor: ");
        String nomeInstrutor = entrada.next();
        pessoa.setNome(nomeInstrutor);
      
        
        System.out.println("Carteira do instrutor: ");
        String tipo_Carteira = entrada.next();
        
      
        
        System.out.println("Modelo do carro usado: ");
        String Modelo = entrada.next();
       
        
        System.out.println("Aulas feitas: ");
        int aulasFeitas = entrada.nextInt();
      
        
        System.out.println("Valor por aula: ");
        double valor_aulaP = entrada.nextDouble();
       
        
        System.out.println("Taxa de aprovação nas provas práticas: ");
        double taxa_aprov = entrada.nextDouble();
     
        
        System.out.println("Insira a nota da prova teorica 1: ");
        double nota1 = entrada.nextDouble();
        
        System.out.println("Insira a nota da prova teorica 2: ");
        double nota2 = entrada.nextDouble();
       
        
        System.out.println("Insira a nota da prova teorica 3: ");
        double nota3 = entrada.nextDouble();
        
    }
}
