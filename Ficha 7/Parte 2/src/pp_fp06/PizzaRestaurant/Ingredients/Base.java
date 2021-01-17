/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.Ingredients;

import pp_fp06.PizzaRestaurant.enums.IngredientMeasureUnits;
import static pp_fp06.PizzaRestaurant.enums.IngredientMeasureUnits.*;
import pp_fp06.PizzaRestaurant.enums.PizzaBase;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Base extends Ingredient {
    private PizzaBase type;
    private String description;

    public Base(PizzaBase type, String description, int id, String name, IngredientMeasureUnits measureUnit, float calories) {
        super(id, name, measureUnit, calories);
        this.type = type;
        this.description = description;
    }

    

    public Base(PizzaBase type, String description, int id, 
           String name, float calories) {
        super(id, name, GRAMAS, calories);
        this.type = type;
        this.description = description;
    }

    public PizzaBase getType() {
        return type;
    }

    public void setType(PizzaBase type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String ToString(){
        String text = "";
        
        text += super.toString();
        text += "Tipo : " + type + "\n";
        text += "Descricao : " + description + "\n";
        
        return text;            
    }
    
    
    
}
