/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author herschelgonzalez
 */
public class Consultas {
    
    Connection con;
    PreparedStatement aux;
    Statement statement;
    
    public void consultaQueAgrega(String consulta,Conexion conexion,String valores[]){
        con = conexion.getConnection();
        try {
            aux = (PreparedStatement) con.prepareStatement(consulta);
            
            for (int i = 0; i < valores.length; i++) {
                aux.setString(i+1, valores[i]);
            }
            aux.executeUpdate();
            
        } catch (SQLException ex) {
            try {
                con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public ResultSet consulta(String consulta,Conexion conexion){
        con = conexion.getConnection();
        ResultSet resultado = null;
        try {
           statement = con.createStatement();
          
          resultado = statement.executeQuery(consulta);
           
           
        } catch (SQLException ex) {
            try {
                con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
        
    }
    
    
    
    
}
