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
public class Conta {
    
    private String idConta, dataVencimento, dataPagamento;
    Produto pro,pro2;
    Cliente cli, cli2;
    Conta c1, c2;

    public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    
    
    public void  visualizarConta(){
        
       
        System.out.println("CONTAS PAGAS");
        System.out.println("Identificador: "+c1.getIdConta());
        System.out.println("Cliente: "+cli.getNomeCliente()+" CPF: "+cli.getCpf());
        System.out.println("Produto: "+pro.getDescricaoProduto());
        System.out.println("Valor: "+pro.getValorProduto());
        System.out.println("Data de vencimento: "+c1.getDataVencimento());
        System.out.println("Data de pagamento: "+c1.getDataPagamento());
        System.out.println("_________________________________________________");
        
        System.out.println("CONTAS PAGAS");
        System.out.println("Identificador: "+c2.getIdConta());
        System.out.println("Cliente: "+cli2.getNomeCliente()+" CPF: "+cli.getCpf());
        System.out.println("Produto: "+pro2.getDescricaoProduto());
        System.out.println("Valor: "+pro2.getValorProduto());
        System.out.println("Data de vencimento: "+c2.getDataVencimento());
        System.out.println("Data de pagamento: "+c2.getDataPagamento());
        
        
        
        
       
        
    }

}
