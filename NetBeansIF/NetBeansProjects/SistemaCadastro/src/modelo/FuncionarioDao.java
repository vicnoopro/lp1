/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author 13826640608
 */
public class FuncionarioDao {
    
     public List<Funcionario> getLista() {

        return Dados.listaFuncionario;
    }

    public boolean salvar(Funcionario objFuncionario) {
        if (objFuncionario.getCodigo() == null) {
            Integer codigo = Dados.listaFuncionario.size() + 1;
            objFuncionario.setCodigo(codigo);
            Dados.listaFuncionario.add(objFuncionario);
        }
        return true;
    }
    
    public boolean remover(Funcionario objFuncionario){
        Dados.listaFuncionario.remove(objFuncionario);
        return true;
    }
}
