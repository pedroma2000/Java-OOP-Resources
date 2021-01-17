/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomExceptions;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class CountryCodeException extends Exception{

    /**
     *
     * @param message
     */
    public CountryCodeException(String message) {
        super(message);
    }    
}
