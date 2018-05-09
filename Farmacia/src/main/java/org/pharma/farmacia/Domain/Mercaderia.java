/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pharma.farmacia.Domain;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class Mercaderia {
    Producto producto;
//    private Proveedor proveedor; // podria tenes mas de uno, pero son productos diferentes
//    estos atributos son "externos" tipo no dependen de producto...pa mi deeberia haber otra clase...pero
    private BigDecimal precioCompraXUnidad;
    private BigDecimal precioVentaXunidad;
    private int stock;
    private int vendidos;

    public Mercaderia() {
    }
    
    // para productos que la farmacia compra
    Mercaderia(Producto prod, BigDecimal precioVenta){
        producto = prod;
        precioCompraXUnidad = prod.getValor();
        precioVentaXunidad = precioVenta;
        stock = 0;
        int vendidos=0;
        this.producto.setValor(precioVenta);///cambio precio de producto
    }

    /// productos de la farmacia
    Mercaderia(Producto prod, BigDecimal precioVenta, int stock){
        producto = prod;
        precioVentaXunidad = precioVenta;
        stock = stock;
        int vendidos=0;        
    }

/// getters de la mercaderia

    public Producto getProducto() {
        return producto;
    }
    
    public BigDecimal getPrecioCompraXUnidad() {
        return precioCompraXUnidad;
    }

    public BigDecimal getPrecioVentaXunidad() {
        return precioVentaXunidad;
    }

    public int getStock() {
        return stock;
    }

    public int getVendidos() {
        return vendidos;
    }

// atributos que se pueden modificar

    public void setPrecioCompraXUnidad(BigDecimal precioCompraXUnidad) {
        this.precioCompraXUnidad = precioCompraXUnidad;
    }
//
//    public void setPrecioVentaXunidad(BigDecimal precioVentaXunidad) {
//        this.precioVentaXunidad = precioVentaXunidad;
//    }
    
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
