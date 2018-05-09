/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pharma.farmacia.Domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alex
 */
public class LibroDiario {
  private  LocalDate mesFacturacion;
  private  ArrayList<Factura> compras;
  private  ArrayList<Factura> ventas;
  private  BigDecimal capitalInicial;
  private  BigDecimal ganancia;
  
    /// libro diario iniciado con capital monetario
    LibroDiario(LocalDate fechaApertura, BigDecimal capInicial){
        mesFacturacion = fechaApertura;
        compras = new ArrayList<Factura>();
        ventas = new ArrayList<Factura>();
        capitalInicial = capInicial;
        ganancia = new BigDecimal(0);
    }
    /// libro diarion iniciado solo con mercaderias
    LibroDiario(LocalDate fechaApertura, ArrayList<Factura> mercaderiaComprada){
        mesFacturacion = fechaApertura;
        compras = mercaderiaComprada;
        ventas = new ArrayList<Factura>();
        capitalInicial = valorMercaderia(mercaderiaComprada);
        ganancia = new BigDecimal(0);        
    }

    /// libro diario Iniciado con mercaderia y capital monetario
    LibroDiario(LocalDate fechaApertura, ArrayList<Factura> capitalEnMercaderia, BigDecimal capitalEnMoneda){
        mesFacturacion = fechaApertura;
        compras = capitalEnMercaderia;
        ventas = new ArrayList<Factura>();
        capitalInicial = valorMercaderia(capitalEnMercaderia);
        ganancia = new BigDecimal(0);        
    }
    
    public BigDecimal valorMercaderia(ArrayList<Factura> compras){
        Iterator<Factura> it = compras.iterator();
        BigDecimal valuacion = new BigDecimal(0.0);
        while(it.hasNext()){
            Factura f = it.next();
            valuacion = valuacion.add(f.precioFinal());
        }
        
        return valuacion;
    }
    
    public void agregarFactura(FacturaCompra fact){
        this.compras.add(fact);
    }

    public void agregarFactura(FacturaVenta fact){
        this.ventas.add(fact);
    }    
}
