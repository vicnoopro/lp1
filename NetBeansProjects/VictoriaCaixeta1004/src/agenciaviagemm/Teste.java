/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviagemm;

import java.util.Scanner;



/**
 *
 * @author 13826640608
 */
public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
    PacoteTuristico objPacote = new PacoteTuristico();
    Cliente objCliente = new Cliente();
    
    AgenteViagens objAgente = new AgenteViagens();
    objAgente.MostraServiços();
    
    objAgente.setNomeAgencia("Voa Turismo");
  
    
    objPacote.setVal1(7824);
    objPacote.setVal2(5689);
    objPacote.setVal3(10658);
    
        System.out.println("Nome do cliente: ");
        String nomeCli = entrada.next();    
        objCliente.setNome(nomeCli);
        
        System.out.println("CPF do cliente: ");
        String cpf = entrada.next();
        objCliente.setCpf(cpf);
        
        System.out.println("Pacote de viagem desejado: ");
        double pacote = entrada.nextDouble();
        objPacote.setPacote(pacote);
        
        System.out.println("Quantidade de pessoas para a viagem: ");
        double quantidade = entrada.nextDouble();
        objCliente.setNacomp(quantidade);
        
        System.out.println("Método de pagamento escolhido: ");
        String met = entrada.next();
        objCliente.setMetodopag(met);
        
        
     Reserva objReserva = new Reserva(objPacote, objCliente, objAgente);
     objReserva.reservar();
     
        
       
        
    }
    
    
    
    
  
    
}
