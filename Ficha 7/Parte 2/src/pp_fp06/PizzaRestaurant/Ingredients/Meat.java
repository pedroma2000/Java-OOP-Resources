/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.Ingredients;

import pp_fp06.PizzaRestaurant.enums.IngredientMeasureUnits;
import pp_fp06.PizzaRestaurant.enums.IngredientOrigin;
import pp_fp06.PizzaRestaurant.enums.MeatType;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Meat extends Toping {
    private MeatType type;

    public Meat(MeatType type, IngredientOrigin origin) {
        super(origin);
        this.type = type;
    }

    public Meat(MeatType type, IngredientOrigin origin, int id, 
           String name, IngredientMeasureUnits measureUnit, float calories) {
        super(origin, id, name, measureUnit, calories);
        this.type = type;
    }
    
    
    @Override
    public String toString(){
        String text = "";
        
        text += super.toString();
        text += "tipo : " + type;
        
        return text;
    }
    
    
}
