/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactPkg;

import CustomExceptions.CountryCodeException;
import CustomExceptions.MultipleWordsException;
import CustomExceptions.NotCapitalCharException;
import CustomExceptions.NumberLengthException;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class InternationalContact extends Contact{
    
    private String code;
    private String country;

    /**
     *
     * @param code
     * @param country
     * @param name
     * @param surName
     * @param phoneNmbr
     * @throws MultipleWordsException
     * @throws NotCapitalCharException
     * @throws NumberLengthException
     * @throws CountryCodeException
     */
    public InternationalContact(String code, String country, String name, String surName, String phoneNmbr) throws 
            MultipleWordsException, NotCapitalCharException, NumberLengthException, CountryCodeException {
        super(name, surName, phoneNmbr);
        
        if (!code.startsWith("00")){
            throw new CountryCodeException("Os primeiros 2 digitos tem de ser 00 ");
        }
        
        for (int i = 0; i < country.length(); i++) {
            if (country.charAt(i) == ' ') {
                if (country.charAt(i + 1) != ' ') {
                    throw new MultipleWordsException("O nome tem mais de uma palavra!!");
                }
            }
        }
        
        this.code = code;
        this.country = country;
    }  
    
    @Override
    public String toString() {
        String text = "";
        text += super.toString();
        text += "Pais : " + country + "\n";
        text += "Codigo : " + code + "\n";
        return text;
    }

    
}
