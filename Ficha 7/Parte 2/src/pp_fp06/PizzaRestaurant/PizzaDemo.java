/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant;

import pp_fp06.PizzaRestaurant.Ingredients.Base;
import pp_fp06.PizzaRestaurant.Ingredients.Cheese;
import pp_fp06.PizzaRestaurant.Ingredients.Meat;
import static pp_fp06.PizzaRestaurant.enums.CheeseType.SERRA;
import static pp_fp06.PizzaRestaurant.enums.IngredientMeasureUnits.*;
import static pp_fp06.PizzaRestaurant.enums.IngredientOrigin.*;
import pp_fp06.PizzaRestaurant.enums.MeatType;
import static pp_fp06.PizzaRestaurant.enums.PizzaBase.*;
import static pp_fp06.PizzaRestaurant.enums.PizzaSize.BIG;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class PizzaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Toping top1 = new Toping(NACIONAL, 1, "Bife", GRAMAS, 123);
        Base b1 = new Base(MASSA_ALTA, "Massa Feita a mao", 2, "Massa", 1234);
        Cheese top2 = new Cheese(SERRA, NACIONAL, 1, "Queijo da Serra", GRAMAS, 300);
        Meat top3 = new Meat(MeatType.VACA, NACIONAL, 2, "DONT KNOW", GRAMAS, 400);
        Pizza n1 = new Pizza(0, "Pizza 1", "A good Pizza", 0, BIG, 0);

//        System.out.println(top1.toString());
//        System.out.println(b1.ToString());
        
//        Ingredient[] list1 = {new Toping(NACIONAL, 1, "Bife", GRAMAS, 123),
//            new Base(MASSA_ALTA, "Massa Feita a mao", 2, "Massa", 1234)};
//
//        //Ingredient.ListToString(list1);
        
        Pizza P1 = new Pizza(1, "Frist Pizza", "A good Pizza", (float) 23.01, BIG, 0);
//        P1.addBase(list1, b1, 0);

        n1.addBase(b1);
        n1.addTopping(top2, 200);
        n1.addTopping(top2, 200);
        n1.addTopping(top3, 200);
        n1.addTopping(top3, 200);
        n1.addTopping(top2, 200);

        System.out.println(n1.toString());
        
        
        
        
    }

}
