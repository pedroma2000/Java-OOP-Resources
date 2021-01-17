/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public enum Genero {

    /**
     * Genero Masculino
     */
    MASCULINO,

    /**
     * Genero Feminino
     */
    FEMININO;
    
    /**
     * Metodo que retorna uma String como genero
     * @param gen
     * @return
     */
    public static String GeneroToString(Genero gen){
        switch(gen){
            case MASCULINO:
                return "Macho";
            case FEMININO:
                return "Femea";
            default:
                return "Error";
        }
    }
}
