/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaoPosGreve;

/**
 *
 * @author 13826640608
 */
public class Escola {
    
   
    private boolean matricula = false;

    Aluno objAluno;
    Professor objProfessor;
    Disciplina objDisciplina;
    Turma objTurma;

    public Escola(Aluno objAluno, Professor objProfessor, Disciplina objDisciplina, Turma objTurma) {
        this.objAluno = objAluno;
        this.objProfessor = objProfessor;
        this.objDisciplina = objDisciplina;
        this.objTurma = objTurma;
    }
    
    
    public void FazerMatricula()
  {
      this.matricula=true;
      System.out.println("A matrícula do aluno "+objAluno.getNome()+" foi realizada!");
      
  }
       
   public void Dados()
   {
       System.out.println("_________________________________________________________");
       System.out.println("Nome do aluno: "+objAluno.getNome()+"  CPF: "+objAluno.getCpf()+"  Turma: "+objTurma.getTurma());
       System.out.println("   ");
       System.out.println("Nome do professor: "+objProfessor.getNome()+"  CPF: "+objProfessor.getCpf());
       System.out.println("Matéria lecionada pelo professor: "+objProfessor.getLeciona());
       
       System.out.println(" -----------------------------------------------------------------");
       
       System.out.println("Nota 1: "+objDisciplina.getNota1());
       System.out.println("Nota 2: "+objDisciplina.getNota2());
       System.out.println("Nota 3: "+objDisciplina.getNota3());
       System.out.println("Média de notas: "+objDisciplina.getMediaNotas());
       
       if(this.matricula==true)
       {
           System.out.println("Matriculado!");
       }
           else
       {
           System.out.println("Não matriculado");
       }
   }
  
  
    
    
}
