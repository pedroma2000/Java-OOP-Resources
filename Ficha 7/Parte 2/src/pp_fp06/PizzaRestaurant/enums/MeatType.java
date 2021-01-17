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
public enum MeatType {
    PORCO, VACA, SALAME;
    
    public static String MeatTypeToString(MeatType type) {
        switch (type) {
            case PORCO:
                return "Carne de Porco";
            case VACA:
                return "Carne de Vaca";
            case SALAME:
                return "Salame";
            default:
                return "Queijo Inválido";
        }
    }
    
}
