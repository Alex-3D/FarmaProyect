/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pharma.farmacia.Domain;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ralel
 */
public class MercaderiaTest {
    
    private Producto pA;
    private Producto pB;
    private Producto pC;
    private Mercaderia mA;
    private Mercaderia mB;
    private Mercaderia mC;

        
    @Before
    public void setUp() {
        pA = new Medicine("dulcolax", BigDecimal.valueOf(5.45), 2345);
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void crearMercaderia() {
        mA = new Mercaderia(pA, BigDecimal.valueOf(10.0));
        assertEquals(mA.getStock(), 0);
        assertEquals(mA.getPrecioCompraXUnidad(), BigDecimal.valueOf(5.45));
        assertEquals(mA.getPrecioVentaXunidad(), BigDecimal.valueOf(10.0));
        assertEquals(mA.getProducto().getCodigo(), 2345);
     }
}
