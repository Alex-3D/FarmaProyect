/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pharma.farmacia.Domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author Alex3D
 */
public abstract class Factura {
    protected int nroFactura;
    protected LocalDateTime fechaFactura;
    protected char TipoDeFactura; //factura A(ri a Ri con ivaDiscr), b(ri a cf, exento, monotributista) o C(no importa condicion Vendedor, comprador)
    
    public Factura(char tipoFactura, LocalDateTime fecha){
        this.fechaFactura = fecha;
        this.TipoDeFactura = tipoFactura;
    }
    
    public Factura(int nroFactura, char tipoFactura, LocalDateTime fecha){
        this.nroFactura = nroFactura;
        this.fechaFactura = fecha;
        this.TipoDeFactura = tipoFactura;
    }

    
    /// operaciones
    public abstract void agregarProducto(Producto prod);
   
    public abstract BigDecimal precioFinal();

    public abstract boolean hayStock(Producto prod);
    
}
