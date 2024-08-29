/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecao;

import java.lang.reflect.Array;

/**
 *
 * @author 13826640608
 */
public class TesteErro {

    public static void main(String[] args) {
        System.out.println("inicio do main");// aqui o método 1 está sendo chamado, e a função do método 1 é chamar o método 2
        metodo1();
        System.out.println("fim do main");
    }

    static void metodo1() {
        System.out.println("inicio do metodo1");
        metodo2();
        System.out.println("fim do metodo1");
    }

    static void metodo2() {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
        //try{
        for (int i = 0; i < 10; i++) {// colocando < 15 eu estou forcando a dar erro, mas com o try e catch ele continua funcionando
            array[i] = i;
            System.out.println(array[i]);
        }
        //}catch (ArrayIndexOutOfBoundsException ex){
        //    System.out.println("Erro: "+ex.getMessage());
        // }

        System.out.println("fim do metodo2");
    }

}
