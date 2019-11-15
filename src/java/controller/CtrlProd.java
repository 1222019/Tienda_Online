/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import modelo.ConsultaProducto;
import modelo.Producto;

/**
 *
 * @author jjara
 */
public class CtrlProd {
    public Producto getProducto(int id){        
        return new ConsultaProducto().getCatalogo(id);
    }
}
