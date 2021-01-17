/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant;
import pp_fp06.PizzaRestaurant.enums.Ingredient;
import pp_fp06.PizzaRestaurant.enums.PizzaSize;
import static pp_fp06.PizzaRestaurant.enums.TipoIngredient.*;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class PizzaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ingredient[] Inglist1 = {new Ingredient("Tomate", 12, VEGETAL),
                                new Ingredient("Chouriças", 16, ANIMAL),
                                new Ingredient("Cenoura", 12, ANIMAL),
                                new Ingredient("Queijo", 13, ANIMAL)};
        
        Ingredient[] Inglist2 = {new Ingredient("Tomate", 12, ANIMAL),
                                new Ingredient("Chouriças", 16, ANIMAL)};
        
        Ingredient[] Inglist3 = {new Ingredient("Alface", 18, VEGETAL),
                                new Ingredient("Couves", 17, VEGETAL)};
        
        
        Pizza p1 = new Pizza(1, "Pizza Miguel", "O MiGUEL fez a Pizza", Inglist1, 4, PizzaSize.BIG);
        Pizza p2 = new Pizza(2, "Pizza Jorge", "O Jorge fez a Pizza", Inglist2, 2, PizzaSize.MEDIUM);
        Pizza p3 = new Pizza(3, "Macarena", Inglist3, 2, PizzaSize.BIG);
        
        Pizza[] Pizzalist1 = {new Pizza(1, "Pizza Miguel", "O MiGUEL fez a Pizza", Inglist1, 4, PizzaSize.BIG),
                              new Pizza(2, "Pizza Jorge", "O Jorge fez a Pizza", Inglist2, 2, PizzaSize.MEDIUM)};
        
        Ementa ementa1 = Ementa.returnInstance(Pizzalist1);
//        
//        p2.PrintPizza();
//        p1.PrintPizza();
//        
//        System.out.println("-------------");
//        
//        System.out.println(p3.getDescription());
//        
//        System.out.println("-------------");
//        p3.removerIngrediente(16);
//        
//        System.out.println("-------updated p3------");
//        
//        System.out.println(p3.getDescription());

        ementa1.printEmenta();

       
        
    }
   
    
    
}
