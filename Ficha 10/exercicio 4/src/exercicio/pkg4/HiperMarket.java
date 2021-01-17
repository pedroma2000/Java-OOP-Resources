/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg4;

import Interfaces.HipermarketService;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class HiperMarket extends  Supermarket implements HipermarketService {
    private double coffeePrice;
    private double gasPrice;
    private double aRate;

    public HiperMarket(double coffeePrice, double gasPrice, 
                       double aRate, double potatoPrice, String name, int vatNumber) {
        super(potatoPrice, name, vatNumber);
        this.coffeePrice = coffeePrice;
        this.gasPrice = gasPrice;
        this.aRate = aRate;
    }
    
    
    
    @Override
    public double getCoffeePrice() {
        return coffeePrice;
    }

    @Override
    public void setCoffeePrice(double p) {
       coffeePrice = p;
    }

    @Override
    public double getCoffeeTotal(int coffees) {
        double total;
        total = coffees * coffeePrice;
        return total;
    }

    @Override
    public double getAnnualRate() {
        return aRate;
    }

    @Override
    public void setAnnualRate(double r) {
        aRate = r;
    }

//    @Override
//    public double computeMonthlyPayment(double ammount, int months) {
//        double monthlyRate;
//        double payment;
//        
//        monthlyRate = (Math.pow(1 + aRate, 1/12) - 1);
//        payment = ((monthlyRate * ammount) / (1 - Math.pow(1 + monthlyRate, 1/-months)));
//        
//        return payment;
//    }
    
    @Override
    public double computeMonthlyPayment(double ammount, int months) {
        double payment; 
        payment = (ammount * aRate / 12);  
        return payment;
    }

    @Override
    public double getGasPrice() {
        return gasPrice;
    }

    @Override
    public void setGasPrice(double p) {
        gasPrice = p;
    }

    @Override
    public double getGasTotal(double litres) {
        double total;
        total = litres * gasPrice;
        return total;
    }

//    @Override
//    public double getPotatoesPrice() {
//        return super.getPotatoesPrice();
//    }
//
//    @Override
//    public void setPotatoesPrice(double p) {
//        potatoePrice = p;
//    }

//    @Override
//    public double getMarketTotal(double kilos) {
//        double total;
//        total = kilos * potatoePrice;
//        return total;
//    }
    
    @Override
    public String toString(){
        String text = "";
        
        text += super.toString();
        text += "Coffee Price : " + coffeePrice + " €" + "\n";
        text += "Gas Price : " + gasPrice + " €" + "\n";
        text += "Anual Rate : " + aRate + "%" + "\n";
        
        return text;
    }
    
}
