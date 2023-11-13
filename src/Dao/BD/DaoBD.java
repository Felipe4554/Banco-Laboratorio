/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao.BD;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ´Felipe Chacón
 */
public class DaoBD {
    private Connection connection;
    private Statement statement;
    private ResultSet  resultset; 

    public DaoBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                    } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar el driver");
        }
    }
    
    public void connect(){
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bank", "java", "123");
        } catch (SQLException ex) {
            System.out.println("Error al conectar"+ ex.toString());
        }
    }
    
    public void createStatement(String sql) {
        try {
            this.statement = this.connection.createStatement();
            this.statement.execute(sql);
                    } catch (SQLException ex) {
            System.out.println("Error al ejecutar la sentencia"+ex.toString());
        }
    }
    
    
}
