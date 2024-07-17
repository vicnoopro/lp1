/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoescola;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Cliente c = new Cliente();
        Instrutor i = new Instrutor();
        
        Teorica t = new Teorica();
        Pratica p = new Pratica();
        
        //Pessoa pessoa = new Pessoa();
        
        Registra registra = new Registra();
        
        registra.Registra(c);
        registra.Registra(i);
         
        registra.AulaPratica(p);
        registra.AulaTeorica(t);
        
        
    }
}
