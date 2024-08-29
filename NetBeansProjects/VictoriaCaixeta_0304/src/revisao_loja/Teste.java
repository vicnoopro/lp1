/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_loja;

import java.util.Scanner;

/**
 *
 * @author 13826640608
 */
public class Teste {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Produto objProduto= new Produto();
        Cliente objCliente = new Cliente();
        CarrinhodeCompras carrinho = new CarrinhodeCompras();
        
        objProduto.setValProduto(50);
        
        System.out.println("___________________Catálogo____________________");
        System.out.println(" Camiseta de algodão amarela");
        System.out.println(" Calça jeans masculina");
        System.out.println(" Calça jeans feminina");
        System.out.println(" Bermuda Tectel");
        System.out.println(" Short Legging");
        System.out.println(" Garrafa térmica");
        System.out.println(" Camiseta térmica");
        System.out.println(" Meia de algodão");
        
        System.out.println("Insira seu nome: ");
        String nomeCliente = entrada.next();
        objCliente.setNomeCliente(nomeCliente);
        
        System.out.println("Insira seu Cpf: ");
        String cpf = entrada.next();
        objCliente.setCpfCliente(cpf);
        
        System.out.println("Insira seu Cep: ");
        String cep = entrada.next();
        objCliente.setCepCliente(cep);
        
        System.out.println("Insira o método de pagamento: ");
        String met = entrada.next();
        objCliente.setMetPagamento(met);
        
        
         
        Pedido p1 = new Pedido(objProduto, objCliente);
        
        p1.venderCamiseta(); 
       carrinho.carCamiseta();
       
        
        
        
        
        
    }
    
}
