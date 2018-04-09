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
 * @author root
 */
public class Mercaderia extends Producto{
    ArrayList<Proveedor> proveedores; //Podria tener su propia clase, y podria ser mas de 1
//    estos atributos son "externos" tipo no dependen de producto...pa mi deeberia haber otra clase...pero
    private BigDecimal precioCompraXUnidad;
    private BigDecimal precioVentaXunidad;
    private int stock;
    private int vendidos;
    
}
