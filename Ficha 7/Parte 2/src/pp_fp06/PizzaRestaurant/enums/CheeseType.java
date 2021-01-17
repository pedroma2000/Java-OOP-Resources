/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.enums;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public enum CheeseType {
    MOZZARELA, SERRA;
    
    public static String CheeseTypeToString(CheeseType type) {
        switch (type) {
            case MOZZARELA:
                return "Queijo Mozzarela";
            case SERRA:
                return "Queijo da Serra";
            default:
                return "Queijo Inválido";
        }
    }
}
