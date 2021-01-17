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
public enum SeafoodType {
    CAMARAO, LAGOSTA;
    
    public static String SeafoodTypeToString(SeafoodType type) {
        switch (type) {
            case CAMARAO:
                return "Camarao";
            case LAGOSTA:
                return "Lagosta";
            default:
                return "Ingrediente do mar invalido";
        }
    }
}
