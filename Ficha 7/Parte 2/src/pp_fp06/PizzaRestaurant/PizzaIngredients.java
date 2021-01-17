/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant;

import pp_fp06.PizzaRestaurant.Ingredients.Ingredient;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class PizzaIngredients {
    private Ingredient ingredient;
    private float quantity;

    public PizzaIngredients(Ingredient ingredient, float quantity) {
        this.ingredient = ingredient;
        this.quantity = quantity;
    }
    
     @Override

    public String toString(){
        String text = ingredient.toString();
        return text;
    }
}
