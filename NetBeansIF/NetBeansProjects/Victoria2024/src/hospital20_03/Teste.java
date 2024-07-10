/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital20_03;

import java.util.Scanner;

/**
 *
 * @author 13826640608
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
     
      Paciente objPaciente = new Paciente();
      Medico objMedico = new Medico();
      Enfermeiro objEnfermeiro = new Enfermeiro();
         
       
      
        
        System.out.println("Insira o nome do Médico: ");
        String nomemed = entrada.nextLine();
        objMedico.setNomeMedico(nomemed);
        
        System.out.println("Insira o nome do Paciente: ");
        String nomepac = entrada.nextLine();
        objPaciente.setNomePaciente(nomepac);
        
        System.out.println("Insira o nome do enfermeiro: ");
        String nomeenf = entrada.nextLine();
        objEnfermeiro.setNomeEnfermeiro(nomeenf);
        
        System.out.println("Insira o motivo da internação: ");
        String mot = entrada.nextLine();

        System.out.println("Identificador: ");
        int id = entrada.nextInt();
        
        System.out.println("Insira o valor da diária de internação: ");
        Double diaria = entrada.nextDouble();
       
        System.out.println("Insira a quantidade de dias de internação: ");
        int dias = entrada.nextInt();
        
        
        Internacao nova = new Internacao(id, dias , mot, diaria, objPaciente, objMedico, objEnfermeiro);
        nova.VisualizarInternacao();
        
    }
    
}
