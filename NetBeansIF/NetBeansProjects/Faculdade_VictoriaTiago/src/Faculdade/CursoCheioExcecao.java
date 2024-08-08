/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faculdade;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 13826640608
 */
public class CursoCheioExcecao extends Exception{
    
    public static void main(String[] args) {
        try {
            abrirArquivo();
            System.out.println("Arquivo encontrado com sucesso!");
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao abrir arquivo." + ex.getMessage());
        }
    }
    
    public static void abrirArquivo() throws FileNotFoundException {
        Scanner entrada = null;
        entrada = new Scanner(new File("d:listade_matriculados"));
        while (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }

    }

}

   