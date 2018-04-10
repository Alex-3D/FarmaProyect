/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class Mercaderia {
    Producto producto;
    private ArrayList<Proveedor> proveedores; //Podria tener su propia clase, y podria ser mas de 1
//    estos atributos son "externos" tipo no dependen de producto...pa mi deeberia haber otra clase...pero
    private BigDecimal precioCompraXUnidad;
//    private BigDecimal precioVentaXunidad;
    private int stock;
    private int vendidos;
    
    // para productos que la farmacia compra
    Mercaderia(Producto prod, BigDecimal precioCompra){
        producto = prod;
        precioCompraXUnidad = precioCompra;
  //      precioVentaXunidad = new BigDecimal(0.0);
        stock = 0;
        int vendidos=0;        
    }

    /// productos de la farmacia
    Mercaderia(Producto prod, BigDecimal precioCompra,BigDecimal precioVenta, int stock){
        producto = prod;
        precioCompraXUnidad = precioCompra;
    //    precioVentaXunidad = precioVenta;
        stock = stock;
        int vendidos=0;        
    }

/// getters de la mercaderia

    public Producto getNombre() {
        return producto;
    }
    
    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public BigDecimal getPrecioCompraXUnidad() {
        return precioCompraXUnidad;
    }

//    public BigDecimal getPrecioVentaXunidad() {
//        return precioVentaXunidad;
//    }

    public int getStock() {
        return stock;
    }

    public int getVendidos() {
        return vendidos;
    }

// atributos que se pueden modificar

    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public void setPrecioCompraXUnidad(BigDecimal precioCompraXUnidad) {
        this.precioCompraXUnidad = precioCompraXUnidad;
    }
//
//    public void setPrecioVentaXunidad(BigDecimal precioVentaXunidad) {
//        this.precioVentaXunidad = precioVentaXunidad;
//    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }
//// fin de getters y setter
    
    public void aumentarStock(int cant){
        this.stock = this. stock + cant;
    }
    
    public void disminuirStock(int cant){
        this.stock = this.stock - cant;// siempre disminuimos con stock, es decir nunca va devoler algo negativo....
    }
    
    
    
}
