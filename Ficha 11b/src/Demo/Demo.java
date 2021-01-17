/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import ContactPkg.Contact;
import ContactPkg.GestContact;
import ContactPkg.InternationalContact;
import ContactPkg.NationalContact;
import CustomExceptions.CountryCodeException;
import CustomExceptions.MultipleWordsException;
import CustomExceptions.NotCapitalCharException;
import CustomExceptions.NumberLengthException;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            // TODO code application logic here
             Contact cont1 = new InternationalContact("00987", "Angola", "Tiago", "Rodrigues", "910329260");
             Contact cont2 = new InternationalContact("00345", "Islandia","Tiago", "Rodrigues", "923326544");
             Contact cont3 = new NationalContact("Tiago", "Rodrigues", "923326560");
             Contact cont4 = new NationalContact("Samuel", "Cunha", "910329264");
             Contact cont5 = new NationalContact("Marcelo", "Carvalho", "912329260");
             Contact cont6 = new InternationalContact("00351", "Portugal", "Jorge", "Moreira", "910329260");
             //System.out.println(cont5.toString());
             //System.out.println(cont6.toString());
             GestContact g1 = new GestContact();
             g1.create(10);
             g1.addContact(cont5);
             g1.addContact(cont6);
             g1.addContact(cont4);
             g1.addContact(cont3);
             g1.addContact(cont2);
             g1.addContact(cont1);
             g1.removeContact("910329264");
             //g1.removeContact("910329260");
             //g1.removeContact("912329260");
             g1.CollectiontoString();
             System.out.println("-----------test get---------------");
             g1.getContact("910329260");
             System.out.println("-----------test getInterByName---------------");
             g1.getInternationalContactByName("Tiago");
        } catch (MultipleWordsException | NotCapitalCharException | NumberLengthException | CountryCodeException e){
            System.out.println(e.getMessage());
        }
        
        
        
        
    }
    
}
