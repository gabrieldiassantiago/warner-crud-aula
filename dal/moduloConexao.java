/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;
import java.sql.*;

/**
 *
 * @author aluno9
 */
public class moduloConexao {
    public static Connection conector() {
        java.sql.Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sistema";
        
        String user = "root";
        String password = "1230";
        
        try {
            Class.forName(driver); //carrega a classe do driver e registra
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
                   
        } catch (Exception err) {
            System.out.printf("erroooo" + err);
            return null;
        }
        
        
    }
}
