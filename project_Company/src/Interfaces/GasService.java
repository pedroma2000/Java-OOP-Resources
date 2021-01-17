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
public interface GasService {

    /**
     * Metodo que retorna o preco do combustivel
     * @return
     */
    public double getGasPrice();

    /**
     * Metodo que define o preco do combustivel
     * @param p
     */
    public void setGasPrice(double p);

    /**
     * Metodo que calcula o preco total de combustivel
     * @param litres
     * @return
     */
    public double getGasTotal(double litres);

}
