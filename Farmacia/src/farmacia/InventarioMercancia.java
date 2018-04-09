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
public class InventarioMercancia {
    private ArrayList<Mercaderia> mercaderia;
    

    
    public InventarioMercancia(ArrayList<Mercaderia> mercaderia) {
        this.mercaderia = mercaderia;
    }

    public ArrayList<Mercaderia> getProductos() {
        return mercaderia;
    }
    
    public void agregarProducto(Mercaderia nuevo) {
        if(nuevo != null)//tambien se podria chequear si el producto ya esta agregado
            mercaderia.add(nuevo);
        else
            System.err.println("Se esta intentando agregar un producto NULL al inventario");
        
        //TODO Logica de quitar de la base de datos (controlador)
    }
    
    public void quitarProducto(Producto p) {
        if(mercaderia.contains(p))
            mercaderia.remove(p); //podria ser por nombre
        else
            System.err.println("Se intenta remover del inventario un producto que NO esta en el.");
        
        //TODO logica de controlador
    }
}
