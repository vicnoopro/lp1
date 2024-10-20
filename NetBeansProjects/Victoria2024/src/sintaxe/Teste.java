// psvm + tab para a linha de comando public static void
// sout + tab para a linha de comando system.out
package sintaxe;

import java.util.Scanner;

/**
 *
 * @author 13826640608
 */
public class Teste{ 
        
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        
        System.out.println("Informe seu salário:");
        double salario = entrada.nextDouble();


        System.out.println("Nome:"+nome);
        System.out.println("Idade:"+idade);
        System.out.println("Salario :"+salario);
        System.out.println("Nome:"+nome+" Idade:"+idade+" Salário:"+salario);
    }
   
}
     
