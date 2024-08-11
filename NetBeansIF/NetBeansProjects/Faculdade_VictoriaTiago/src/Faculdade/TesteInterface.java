/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faculdade;

/**
 *
 * @author victo
 */
public class TesteInterface {

    public static void main(String[] args) {

        Cursos objcursos = new Cursos();
        objcursos.setNomeCurso("informatica"); // Definindo o nome do curso

        System.out.println(objcursos.listarCursos()); // usando o objeto objcursos
        InterfaceFaculdade IF = objcursos; // exemplo de polimorfismo, onde a interface é igual ao objeto

        System.out.println(IF.listarCursos()); //  usando IF
    }

}
