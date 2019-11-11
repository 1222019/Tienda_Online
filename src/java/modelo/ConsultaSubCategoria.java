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
public class ConsultaSubCategoria extends Conexion {    
    public ArrayList<Subcategoria> buscarSubcategoria(){
        ArrayList<Subcategoria> subcates;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con = getConnection();
        String sql="SELECT DISTINCT id,descripcion FROM subcategoria WHERE categoria=?";              
        subcates=new ArrayList<>();
        try {            
            ps=(PreparedStatement) con.prepareStatement(sql);
            rs=ps.executeQuery();            
            while(rs.next()){                
                Subcategoria subcate = new Subcategoria();
                //orgdata.nombre=rs.getString("jefe");
                subcate.setId(rs.getInt("id"));
                subcate.setDescripcion(rs.getString("descripcion"));
                subcates.add(subcate);
            }
            return subcates;          
            //return false;
        } catch (SQLException e) {
            System.err.println(e);
            //return false;
        }
        return null;
    }
}
