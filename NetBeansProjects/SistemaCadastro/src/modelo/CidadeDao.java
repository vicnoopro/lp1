/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 12172700606
 */
public class CidadeDao {    //Data Acess Object padrão

    public List<Cidade> getLista(){
        String sql = "select * from cidade";
        List<Cidade> lista = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                Cidade objCidade = new Cidade ();
                objCidade.setCodigo(rs.getInt("CodCidade"));
                objCidade.setNome(rs.getString("nomeCidade"));
                objCidade.setUf(rs.getString("ufCidade"));
                lista.add(objCidade);
            }
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: "+ex.getMessage());
        }
        
      return lista;  
    }
    
    public boolean salvar(Cidade obj){
        if(obj.getCodigo()==null){
            Integer codigo = Dados.listaCidade.size()+1;
            obj.setCodigo(codigo);
            Dados.listaCidade.add(obj);
    }
    return true;
}
    public boolean remover(Cidade obj){
        Dados.listaCidade.remove(obj);
        return true;
    }
}
