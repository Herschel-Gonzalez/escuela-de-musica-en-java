/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author herschelgonzalez
 */
public class Conexion {
    
    private static Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="herschel03";
    private static final String url="jdbc:mysql://localhost:3306/escuela?characterEncoding=utf8";
    
    
    public static void main(String[] args) {
        
        Conexion conexion =  new Conexion();
        conexion.conectar();
        
    }
    
    public void conectar() {
        // Reseteamos a null la conexion a la bd
        con=null;
        try{
            Class.forName(driver);
            // Nos conectamos a la bd
            con= (Connection) DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            con.setAutoCommit(false);
            if (con!=null){
                System.out.println("Conexion establecida");
            }
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            System.out.println("Error de conexion" + e);
        }
    }
    
  
    
    public Connection getConnection(){
        
        return con;
        
    }
    
}
