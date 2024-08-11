
package Faculdade;
<<<<<<< HEAD
public class Cursos implements InterfaceFaculdade { // implementando InterfaceFaculdade para usar seu método
=======
public class Cursos implements InterfaceFaculdade {
>>>>>>> 827f2f1b76da6c22b4e32b84d710b8277779182e
    
    private String nomeCurso;
   
    
    Disciplina objDisciplina; // fazendo ligação entre classes
    
    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    public void dadosCurso(String nomeCurso, Disciplina objDisciplina){ //
        
        System.out.println("____________________________________________________");
        System.out.println("Nome do curso: "+this.nomeCurso);
        System.out.println("Matéria do período: "+objDisciplina.getDisciplina());
    }

<<<<<<< HEAD
    
    @Override // método da interface
    public String listarCursos() {
         
        return this.getNomeCurso();
    }

    
    
    
=======
    @Override
    public void listarCursos() {
      this.nomeCurso=this.getNomeCurso();
    }

>>>>>>> 827f2f1b76da6c22b4e32b84d710b8277779182e
}
