/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 13826640608
 */
public class TesteArquivo {

    public static void main(String[] args) {
//o sistema não consegue abrir o caminho, mas estou forçando funcionar, mesmo que nao apareca o resultado desejado
        try {
            abrirArquivo();
            System.out.println("Arquivo encontrado com sucesso!");
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao abrir arquivo." + ex.getMessage());
        }
    }

    public static void abrirArquivo() throws FileNotFoundException {
        Scanner entrada = null;
        entrada = new Scanner(new File("d:\\textoCriativo.txt"));
        while (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }

    }

}
