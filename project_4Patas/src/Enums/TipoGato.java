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
public enum TipoGato {

    /**
     * gato de Interior
     */
    INTERIOR,

    /**
     * gato de Exterior
     */
    EXTERIOR;
    
    /**
     * Metodo para retornar String com o tipo de Gato
     * @param tipo
     * @return
     */
    public static String TipoToString(TipoGato tipo) {
        switch (tipo) {
            case INTERIOR:
                return "Gato de Interior";
            case EXTERIOR:
                return "Gato de exterior";
            default:
                return "Error";
        }
    }
}
