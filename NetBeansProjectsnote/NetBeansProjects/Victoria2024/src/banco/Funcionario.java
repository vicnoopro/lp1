/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Juliana
 */
public class Funcionario {
    
    private String funcionario, departamento, data;
    private double salario;
    private String rg;
    private boolean ativo=true;
    
    public String getFuncionario() {
        return funcionario;
    }
//getters e setters liberam o uso das variaveis daqui na classe de teste
    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public void bonifica(double valorBeneficio) {
	setSalario(getSalario() + valorBeneficio);

}

    public void demite() {
        this.ativo = false;
}
    public void mostra(){
        System.out.println("Nome: "+this.getFuncionario());
        System.out.println("Departamento:"+this.getDepartamento());
        System.out.println("Salário: R$"+this.getSalario());
        System.out.println("Data de entrada: "+this.getData());
        System.out.println("RG: "+this.getRg());
        System.out.println("Ativo? "+(this.isAtivo()== true?"Sim":"Não"));
        System.out.println("-------------------------------------");
    }
    
}
