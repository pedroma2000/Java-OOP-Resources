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
public enum PizzaBase {
    MASSA_ALTA, MASSA_FINA;
    
    public static String PizzaBaseToString(PizzaBase base){
        switch(base){
            case MASSA_ALTA:
                return "A base e de massa alta.";
            case MASSA_FINA:
                return "A base e de massa fina. ";
            default:
                return "Base invalida";
        }
    }
}
