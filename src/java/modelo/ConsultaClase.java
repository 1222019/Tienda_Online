/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jjara
 */
public class ConsultaClase extends Conexion {
    
    public ArrayList<Clase> buscarClase(Subcategoria subcat){
        ArrayList<Clase> clases;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con = getConnection();
        String sql="SELECT id,descripcion FROM clase WHERE subcategoria=?";              
        clases=new ArrayList<>();
        try {            
            ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, subcat.getId());
            rs=ps.executeQuery();            
            while(rs.next()){                
                Clase clas = new Clase();
                //orgdata.nombre=rs.getString("jefe");
                clas.setId(rs.getInt("id"));
                clas.setDescripcion(rs.getString("descripcion"));
                clases.add(clas);
            }
            return clases;          
            //return false;
        } catch (SQLException e) {
            System.err.println(e);
            //return false;
        }
        return null;
    }
    
}
