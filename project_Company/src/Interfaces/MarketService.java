/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public interface MarketService {
    
    /**
     * Metodo que retorna o preco das batatas
     * @return
     */
    public double getPotatoesPrice();
    
    /**
     * Metodo que define um preco para as batatas
     * @param p
     */
    public void setPotatoesPrice(double p);
    
    /**
     * Metodo que calcula o preço das batatas
     * @param kilos
     * @return
     */
    public double getMarketTotal(double kilos);
            
}
