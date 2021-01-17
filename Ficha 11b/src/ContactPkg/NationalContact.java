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
public class NationalContact extends Contact {

    /**
     *
     * @param name
     * @param surName
     * @param phoneNmbr
     * @throws MultipleWordsException
     * @throws NotCapitalCharException
     * @throws NumberLengthException
     */
    public NationalContact(String name, String surName, String phoneNmbr) throws MultipleWordsException,
            NotCapitalCharException,
            NumberLengthException {
        super(name, surName, phoneNmbr);

    }

    @Override
    public String toString() {
        String text = "";
        text += super.toString();
        return text;
    }

}
