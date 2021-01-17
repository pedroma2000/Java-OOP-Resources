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
public interface GestFucntions {
    
    /**
     * Criar collection
     * @param size
     */
    public void create(int size);
    
    /**
     * adicionar contactos a colection
     * @param c
     */
    public void addContact(Contact c);
    
    /**
     * remover contacto da collection usando o numero de telemovel
     * @param phone
     */
    public void removeContact(String phone);
    
    /**
     * pesquisar por um contacto na colection usando o numero de telemovel
     * @param phone
     */
    public void getContact(String phone);
    
    /**
     * listar todos os contactos
     */
    public void CollectiontoString();
}
