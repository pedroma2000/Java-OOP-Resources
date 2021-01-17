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
public enum VegetableType {
    TOMATE, CEBOLA, COGUMELOS;
    
    public static String VegetableTypeToString(VegetableType type) {
        switch (type) {
            case TOMATE:
                return "Tomate";
            case CEBOLA:
                return "Cebola";
            case COGUMELOS:
                return "Cogumelos";
            default:
                return "Vegetal invalido";
        }
    }
}
