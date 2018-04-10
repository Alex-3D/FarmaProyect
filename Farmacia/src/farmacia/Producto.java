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
 * @author Alex3D
 */
public class Producto {
    private String nombre;
    private String origen; //empresa que lo fabrica...
    private String descripcion;
    private BigDecimal valor;

    public Producto(String nombre, String origen, String descripcion, BigDecimal valor) {
        this.nombre = nombre;
        this.origen = origen;
        this.descripcion = descripcion;
        this.valor = valor;
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

    public BigDecimal getValor() {
        return valor;
    }
    
    
   
}
