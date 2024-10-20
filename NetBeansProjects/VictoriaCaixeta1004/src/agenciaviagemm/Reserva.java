/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviagemm;

/**
 *
 * @author 13826640608
 */
public class Reserva {
    
    private boolean ativo=true;

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
   
    PacoteTuristico objPacote;
    Cliente objCliente;
    AgenteViagens objAgente;

    public Reserva(PacoteTuristico objPacote, Cliente objCliente, AgenteViagens objAgente) {
        this.objPacote = objPacote;
        this.objCliente = objCliente;
        this.objAgente = objAgente;
    }

    
    
    
    public void reservar()
    {
        if(objPacote.getPacote()==1){
            
        System.out.println("___________________________________________________________");
        System.out.println("A "+objAgente.getNomeAgencia()+" agradece sua preferência!");
        System.out.println("___________________________________________________________");
        System.out.println("Nome do cliente: "+objCliente.getNome());
        System.out.println("CPF do cliente: "+objCliente.getCpf());
        System.out.println("Pacote 1 escolhido! O total do pacote é R$"+objPacote.getVal1());
    System.out.println("Caso escolha fazer a viagem com 1 acompanhante, o valor para cada é R$"+objPacote.getVal1()/2);
            System.out.println("Disponibilidade do pacote:" +(this.isAtivo()== true?" Disponível":" Indisponível no momento"));
        System.out.println("Método de pagamento escolhido: "+objCliente.getMetodopag());
            
        }
        
        else if (objPacote.getPacote()==2){
        System.out.println("___________________________________________________________");
        System.out.println("A "+objAgente.getNomeAgencia()+" agradece sua preferência!");
        System.out.println("___________________________________________________________");
        System.out.println("Nome do cliente: "+objCliente.getNome());
        System.out.println("CPF do cliente: "+objCliente.getCpf());
        System.out.println("Pacote 2 escolhido! O total do pacote é R$"+objPacote.getVal2());
        System.out.println("Caso escolha fazer a viagem com 2 acompanhantes, o valor para cada é R$"+objPacote.getVal1()/3);
         System.out.println("Disponibilidade do pacote:" +(this.isAtivo()!= true?" Disponível":" Indisponível no momento"));
        System.out.println("Método de pagamento escolhido: "+objCliente.getMetodopag());
        }
            
        else{
        System.out.println("___________________________________________________________");    
        System.out.println("A "+objAgente.getNomeAgencia()+" agradece sua preferência!");
        System.out.println("___________________________________________________________");
        System.out.println("Nome do cliente: "+objCliente.getNome());
        System.out.println("CPF do cliente: "+objCliente.getCpf());
        System.out.println("Pacote 3 escolhido! O total do pacote é R$"+objPacote.getVal3());
        System.out.println("Caso escolha fazer a viagem com 1 acompanhante, o valor para cada é R$"+objPacote.getVal3()/2);
          System.out.println("Disponibilidade do pacote:" +(this.isAtivo()== true?" Disponível":" Indisponível no momento"));
        System.out.println("Método de pagamento escolhido: "+objCliente.getMetodopag());
            }
        
    }
    
    
}
