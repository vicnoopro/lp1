/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto_escola;

/**
 *
 * @author 16189074685
 */
public class Carteira {
    private String tipo_carteira;
    private double valor_carteira, valor_taxa=10;
    
    private boolean aprovado;
    
    Autoescola objAutoescola;
    Aula_pratica objAulaPratica;
    Aula_teorica objAulaTeorica;
    Cliente objCliente;
    Instrutor objInstrutor;

    public Carteira(String tipo_carteira, Autoescola objAutoescola, Aula_pratica objAulaPratica, Aula_teorica objAulaTeorica, Cliente objCliente, Instrutor objInstrutor) {
        this.tipo_carteira = tipo_carteira;
        this.valor_carteira = valor_carteira;
        this.valor_taxa = valor_taxa;
        this.aprovado = aprovado;
        this.objAutoescola = objAutoescola;
        this.objAulaPratica = objAulaPratica;
        this.objAulaTeorica = objAulaTeorica;
        this.objCliente = objCliente;
        this.objInstrutor = objInstrutor;
    }

   

   
    public String getTipo_carteira() {
        return tipo_carteira;
    }

    public void setTipo_carteira(String tipo_carteira) {
        this.tipo_carteira = tipo_carteira;
    }

   

  
    public void setValor_taxa(double valor_taxa) {
        this.valor_taxa = valor_taxa;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public double getValor_taxa() {
        return valor_taxa;
    }
    
     public double getValor_carteira() {
        
   this.valor_carteira = (objAulaPratica.getAulasP_feitas( )* objAulaPratica.getValor_aula())+ this.getValor_taxa();
        return valor_carteira;
    }

    public void setValor_carteira(double valor_carteira) {
        this.valor_carteira = valor_carteira;
    }
    
    
    public void emissao() {
        
        System.out.println("_________________________________________________________");
        System.out.println("Nome da AutoEscola: "+objAutoescola.getNome()+" Situada na cidade: "+objAutoescola.getCidade());
        System.out.println("Endereço: "+objAutoescola.getEndereco());
        System.out.println("Nome do cliente: "+objCliente.getNome_cliente()+" CPF: "+objCliente.getCpf_cliente());
        System.out.println("Carteira desejada: "+this.getTipo_carteira());
        
        System.out.println("Instrutor responsável: "+objInstrutor.getNome_instrutor()+" Possui carteira tipo: "+objInstrutor.getTipoCarteira());
        
        
        System.out.println("Aulas práticas realizadas: "+objAulaPratica.getAulasP_feitas());
        System.out.println("Valor por aula prática: "+objAulaPratica.getValor_aula());
        System.out.println("Modelo do carro para a realização das provas: "+objAulaPratica.getModelo_carro());
        System.out.println("Taxa de aprovação nas provas práticas: "+objAulaPratica.getTaxa_aprov()+"%");
        
        System.out.println("_____________________________________________");
        System.out.println("Para a aprovação, a média de notas nas provas práticas deve ser acima de 80%");
        System.out.println("Média de nota das provas teóricas: "+objAulaTeorica.getMedia_notas());
        
        
        
        if(objAulaTeorica.getMedia_notas()>=80){
            
            System.out.println("Aprovado!");
        }
        
        else{
            System.out.println("Reprovado!");
        }
        
        System.out.println("Valor total da carteira incluindo os impostos: "+this.getValor_carteira());
        
        
    }

   
    
}
