/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassagemAerea;

import java.util.Scanner;

/**
 *
 * @author 13826640608
 */
public class Teste {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o nome do passageiro: ");
        String nomepas = entrada.next();

        System.out.println("Insira o ID do passageiro: ");
        int idPas = entrada.nextInt();

        System.out.println("Insira a nacionalidade do passageiro: ");
        String nacionalidade = entrada.next();

        System.out.println("Insira o ID do avião: ");
        int idAv = entrada.nextInt();

        System.out.println("Insira o modelo do avião: ");
        String modelo = entrada.next();

        System.out.println("Insira a capacidade do avião: ");
        int capacidade = entrada.nextInt();

        System.out.println("Insira o Id da reserva: ");
        int idRe = entrada.nextInt();

        System.out.println("Insira o assento reservado: ");
        String assento = entrada.next();

        Passageiro objPassageiro = new Passageiro(idPas, nomepas, nacionalidade);
        Aviao objAviao = new Aviao(idAv, capacidade, modelo);
        Reserva objReserva = new Reserva(idRe, assento);

        Embarcar objEmbarque = new Embarcar(objAviao, objPassageiro, objReserva);

        objEmbarque.Relatorio(objAviao, objPassageiro, objReserva);

        
        //VOO internacional
        VooInternacional objVI = new VooInternacional(idRe, idRe, capacidade, modelo, assento, modelo, modelo);
        System.out.println("Digite um preço base da passagem: ");
        double precoBase = entrada.nextDouble();
        objVI.setPrecoBase(precoBase);
        
        System.out.println("Digite a taxa de embarque:  ");
        double te = entrada.nextDouble();
        objVI.setTaxaEmbarque(te);
        System.out.println("Digite a taxa de imigração:  ");
        double ti = entrada.nextDouble();
        objVI.setTaxaImigracao(ti);
        objVI.calcularValor();
        
        objVI.desconto();
        
        /*verificar disponíbilidade
        System.out.println("Digite quantas pessoas embaracram no avião: ");
        int embarcadosI = entrada.nextInt();
        objVI.setEmbarcados(embarcadosI);
        objVI.Disponibilidade();
        
        Tulio, eu queria ter feito esse de verificar se havia assentos dísponeiveis, mas eu não encontrei o erro */
        
        
        //VOO nacional
         VooNacional objVN = new VooNacional(idRe, idRe, capacidade, modelo, assento, modelo, modelo);
        System.out.println("Digite um preço base da passagem: ");
        double precoBaseN = entrada.nextDouble();
        objVN.setPrecoBase(precoBaseN);
   
        System.out.println("Digite a taxa de embarque: ");
        double ten = entrada.nextDouble();
        objVN.setTaxaEmbarque(ten);
        objVN.calcularValor();
        
        objVN.desconto();
        
        
    }

}
