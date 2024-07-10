/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto_escola;


import java.util.Scanner;

/**
 *
 * @author 16189074685
 */
public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        Autoescola objAutoEscola = new Autoescola();
        Aula_pratica objAulaPratica = new Aula_pratica();
        Aula_teorica objAulaTeorica = new Aula_teorica();
        Cliente objCliente = new Cliente();
        Instrutor objInstrutor = new Instrutor();
        
        System.out.println("Nome da Auto Escola: ");
        String nome_AutoEscola = entrada.next();
        objAutoEscola.setNome(nome_AutoEscola);
        
        System.out.println("Cidade situada: ");
        String cidade = entrada.next();
        objAutoEscola.setCidade(cidade);
        
        System.out.println("Endereço: ");
        String endereco = entrada.next();
        objAutoEscola.setEndereco(endereco);
        
        System.out.println("Nome do cliente: ");
        String nomeCliente = entrada.next();
        objCliente.setNome_cliente(nomeCliente);
        
        System.out.println("CPF do Cliente: ");
        String cpfCliente = entrada.next();
        objCliente.setCpf_cliente(cpfCliente);
        
        System.out.println("Carteira desejada: ");
        String carteiraDesejada = entrada.next();
        
        System.out.println("Nome do intrutor: ");
        String nomeInstrutor = entrada.next();
        objInstrutor.setNome_instrutor(nomeInstrutor);
        
        System.out.println("Carteira do instrutor: ");
        String tipo_Carteira = entrada.next();
        objInstrutor.setTipoCarteira(tipo_Carteira);
        
        System.out.println("Modelo do carro usado: ");
        String Modelo = entrada.next();
        objAulaPratica.setModelo_carro(Modelo);
        
        System.out.println("Aulas feitas: ");
        int aulasFeitas = entrada.nextInt();
        objAulaPratica.setAulasP_feitas(aulasFeitas);
        
        System.out.println("Valor por aula: ");
        double valor_aulaP = entrada.nextDouble();
        objAulaPratica.setValor_aula(valor_aulaP);
        
        System.out.println("Taxa de aprovação nas provas práticas: ");
        double taxa_aprov = entrada.nextDouble();
        objAulaPratica.setTaxa_aprov(taxa_aprov);
        
        System.out.println("Insira a nota da prova teorica 1: ");
        double nota1 = entrada.nextDouble();
        objAulaTeorica.setNota1(nota1);
        
        System.out.println("Insira a nota da prova teorica 2: ");
        double nota2 = entrada.nextDouble();
        objAulaTeorica.setNota2(nota2);
        
        System.out.println("Insira a nota da prova teorica 3: ");
        double nota3 = entrada.nextDouble();
        objAulaTeorica.setNota3(nota3);
        
       Carteira nova = new Carteira(tipo_Carteira, objAutoEscola, objAulaPratica, objAulaTeorica, objCliente, objInstrutor);
       nova.emissao();
      
        
        
        
        
        
    }

    
}
