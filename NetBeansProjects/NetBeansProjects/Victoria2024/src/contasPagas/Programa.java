/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasPagas;

/**
 *
 * @author victo
 */
public class Programa {
    public static void main(String[] args) {
        
       Conta novaConta = new Conta ();
        
       Cliente c1 = new Cliente();
       Cliente c2 = new Cliente();
       
       Conta co1 = new Conta();
       Conta co2 = new Conta();
       
       
       Produto p1 = new Produto();
       Produto p2 = new Produto();
       
       c1.setNomeCliente("tulio");
       c1.setCpf("123456789");
              co1.setIdConta("1234");
               co1.setDataPagamento("15/05/24");
                co1.setDataVencimento("12/05/23");
                 p1.setDescricaoProduto("Telefone");
                  p1.setValorProduto(50);

          
       c2.setNomeCliente("marcos");
       c2.setCpf("123456789");
    co2.setIdConta("1234");
     co2.setDataPagamento("15/04/24");  
       co2.setDataVencimento("12/06/23");
        p2.setDescricaoProduto("Internet");
        p2.setValorProduto(100);
       
        novaConta.cli=c1;
        novaConta.c1=co1;
        novaConta.pro=p1;
        novaConta.cli2=c2;
        novaConta.c2=co2;
        novaConta.pro2=p2;
        
        novaConta.visualizarConta();
        
        
      
  
       
       
       
       
       
               
       
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
