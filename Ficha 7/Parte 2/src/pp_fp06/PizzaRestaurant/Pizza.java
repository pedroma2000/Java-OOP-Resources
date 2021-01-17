package pp_fp06.PizzaRestaurant;

import pp_fp06.PizzaRestaurant.Ingredients.Base;
import pp_fp06.PizzaRestaurant.Ingredients.Cheese;
import pp_fp06.PizzaRestaurant.Ingredients.Ingredient;
import pp_fp06.PizzaRestaurant.Ingredients.Meat;
import pp_fp06.PizzaRestaurant.Ingredients.Seafood;
import pp_fp06.PizzaRestaurant.Ingredients.Vegetable;
import pp_fp06.PizzaRestaurant.enums.PizzaSize;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão <br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação <br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma pizza
 * </p>
 */
public class Pizza {

    private final int MAX_INGREDIENTS = 5;
    private int id;
    private String name;
    private String description;
    private float price;
    private PizzaSize size;
    private int numberOfIngredients;
    private PizzaIngredients[] ingredients = new PizzaIngredients[MAX_INGREDIENTS];
    private Base base;
    private int basecount = 0;
    private int counterTop = 0;
    private int counterBase = 0;
    private int meatType = 0;
    private int vegetalType = 0;
    private int seaFoodType = 0;

    public Pizza(int id, String name, String description, float price, PizzaSize size, int numberOfIngredients) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.size = size;
        this.numberOfIngredients = numberOfIngredients;
    }

    public void addBase(Base base) {
        if (counterBase == 0) {
            this.base = base;
            counterBase += 1;
        } else {
            System.out.println("Ja tem uma base selecionada.");
        }
    }

    public void addTopping(Cheese top, float quantity) {
        if (counterBase == 1) {
            if (counterTop < MAX_INGREDIENTS) {
                Ingredient ingrediente = (Ingredient) top;
                ingredients[counterTop] = new PizzaIngredients(ingrediente, quantity);
                counterTop += 1;
            } else {
                System.out.println("Ja tem 5 ingredientes.");
            }
        } else {
            System.out.println("Ainda não tem uma base selecionada.");
        }
    }

    public void addTopping(Meat top, float quantity) {
        if (counterBase == 1) {
            if (counterTop < MAX_INGREDIENTS) {
                meatType += 1;
                Ingredient ingrediente = (Ingredient) top;
                ingredients[counterTop] = new PizzaIngredients(ingrediente, quantity);
                counterTop += 1;
            } else {
                System.out.println("Ja tem 5 ingredientes.");
            }
        } else {
            System.out.println("Ainda não tem uma base selecionada.");
        }
    }

    public void addTopping(Vegetable top, float quantity) {
        if (counterBase == 1) {
            if (counterTop < MAX_INGREDIENTS) {
                vegetalType += 1;
                Ingredient ingrediente = (Ingredient) top;
                ingredients[counterTop] = new PizzaIngredients(ingrediente, quantity);
                counterTop += 1;
            } else {
                System.out.println("Ja tem 5 ingredientes.");
            }
        } else {
            System.out.println("Ainda não tem uma base selecionada.");
        }
    }

    public void addTopping(Seafood top, float quantity) {
        if (counterBase == 1) {
            if (counterTop < MAX_INGREDIENTS) {
                seaFoodType += 1;
                Ingredient ingrediente = (Ingredient) top;
                ingredients[counterTop] = new PizzaIngredients(ingrediente, quantity);
                counterTop += 1;
            } else {
                System.out.println("Ja tem 5 ingredientes.");
            }
        } else {
            System.out.println("Ainda não tem uma base selecionada.");
        }
    }

    @Override
    public String toString(){
        String text = "--------------------------------------------------------" + "\n"
                + "ID da Pizza : " + id + "\n"
                + "Nome da Pizza : " + name + "\n";       
        if(meatType > 0){
            if( seaFoodType == 0 && vegetalType == 0){
                text += "Tipo de Pizza : Carne" + "\n"; 
            }else {
                text += "Tipo de Pizza : Mixed" + "\n";
            }
        }else if( vegetalType > 0){
            if( seaFoodType == 0 && meatType == 0){
                text += "Tipo de Pizza : Vegetal" + "\n"; 
            }else {
                text += "Tipo de Pizza : Mixed" + "\n";
            }
        }else if(seaFoodType > 0){
            if( vegetalType == 0 && meatType == 0){
                text += "Tipo de Pizza : Peixe" + "\n"; 
            }else {
                text += "Tipo de Pizza : Mixed" + "\n";
            }
        }
        text += base.toString();
        for(int i = 0; i < counterTop; i++){
            text += "Ingrediente " + (i+1) + " :" + "\n"
                    + ingredients[i].toString();
        }
        return text;

    }

}
