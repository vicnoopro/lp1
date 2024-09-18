/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassagemAerea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 13826640608
 */
public class Aviao extends Exception {
    
    private int idAviao, capacidade;
    private String Modelo;

    public Aviao(int idAviao, int capacidade, String Modelo) {
        this.idAviao = idAviao;
        this.capacidade = capacidade;
        this.Modelo = Modelo;
    }

    public int getIdAviao() {
        return idAviao;
    }

    public void setIdAviao(int idAviao) {
        this.idAviao = idAviao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    
    
   

    public static void main(String[] args) {
        try {
            Checked();// 
            System.out.println("Arquivo encontrado com sucesso!");
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao abrir arquivo." + ex.getMessage());
        }
    }

    public static void Checked () throws FileNotFoundException { 
        Scanner entrada = null;
        entrada = new Scanner(new File("d:listade_matriculados"));
        while (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }

    }

}
    

