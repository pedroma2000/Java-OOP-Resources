/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoPkg;

import Interfaces.MarketService;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Supermarket extends Company implements MarketService {

    private double potatoePrice;

    /**
     *
     * @param potatoePrice
     * @param name
     * @param vatNumber
     */
    public Supermarket(double potatoePrice, String name, int vatNumber) {
        super();
        super.setName(name);
        super.setVatNumber(vatNumber);
        this.potatoePrice = potatoePrice;
    }

    
    @Override
    public double getPotatoesPrice() {
        return potatoePrice;
    }

    
    @Override
    public void setPotatoesPrice(double p) {
        potatoePrice = p;
    }

    
    @Override
    public double getMarketTotal(double kilos) {
        double total;
        total = kilos * potatoePrice;
        return total;
    }
    
    @Override
    public String toString(){
        String text = "Nome : "+super.getName()+"\n";
        text += "Numero de Contribuinte : "+super.getVatNumber()+"\n";
        text += "Preco das batatas"+potatoePrice+" €"+"\n";
        return text;
    } 
    
    
    
}
