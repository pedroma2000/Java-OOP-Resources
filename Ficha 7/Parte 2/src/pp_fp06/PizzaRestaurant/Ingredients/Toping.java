/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.Ingredients;

import pp_fp06.PizzaRestaurant.enums.IngredientMeasureUnits;
import pp_fp06.PizzaRestaurant.enums.IngredientOrigin;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Toping extends Ingredient {
    private IngredientOrigin origin;

    public Toping(IngredientOrigin origin) {
        this.origin = origin;
    }

    public Toping(IngredientOrigin origin, int id, 
           String name, IngredientMeasureUnits measureUnit, float calories) {
        super(id, name, measureUnit, calories);
        this.origin = origin;
    }

    public IngredientOrigin getOrigin() {
        return origin;
    }

    public void setOrigin(IngredientOrigin origin) {
        this.origin = origin;
    }
    
    @Override
    public String toString(){
        String text = "";
        
        text += super.toString() ;
        text += "Origem : " + origin + "\n";
        
        
        return text;
    }
    
    
}
