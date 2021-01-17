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
public enum PizzaType {

    /**
     *
     */
    MEAT,

    /**
     *
     */
    SEAFOOD,

    /**
     *
     */
    VEGETABLE;
    
    /**
     *
     * @param type
     * @return
     */
    public static String IPizzaTypeToString(PizzaType type){
        switch(type){
            case MEAT:
                return "Pizza de carne.";
            case SEAFOOD:
                return "Pizza do mar";
            case VEGETABLE:
                return "Pizza vegetariana";
            default:
                return "Tipo inválido";
        }
    }
    
}
