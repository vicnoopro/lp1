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
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioDao { // Data Acess Object padrão

    ConverteDataUtilitario converte = new ConverteDataUtilitario();
    CidadeDao objCidadeDao = new CidadeDao();

    public List<Funcionario> getLista() {
        String sql = "select * from funcionario";
        List<Funcionario> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Funcionario objFuncionario = new Funcionario();
                objFuncionario.setCodigo(rs.getInt("codFuncionario"));
                objFuncionario.setNome(rs.getString("nomeFuncionario"));
                objFuncionario.setSalario(rs.getDouble("salarioFuncionario"));
                objFuncionario.setNascimento(converte.converteCalendario(rs.getDate("nascimentoFuncionario")));
                objFuncionario.setObjCidade(objCidadeDao.localizar(rs.getInt("cidadeFuncionario")));
                lista.add(objFuncionario);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());
        }
        return lista;
    }

    public boolean incluir(Funcionario objFuncionario) {
        String sql = "insert into funcionario(nomeFuncionario, salarioFuncionario,nascimentoFuncionario,cidadeFuncionario) values(?,?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, objFuncionario.getNome());
            pst.setDouble(2, objFuncionario.getSalario());
            pst.setDate(3, converte.converteBanco(objFuncionario.getNascimento()));
            pst.setInt(4, objFuncionario.getObjCidade().getCodigo());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não cadastrado!");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());
        }
        return false;
    }

    public boolean alterar(Funcionario objFuncionario) {
        String sql = "update funcionario set nomeFuncionario=?, salarioFuncionario=?, nascimentoFuncionario=?, cidadeFuncionario=? where codFuncionario=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, objFuncionario.getNome());
            pst.setDouble(2, objFuncionario.getSalario());
            pst.setDate(3, converte.converteBanco(objFuncionario.getNascimento()));
            pst.setInt(4, objFuncionario.getObjCidade().getCodigo());
            pst.setInt(5, objFuncionario.getCodigo());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionário alterado com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não alterada!");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());
        }
        return false;
    }

    public boolean remover(Funcionario objFuncionario) {
        String sql = "delete from funcionario where codFuncionario=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, objFuncionario.getCodigo());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não excluído!");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());
        }
        return false;
    }

    public boolean salvar(Funcionario obj) {
        if (obj.getCodigo() == null) {
            return incluir(obj);
        } else {
            return alterar(obj);
        }

    }

}
