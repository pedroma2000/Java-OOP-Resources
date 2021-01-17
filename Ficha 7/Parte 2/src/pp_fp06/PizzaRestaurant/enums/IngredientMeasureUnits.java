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
public enum IngredientMeasureUnits {
    GRAMAS, LITROS, UNIDADES;

    public static String measureUnitToString(IngredientMeasureUnits measureUnit) {
        switch (measureUnit) {
            case GRAMAS:
                return "Gramas";
            case LITROS:
                return "Litros";
            case UNIDADES:
                return "Unidades";
            default:
                return "Medida Inválida";
        }
    }

}
