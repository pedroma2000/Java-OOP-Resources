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
public interface CoffeeService {
    
    /**
     * Metodo que retorna o preco do cafe
     * @return
     */
    public double getCoffeePrice();
    
    /**
     * Metodo que define o preco do cafe
     * @param p
     */
    public void setCoffeePrice(double p);
    
    /**
     * metodo que calcula o preço total dos cafes
     * @param coffees
     * @return
     */
    public double getCoffeeTotal(int coffees);
    
}
