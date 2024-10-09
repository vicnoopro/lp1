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
import javax.swing.JOptionPane;

/**
 *
 * @author 13826640608
 */
public class ClienteDao {
    public List<Cliente> getLista() {
        String sql = "select * from Cliente";
        List<Cliente> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Cliente objCliente = new Cliente();
                objCliente.setCodigo(rs.getInt("codCliente"));
                objCliente.setNome(rs.getString("nomeCliente"));
                objCliente.setCpf(rs.getString("cpfCliente"));
                lista.add(objCliente);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());
        }

        return lista;
    }

    public boolean incluir(Cliente objCliente) {
        String sql = "insert into cliente(nomeCliente, cpfCliente) values (?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(2, objCliente.getNome());
            pst.setString(3, objCliente.getCpf());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Clinte não cadstrado!");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());

        }
        return false;
    }

    public boolean alterar(Cliente objCliente) {
        String sql = "update cliente set nomeCliente=?, cpfCliente=? where codCliente=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(2, objCliente.getNome());
            pst.setString(3, objCliente.getCpf());
            pst.setInt(1, objCliente.getCodigo());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não alterado!");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());

        }
        return false;
    }

    public boolean remover(Cliente objCliente) {
        String sql = "delete from cliente where codCliente=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, objCliente.getCodigo());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não ecluída!");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());

        }
        return false;
    }

    public boolean salvar(Cliente obj) {
        if (obj.getCodigo() == null) {
            return incluir(obj);
        } else {
            return alterar(obj);
        }

    }
    
}
