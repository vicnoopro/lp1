package Faculdade;

import java.util.Scanner;

public class TesteFaculdade{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Cursos objCurso = new Cursos();// criando objetos
        Disciplina objDisciplina = new Disciplina();// criando objetos
        Avaliacao objAvaliacao = new Avaliacao();// criando objetos

        System.out.println("Insira o nome do curso: ");
        String nomeCurso = entrada.next();
        objCurso.setNomeCurso(nomeCurso);

        System.out.println("Insira a matéria principal do período: ");
        String nomeDisciplina = entrada.next();
        objDisciplina.setDisciplina(nomeDisciplina);

        System.out.println("______________________________________________________");

        System.out.println("Insira o nome do aluno: ");
        String nomeA = entrada.next();
        System.out.println("Insira o CPF: ");
        String cpfA = entrada.next();
        System.out.println("Idade: ");
        int idadeA = entrada.nextInt();
        System.out.println("Insira o número de matrícula:");
        String nMatricula = entrada.next();

        System.out.println("______________________________________________________");

        System.out.println("Insira a nota 1 do aluno: ");
        double nota1 = entrada.nextDouble();
        objAvaliacao.setNota1(nota1);
        System.out.println("Insira a nota 2 do aluno: ");
        double nota2 = entrada.nextDouble();
        objAvaliacao.setNota2(nota2);
        System.out.println("Insira a nota 3 do aluno: ");
        double nota3 = entrada.nextDouble();
        objAvaliacao.setNota3(nota3);
        System.out.println("Insira a nota 4 do aluno: ");
        double nota4 = entrada.nextDouble();
        objAvaliacao.setNota4(nota4);

        System.out.println("______________________________________________________");

        System.out.println("Insira o nome do professor: ");
        String nomeP = entrada.next();
        System.out.println("Insira o CPF: ");
        String cpfP = entrada.next();
        System.out.println("Idade: ");
        int idadeP = entrada.nextInt();
        System.out.println("Insira a matéria lecionada: ");
        String materiaLecionada = entrada.next();

        objCurso.dadosCurso(nomeCurso, objDisciplina);// construtor que obriga a passagem dos parâmetros nomeCurso e objDisciplina

        Professor objProfessor = new Professor(nomeP, cpfP, idadeP);// construtor que obriga a passagem dos parâmetros nomeP, cpfP e idadeP
        objProfessor.setMateriaLecionada(materiaLecionada);
        objProfessor.mostra();// mostra os dados referentes ao professor

        Alunos objAluno = new Alunos(nMatricula, objAvaliacao, nomeA, cpfA, idadeA); // construtor que obriga a passagem dos parâmetros nMatricula, objAvaliacao, nomeA, cpfA e idadeA
        objAluno.setnMatricula(nMatricula);
        objAluno.mostra();// mostra os dados referentes ao aluno
        
       
        

    }
}

    
