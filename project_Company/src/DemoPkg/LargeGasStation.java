/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoPkg;

import Interfaces.CoffeeService;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class LargeGasStation extends GasStation implements CoffeeService{
    private double coffeePrice;

    /**
     *
     * @param coffeePrice
     * @param gasPrice
     * @param name
     * @param vatNumber
     */
    public LargeGasStation(double coffeePrice, double gasPrice, String name, int vatNumber) {
        super(gasPrice, name, vatNumber);
        this.coffeePrice = coffeePrice;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getCoffeePrice() {
       return coffeePrice;
    }

    /**
     *
     * @param p
     */
    @Override
    public void setCoffeePrice(double p) {
        coffeePrice = p;
    }

    /**
     *
     * @param coffees
     * @return
     */
    @Override
    public double getCoffeeTotal(int coffees) {
       double total;
       total = coffeePrice * coffees;
       return total;
    }
    
    @Override
    public String toString(){
        String text = super.toString();
        text += "Preco de Cafe :"+coffeePrice+" €"+"\n";
        return text;
    }
    
}
