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

/**
 *
 * @author ralel
 */
public class FacturaVenta extends Factura {
    private String infoComprador;
    private Integer clientId; //No sabemos q va a ser aun
    private ArrayList<Producto> productosFactura;//// aca no se si es mercaderia,

    public FacturaVenta(char tipoFactura, String comprador, LocalDateTime fecha, Integer clienteId){
        super(tipoFactura, fecha);
        this.infoComprador = comprador;
        this.clientId = clienteId;
        productosFactura = new ArrayList<Producto>();
    }
    
    
    @Override
    public void agregarProducto(Producto prod) {
        
    }

    @Override
    public BigDecimal precioFinal() {
        BigDecimal precioFinal = new BigDecimal(0.0);
        Iterator<Producto> i = this.productosFactura.iterator();
        while(i.hasNext()){
            precioFinal = precioFinal.add(i.next().getValor());
        }
        return precioFinal;
    }

    @Override
    public boolean hayStock(Producto prod) {
        return true;
    }
}
