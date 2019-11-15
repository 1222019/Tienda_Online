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
public class Producto {
    int id;
    String descripcion;
    double precio;
    double precioant;
    String unid;
    Clase clas;
    String imagen;

    public Producto() {
    }
       
    public Producto( String descripcion, double precio, String unid, String imagen) {        
        this.descripcion = descripcion;
        this.precio = precio;
        this.unid = unid;
        this.clas = clas;
        this.imagen = imagen;
    }
    
    public Producto(int id, String descripcion, double precio, double precioant, String unid, Clase clas, String imagen) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.precioant = precioant;
        this.unid = unid;
        this.clas = clas;
        this.imagen = imagen;
    }    
    
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioant() {
        return precioant;
    }

    public void setPrecioant(double precioant) {
        this.precioant = precioant;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public Clase getClas() {
        return clas;
    }

    public void setClas(Clase clas) {
        this.clas = clas;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
}
