/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pharma.farmacia.Domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alex3D
 */
public class InventarioMercancia {
    private ArrayList<Mercaderia> mercaderia;
    

    
    public InventarioMercancia(ArrayList<Mercaderia> mercaderia) {
        this.mercaderia = mercaderia;
    }

    public ArrayList<Producto> getProductos() {
        Iterator<Mercaderia> it = this.mercaderia.iterator();
        ArrayList<Producto> productos=new ArrayList<Producto>();
        while(it.hasNext()){
            Producto p= it.next().producto;
            productos.add(p);
        }
        return productos;
    }
    
    public void agregarProducto(Producto nuevo, BigDecimal precioVenta) {
        if(nuevo != null){//este metodo agrega productos nuevos
            Mercaderia m = new Mercaderia(nuevo, precioVenta);
            mercaderia.add(m);
        }else{
            System.err.println("Se esta intentando agregar un producto NULL al inventario");
        }
        //TODO Logica de quitar de la base de datos (controlador)
    }
    
    /// sabiendo que existe mercaderia
    public Mercaderia buscarMercaderia(int codigoProducto){
        Iterator<Mercaderia> it = this.mercaderia.iterator();
        boolean encontre = false;
        Mercaderia m = new Mercaderia();
        while(it.hasNext() && !encontre){
             m = it.next();
            if(m.getProducto().getCodigo() == codigoProducto){
                encontre = true;
            }
        }
        return m;
    }
    
    public void quitarProducto(int codigoProducto) {
        Iterator<Mercaderia> it = this.mercaderia.iterator();
        while(it.hasNext()){
            if(it.next().getProducto().getCodigo() == codigoProducto){
                it.remove();
            }
        }
    }
    
    
    public boolean hayStock(int codigoProducto){
        Iterator<Mercaderia> it = this.mercaderia.iterator();
        boolean stockDisponible = false;
        if(buscarMercaderia(codigoProducto).getStock()>=1){
            stockDisponible =true;
        }
        return stockDisponible;
    }
    
    public BigDecimal valorMercaderia(){
        Iterator<Mercaderia> it = this.mercaderia.iterator();
        BigDecimal valor = new BigDecimal(0.0);
        while(it.hasNext()){
            Mercaderia m = it.next();
            BigDecimal  valorProducto = m.getPrecioVentaXunidad().multiply(new BigDecimal(m.getStock()));
            valor = valorProducto.add(valor);
        }
        
        return valor;
    }
    
    public BigDecimal valorVentas(){
        Iterator<Mercaderia> it = this.mercaderia.iterator();
        BigDecimal valor = new BigDecimal(0.0);
        while(it.hasNext()){
            Mercaderia m = it.next();
            BigDecimal  valorProducto = m.getPrecioVentaXunidad().multiply(new BigDecimal(m.getVendidos()));
            valor = valorProducto.add(valor);
        }
        
        return valor;        
    }
    
    public BigDecimal valorVentasPcompra(){
        Iterator<Mercaderia> it = this.mercaderia.iterator();
        BigDecimal valor = new BigDecimal(0.0);
        while(it.hasNext()){
            Mercaderia m = it.next();
            BigDecimal  valorProducto = m.getPrecioCompraXUnidad().multiply(new BigDecimal(m.getVendidos()));
            valor = valorProducto.add(valor);
        }
        
        return valor;
    }
    
    public void registrarVenta(int codigo,int cantidad){
        Mercaderia m = this.buscarMercaderia(codigo);
        m.disminuirStock(cantidad);
        int vendidos = m.getVendidos();
        m.setVendidos(vendidos+cantidad);
    }
    ///cancelar venta...
}
