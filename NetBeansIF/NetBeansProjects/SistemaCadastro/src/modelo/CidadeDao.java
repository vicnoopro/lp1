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
public class CidadeDao {// data access object padrão

    public List<Cidade> getLista() {

        return Dados.listaCidade;
    }

    public boolean salvar(Cidade objCidade) {
        if (objCidade.getCodigo() == null) {
            Integer codigo = Dados.listaCidade.size() + 1;
            objCidade.setCodigo(codigo);
            Dados.listaCidade.add(objCidade);
        }
        return true;
    }
    
    public boolean remover(Cidade objCidade){
        Dados.listaCidade.remove(objCidade);
        return true;
    }
}
