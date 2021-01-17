/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoPkg;

import Interfaces.GasService;

/**
 * Classe GasStation
 *
 * @author Pedro Machado "pedroma2000"
 */
public class GasStation extends Company implements GasService{
    private double gasPrice;

    /**
     * Metodo construtor de uma GasStation
     * @param gasPrice
     * @param name
     * @param vatNumber
     */
    public GasStation(double gasPrice, String name, int vatNumber) {
        super();
        super.setName(name);
        super.setVatNumber(vatNumber);
        this.gasPrice = gasPrice;
    }

    @Override
    public double getGasPrice() {
        return gasPrice;
    }

    @Override
    public void setGasPrice(double p) {
         if (p > 0) {
            gasPrice = p;
        }
    }

    @Override
    public double getGasTotal(double litres) {
        double total;
        total = litres * gasPrice;
        return total;
    }
    
    @Override
    public String toString(){
        
        String text = "Nome : "+super.getName()+"\n";
        text += "Numero de Contribuinte : "+super.getVatNumber()+"\n";
        text +="Preco combustivel : "+gasPrice+" €"+"\n";
        
        return text;
    }
    

    

    

   

    
    
}
