/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

import java.util.ArrayList;

/**
 *
 * @author Alex3D
 */
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public void agregarProducto(Producto nuevo) {
        if(nuevo != null)//tambien se podria chequear si el producto ya esta agregado
            productos.add(nuevo);
        else
            System.err.println("Se esta intentando agregar un producto NULL al inventario");
        
        //TODO Logica de quitar de la base de datos (controlador)
    }
    
    public void quitarProducto(Producto p) {
        if(productos.contains(p))
            productos.remove(p); //podria ser por nombre
        else
            System.err.println("Se intenta remover del inventario un producto que NO esta en el.");
        
        //TODO logica de controlador
    }
}
