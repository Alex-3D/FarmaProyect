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
 * @author ralel
 */
public class Medicine extends Producto {
    private String pharmaceuticalForm;
    private String meansOfAdministration;
    private ArrayList<Ingredient> ingredients;

    public Medicine(String nombre, String origen, String descripcion, BigDecimal valor, int codigo) {
        super(nombre, origen, descripcion, valor, codigo);
        this.ingredients = new ArrayList<Ingredient>();
    }
    public Medicine(String nombre, BigDecimal valor, int codigo){
        super(nombre, "asdjfla", "medicamento prueba", valor, codigo);
        this.ingredients = new ArrayList<Ingredient>();  
    }

    public String getPharmaceuticalForm() {
        return pharmaceuticalForm;
    }

    public String getMeansOfAdministration() {
        return meansOfAdministration;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }
    
    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }
}
