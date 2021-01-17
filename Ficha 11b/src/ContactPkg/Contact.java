/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactPkg;

import CustomExceptions.MultipleWordsException;
import CustomExceptions.NotCapitalCharException;
import CustomExceptions.NumberLengthException;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Contact {

    private String name;
    private String surName;
    private String phoneNmbr;

    /**
     * Metodo construtor de contacto
     * @param name
     * @param surName
     * @param phoneNmbr
     * @throws MultipleWordsException
     * @throws NotCapitalCharException
     * @throws NumberLengthException
     */
    public Contact(String name, String surName, String phoneNmbr) throws
            MultipleWordsException, NotCapitalCharException, NumberLengthException {

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                if (name.charAt(i + 1) != ' ') {
                    throw new MultipleWordsException("O nome tem mais de uma palavra!!");
                }
            }
        }

        for (int i = 0; i < surName.length(); i++) {
            if (surName.charAt(i) == ' ') {
                if (surName.charAt(i + 1) != ' ') {
                    throw new MultipleWordsException("O Apelido tem mais de uma palavras!!");
                }
            }
        }

        if (!Character.isUpperCase(name.charAt(0))) {
            throw new NotCapitalCharException("O primeiro caracter do nome não é maiusculo");
        }

        if (!Character.isUpperCase(surName.charAt(0))) {
            throw new NotCapitalCharException("O primeiro caracter do Apelido não é maiusculo");
        }
        
        if(phoneNmbr.length() > 9){
            throw new NumberLengthException("O numero tem mais de 9 digitos");
        }
        

        this.name = name;
        this.phoneNmbr = phoneNmbr;
        this.surName = surName;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getPhoneNmbr() {
        return phoneNmbr;
    }

    /**
     *
     * @param phoneNmbr
     */
    public void setPhoneNmbr(String phoneNmbr) {
        this.phoneNmbr = phoneNmbr;
    }
    
    

    @Override
    public String toString() {
        String text = "";
        text += "Nome : " + name + "\n";
        text += "Apelido : " + surName + "\n";
        text += "Numero : " + phoneNmbr + "\n";
        return text;
    }

}
