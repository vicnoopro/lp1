/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoescola;

/**
 *
 * @author victo
 */
public class Teorica extends Aula {
    
    private double media_notas, nota1, nota2, nota3; 

    public double getMedia_notas() {
        
        this.media_notas = (nota1+nota2+nota3)/3;
        return media_notas;
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

}
