/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jjara
 */
public class Clase {
    int id;
    String descripcion;
    Subcategoria subcat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Subcategoria getSubcat() {
        return subcat;
    }

    public void setSubcat(Subcategoria subcat) {
        this.subcat = subcat;
    }
    
    
}
