/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaoPosGreve;

import java.util.Scanner;

public class TesteEscola {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Aluno objAluno = new Aluno();
        Professor objProfessor = new Professor();
        Disciplina objDisciplina = new Disciplina();
        Turma objTurma = new Turma();

        System.out.println("_____________________________");

        System.out.println("Insira o nome do professor: ");
        String nomeProfessor = entrada.next();
        objProfessor.setNome(nomeProfessor);
        System.out.println("CPF: ");
        String cpf1 = entrada.next();
        objProfessor.setCpf(cpf1);
        System.out.println("Insira a matéria lecionada: ");
        String materia = entrada.next();
        objProfessor.setLeciona(materia);

        System.out.println("_____________________________");

        System.out.println("Insira o nome do aluno: ");
        String nomeAluno = entrada.next();
        objAluno.setNome(nomeAluno);
        
        System.out.println("CPF: ");
        String cpf2 = entrada.next();
        objAluno.setCpf(cpf2);

        System.out.println("Insira a turma do aluno: ");
        String turma = entrada.next();
        objTurma.setTurma(turma);

        System.out.println("____________________________");
        
        System.out.println("Insira a nota 1: ");
        double nota1 = entrada.nextDouble();
        objDisciplina.setNota1(nota1);

        System.out.println("Insira a nota 2: ");
        double nota2 = entrada.nextDouble();
        objDisciplina.setNota2(nota2);

        System.out.println("Insira a nota 3: ");
        double nota3 = entrada.nextDouble();
        objDisciplina.setNota3(nota3);
        

        Escola objEscola = new Escola(objAluno, objProfessor, objDisciplina, objTurma);
        objEscola.FazerMatricula();
        objEscola.Dados();

    }

}
