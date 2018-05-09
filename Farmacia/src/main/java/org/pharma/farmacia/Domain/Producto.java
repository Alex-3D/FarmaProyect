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
 * @author Alex3D
 */
public class Producto {
    private String nombre;
    private String origen; //origen que lo fabrica...
    private String descripcion;
    private BigDecimal valor;
    private int codigo;
    //GLN (Número de Localización Mundial)
    //GTIN (Global Trade Item Number, código mundial del producto).
    
    public Producto(String nombre, String origen, String descripcion, BigDecimal valor, int codigo) {
        this.nombre = nombre;
        this.origen = origen;
        this.descripcion = descripcion;
        this.valor = valor;
        this.codigo =codigo;
    }

    public Producto(String nombre, BigDecimal valor, int codigo) {
        this.nombre = nombre;
        this.valor = valor;
        this.codigo =codigo;
    }
    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCodigo(){
        return this.codigo;
    }
    
    public BigDecimal getValor() {
        return valor;
    }
    
    public void setValor(BigDecimal costo){
         this.valor = costo;
    }
   
}
