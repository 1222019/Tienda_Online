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
public class ConsultaCategoria extends Conexion {
    public ArrayList<Categoria> buscarCategoria(){
        ArrayList<Categoria> cates;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con = getConnection();
        String sql="SELECT descripcion FROM categoria WHERE id=?";              
        cates=new ArrayList<>();
        try {            
            ps=(PreparedStatement) con.prepareStatement(sql);
            rs=ps.executeQuery();            
            while(rs.next()){                
                Categoria cate = new Categoria();
                //orgdata.nombre=rs.getString("jefe");
                cate.setId(rs.getInt("id"));
                cate.setDescripcion(rs.getString("descripcion"));
                cates.add(cate);
            }
            return cates;          
            //return false;
        } catch (SQLException e) {
            System.err.println(e);
            //return false;
        }
        return null;
    }
}
