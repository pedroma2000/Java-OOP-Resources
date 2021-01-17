/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp04.exchange;

/**
 *
 * @author Jorge Moreira
 */
public class Expenses {

    private static final int NUMBER_OF_DAYS = 31;

    private static int number1;

    private static double[] carValues = new double[NUMBER_OF_DAYS];
    private static char[] descriptionCar = new char[]{'C', 'A', 'R'};

    private static int number2;
    private static double[] foodValues = new double[NUMBER_OF_DAYS];
    private static char[] descriptionFood = new char[]{'F', 'O', 'O', 'D'};

    private static double soma = 0;
    private static double media = 0;
    private static int indices = 0;

    public void setVar(double soma, double media, int indices) {
        this.soma = soma;
        this.media = media;
        this.indices = indices;
    }

    public static double getSoma() {
        return soma;
    }

    public static void setSoma(double soma) {
        Expenses.soma = soma;
    }

    public static double getMedia() {
        return media;
    }

    public static void setMedia(double media) {
        Expenses.media = media;
    }
    
    
    public static void costCar() {
        
        double[] values;
        values = getCarValues();
        soma = 0;
        media = 0;
        indices = 0;
        
        for (int i = 0; i < values.length; i++) {
            if (values[i] != 0.0) {
                soma += values[i];
                indices++;
            }
        }
        
        media = soma / indices;

    }
    
    public static void costFood() {
        
        double[] values;
        values = getFoodValues();
        soma = 0;
        media = 0;
        indices = 0;
        
        for (int i = 0; i < values.length; i++) {
            if (values[i] != 0.0) {
                soma += values[i];
                indices++;
            }
        }
        
        media = soma / indices;

    }

    //set get expenses number 1
    public static int getNumber1() {
        return number1;
    }

    public static void setNumber1(int number1) {
        Expenses.number1 = number1;
    }

    //set get car values
    public static double[] getCarValues() {
        return carValues;
    }

    public static void setCarValues(double carValues, int position) {
        Expenses.carValues[position] = carValues;
    }

    //set get car description
    public static char[] getDescriptionCar() {
        return descriptionCar;
    }

    public static void setDescriptionCar(char[] descriptionCar) {
        Expenses.descriptionCar = descriptionCar;
    }

    //set get expenses number 2
    public static int getNumber2() {
        return number2;
    }

    public static void setNumber2(int number2) {
        Expenses.number2 = number2;
    }

    //set get food expenses description
    public static char[] getDescriptionFood() {
        return descriptionFood;
    }

    public static void setDescriptionFood(char[] descriptionFood) {
        Expenses.descriptionFood = descriptionFood;
    }

    //setget food values
    public static double[] getFoodValues() {
        return foodValues;
    }

    public static void setFoodValues(double foodValues, int position) {
        Expenses.foodValues[position] = foodValues;
    }

}
