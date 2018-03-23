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
    String nombre;
    String descripcion;
    String lavoratorio;
    ArrayList<Proveedor> proveedores; //Podria tener su propia clase, y podria ser mas de 1
    Boolean estaEnStock;
    BigDecimal precio;
    
    
}
