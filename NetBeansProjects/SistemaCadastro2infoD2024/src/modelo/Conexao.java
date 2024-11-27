/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author tulio
 */
public class Conexao {

    private static final String banco = "jdbc:mysql://localhost:3307/banco2infod2024";
    //private static final String banco = "jdbc:mysql://localhost:3307/banco2infod2024?autoReconnect=true&useSSL=false";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String usuario = "root";
    private static final String senha = "1234";

    private static Connection con = null;

    public Conexao() {
    }

    public static Connection getConexao() {
        if (con == null) {
            try {
                Class.forName(driver);
                con = DriverManager.getConnection(banco, usuario, senha);
            } catch (ClassNotFoundException ex) {
                System.out.println("Não encontrou o driver: " + ex.getMessage());
            } catch (SQLException ex) {
                System.out.println("Erro na conexão: " + ex.getMessage());
            }
        }// fim if

        return con;
    }

    public static PreparedStatement getPreparedStatement(String sql) {
        if (con == null) {
            con = getConexao();
        }
        try {
            return con.prepareStatement(sql);
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: " + ex.getMessage());
        }
        return null;
    }

}
