/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoPkg;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Company {
    private String name;
    private int vatNumber;
    
    /**
     * Default Company constructor
     * 
     */
    public Company(){   
    }
    
    /**
     * Metodo construtor de uma company
     * @param name
     * @param vatNumber
     */
    public Company(String name, int vatNumber) {
        this.name = name;
        this.vatNumber = vatNumber;
    }
    
    /**
     * Metodo que retorna o nome de uma company
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo que define o nome de uma company
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo que retorna o numero de contrinuinte de uma company
     * @return
     */
    public int getVatNumber() {
        return vatNumber;
    }

    /**
     * Metodo que define o numero contribuinte de uma company
     * @param vatNumber
     */
    public void setVatNumber(int vatNumber) {
        this.vatNumber = vatNumber;
    }
    
    
}
