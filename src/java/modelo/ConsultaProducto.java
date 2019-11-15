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
public class ConsultaProducto extends Conexion{

    public ConsultaProducto() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<Producto> listarCatalogo(Clase clas){
        ArrayList<Producto> prods;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con = getConnection();
        String sql="SELECT id,descripcion,precio,unid,imagen FROM producto WHERE clase=?";              
        prods=new ArrayList<>();
        try {            
            ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, clas.getId());
            rs=ps.executeQuery();            
            while(rs.next()){                
                Producto prod = new Producto();
                //orgdata.nombre=rs.getString("jefe");
                prod.setId(rs.getInt("id"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setUnid(rs.getString("unid"));
                prod.setImagen(rs.getString("imagen"));
                prods.add(prod);
            }
            return prods;          
            //return false;
        } catch (SQLException e) {
            System.err.println(e);
            //return false;
        }
        return null;
    }
    
    public Producto getCatalogo(int id){
        Producto prod=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con = getConnection();
        String sql="SELECT descripcion,precio,unid,imagen FROM producto WHERE id=?";             
        
        try {            
            ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1,id);
            rs=ps.executeQuery();            
            while(rs.next()){                
                prod = new Producto(rs.getString("descripcion"),rs.getDouble("precio"),rs.getString("unid"),rs.getString("imagen"));         
            }
            return prod;          
            //return false;
        } catch (SQLException e) {
            System.err.println(e);
            //return false;
        }
        return null;
    }
    
    
}
