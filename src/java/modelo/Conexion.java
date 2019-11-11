/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jjara
 */
public class Conexion {
    private final String base="venta";
    private final String user="root";
    private final String password="";
    private final String url="jdbc:mysql://localhost:3306/"+base;
    private Connection con=null;
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection)DriverManager.getConnection(this.url,this.user,this.password);
        }catch(SQLException e){
            System.err.println(e);
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
        }
        return con;
    }
}
