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
public class Factura {
    private Integer clientId; //No sabemos q va a ser aun
    private ArrayList<Producto> productosAVender;
    private char TipoDeFacura;
    private Boolean finalizada; //representaria si esta en proseso o si ya se puede "guardar"
    private String Vendedor;

    public Factura(Integer clientId, char TipoDeFacura, String Vendedor) {
        this.clientId = clientId;
        this.TipoDeFacura = TipoDeFacura;
        this.Vendedor = Vendedor;
        this.finalizada=false;
        ArrayList<Producto> p = new ArrayList<>();
        this.productosAVender = p;
    }

    public Integer getClientId() {
        return clientId;
    }

    public ArrayList<Producto> getProductosAVender() {
        return productosAVender;
    }

    public char getTipoDeFacura() {
        return TipoDeFacura;
    }

    public Boolean getFinalizada() {
        return finalizada;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setTipoDeFacura(char Tipo) {
        if(Tipo != 'A' || Tipo != 'B'|| Tipo != 'C') //????
            System.err.println("Error al setear tipo de factura.");
        else    
            this.TipoDeFacura = TipoDeFacura;
    }

    public void setFinalizada(Boolean finalizada) {
        this.finalizada = finalizada;
    }

    public void setVendedor(String Vendedor) {
        if(Vendedor != null)
            this.Vendedor = Vendedor;
        else 
            System.err.println("Se intenta ingresar un vendedor SIN NOMBRE");
    }
    
}
