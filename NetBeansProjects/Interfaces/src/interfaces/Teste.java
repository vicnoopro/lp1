/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author victo
 */
public class Teste {

    public static void main(String[] args) {

        AreaCalculavel areaQuad = new Retangulo(3, 2);
        System.out.println(areaQuad.calculaArea());
        
        AreaCalculavel areaCirc = new Circulo (2);
        System.out.println(areaCirc.calculaArea());
    }

}
