
package Faculdade;

public class Cursos implements InterfaceFaculdade { // implementando InterfaceFaculdade para usar seu método

    
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


    
    @Override // método da interface
    public String listarCursos() {
         
        return this.getNomeCurso();
    }
}

