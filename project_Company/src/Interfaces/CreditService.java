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
public interface CreditService {
    
    /**
     * Metodo que retorna a taxa anual
     * @return
     */
    public double getAnnualRate();
    
    /**
     * Metodo que define uma taxa anual
     * @param r
     */
    public void setAnnualRate(double r);
    
    /**
     * Metodo que calcula o pagamento Mensal
     * @param ammount
     * @param months
     * @return
     */
    public double computeMonthlyPayment(double ammount, int months);
    
}
