/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.Ingredients;

import pp_fp06.PizzaRestaurant.enums.IngredientMeasureUnits;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Ingredient {

    private int id;
    private String name;
    private IngredientMeasureUnits measureUnit;
    private float calories;

    Ingredient() {

    }
    
    

    public Ingredient(int id, String name, IngredientMeasureUnits measureUnit, float calories) {
        this.id = id;
        this.name = name;
        this.measureUnit = measureUnit;
        this.calories = calories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IngredientMeasureUnits getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(IngredientMeasureUnits measureUnit) {
        this.measureUnit = measureUnit;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        String text = "";

        text += "ID : " + id + "\n";
        text += "Nome : " + name + "\n";
        text += "Unidade de Media : " + measureUnit + "\n";
        text += "Calorias : " + calories + "\n";

        return text;
    }
    
    
    
    public static void ListToString(Ingredient[] list) {

        System.out.println("LISTA");
        for (int i = 0; i < list.length; i++) {
            System.out.println("ID : " + list[i].id);
            System.out.println("Nome : " + list[i].name);
            System.out.println("Unidade de Media : " + list[i].measureUnit);
            System.out.println("Calorias : " + list[i].calories);
        }

    }

}
