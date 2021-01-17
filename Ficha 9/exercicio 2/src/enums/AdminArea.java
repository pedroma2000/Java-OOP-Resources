/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public enum AdminArea {
    REC_HUMANOS, SECRETARIA;
    
    /**
     * Metodo que imprime a area de trabalho de admins
     * @param area
     * @return 
     */
    public static String AdminAreaToString(AdminArea area) {
        switch (area) {
            case REC_HUMANOS:
                return "Recursos humanos";
            case SECRETARIA:
                return "Secretaria";
            default:
                return "error";
        }

    }
}
