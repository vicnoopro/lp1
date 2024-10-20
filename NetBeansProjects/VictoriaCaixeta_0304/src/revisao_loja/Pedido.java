/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao_loja;

/**
 *
 * @author 13826640608
 */
public class Pedido {
    
    private double valTotal;
    private String statusPedido;
    
    Produto objProduto;
    Cliente objCliente;
    CarrinhodeCompras objCarrinho;

    public Pedido(Produto objProduto, Cliente objCliente) {
        this.objProduto = objProduto;
        this.objCliente = objCliente;
    }

    
 
    public double getValTotal() {
        
      this.valTotal = objProduto.getValProduto();
        return valTotal;
    }

    public void setValTotal(double valTotal) {
        this.valTotal = valTotal;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }

    public void venderCamiseta()
    {
        objProduto.setValProduto(50);
        System.out.println("Total do pedido: R$"+objProduto.getValProduto());
       
    }
    
    public void venderCalcaMasc()
    {
        System.out.println("Total do pedido: R$"+objProduto.getValProduto());
       
    }
    
    public void venderCalcaFem()
    {
        System.out.println("Total do pedido: R$"+objProduto.getValProduto());
       
    }
    
    public void venderBermuda()
    {
        System.out.println("Total do pedido: R$"+objProduto.getValProduto());
       
    }
    
    public void venderShort()
    {
        System.out.println("Total do pedido: R$"+objProduto.getValProduto());
       
    }
    
    public void venderGarrafa()
    {
        System.out.println("Total do pedido: R$"+objProduto.getValProduto());
       
    }
    
    public void venderCamTer()
    {
        System.out.println("Total do pedido: R$"+objProduto.getValProduto());
       
    }
    
    public void venderMeia()
    {
        System.out.println("Total do pedido: R$"+objProduto.getValProduto());
       
    }
    
}
