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
public enum PorteCao {

    /**
     * cao pequeno
     */
    PEQUENO,

    /**
     * cao medio
     */
    MEDIO,

    /**
     * cao grande
     */
    GRANDE;
    
    /**
     * Metodo que retorna uma string com o porte do cao
     * @param port
     * @return
     */
    public static String PorteToString(PorteCao port) {
        switch (port) {
            case PEQUENO:
                return "Cao Pequeno";
            case MEDIO:
                return "Cao Medio";
            case GRANDE:
                return "Cao Grande";
            default:
                return "Error";
        }
    }
}
