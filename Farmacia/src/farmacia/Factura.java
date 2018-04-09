/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Alex3D
 */
public class Factura {
    private int nroFactura;
    private LocalDateTime fechaFactura;
    private char TipoDeFactura; //factura A(ri a Ri con ivaDiscr), b(ri a cf, exento, monotributista) o C(no importa condicion Vendedor, comprador)
    private String Vendedor;
    private Integer clientId; //No sabemos q va a ser aun
    private ArrayList<Mercaderia> productosFactura;//// aca no se si es mercaderia, 
    private Boolean finalizada; //representaria si esta en proseso o si ya se puede "guardar"

    public Factura(Integer clientId, char TipoDeFacura, String Vendedor) {
        this.clientId = clientId;
        this.TipoDeFactura = TipoDeFacura;
        this.Vendedor = Vendedor;
        this.finalizada=false;
        ArrayList<Producto> p = new ArrayList<>();
        this.productosFactura = p;
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
