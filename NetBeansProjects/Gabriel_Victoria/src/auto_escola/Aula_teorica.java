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
public class Aula_teorica {
    private double media_notas, valor_aula, nota1, nota2, nota3;

    

    public void setMedia_notas(double media_notas) {
        this.media_notas = media_notas;
    }

    public double getValor_aula() {
        return valor_aula;
    }

    public void setValor_aula(double valor_aula) {
        this.valor_aula = valor_aula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    public double getMedia_notas() {
        
        media_notas= (nota1+nota2+nota3)/3;
        return media_notas;
    }

    
    
    

}
