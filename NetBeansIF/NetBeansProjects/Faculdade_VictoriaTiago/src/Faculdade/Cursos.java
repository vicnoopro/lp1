
package Faculdade;
public class Cursos implements InterfaceFaculdade {
    
    private String nomeCurso;
   
    
    Disciplina objDisciplina;
    
    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    public void dadosCurso(String nomeCurso, Disciplina objDisciplina){
        
        System.out.println("____________________________________________________");
        System.out.println("Nome do curso: "+this.nomeCurso);
        System.out.println("Matéria do período: "+objDisciplina.getDisciplina());
    }

    @Override
    public void listarCursos() {
      this.nomeCurso=this.getNomeCurso();
    }

}
