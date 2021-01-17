/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactPkg;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class GestContact implements GestFucntions {

    private Contact collection1[];
    private int counter = 0;

    /**
     * metodo construtor da gestao
     */
    public GestContact() {
    }

    /**
     * Criar uma collection
     *
     * @param size
     */
    @Override
    public void create(int size) {
        collection1 = new Contact[size];
    }

    /**
     * adicionar um contacto
     *
     * @param c
     */
    @Override
    public void addContact(Contact c) {

        for (int i = 0; i <= collection1.length; i++) {
            if (collection1[i] == null) {
                collection1[i] = c;
                counter++;
                return;
            }
        }

    }

    /**
     * remover um contacto
     *
     * @param phone
     */
    @Override
    public void removeContact(String phone) {
        int index = 0;
        for (int i = 0; i < counter; i++) {
            if (collection1[i].getPhoneNmbr().equals(phone)) {
                index = i;
            }
        }
        collection1[index] = null;
        for (int i = index; i < (counter - 1); i++) {
            collection1[i] = collection1[i + 1];

        }
        counter -= 1;
        collection1[counter] = null;
    }

    /**
     * metodo que retorna um objeto de contacto usando um numero de telemovel
     */
//    public Contact getContact(String phone) {
//        for(int i = 0; i < counter; i++){
//            if (collection1[i].getPhoneNmbr().equals(phone)) {
//                return collection1[i];
//            }
//        }
//        
//        return null;
//    }
    /**
     * Retorna um contacto usando um numero de telemovel
     * @param phone 
     */
    @Override
    public void getContact(String phone) {
        for (int i = 0; i < counter; i++) {
            if (collection1[i].getPhoneNmbr().equals(phone)) {
                System.out.println(collection1[i].toString());
            }
        }
    }
    
    /**
     * Retorna todos os contactos internacionais de um nome
     * @param name 
     */
    public void getInternationalContactByName(String name){
        for (int i = 0; i < counter; i++) {
            if (collection1[i] instanceof InternationalContact && collection1[i].getName().equals(name)) {
                System.out.println(collection1[i].toString());
            }
        }
    }

    /**
     * Fazer a listagem de todos os contactos
     */
    @Override
    public void CollectiontoString() {
        for (int i = 0; i < counter; i++) {
            System.out.println(collection1[i].toString());
        }
    }

}
