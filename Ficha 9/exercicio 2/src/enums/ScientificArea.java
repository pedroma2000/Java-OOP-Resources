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
public enum ScientificArea {
    INFORMATICA, BIOMEDICINA;
    
    /**
     * Metodo que imprime a area cientifica
     * @param area
     * @return 
     */
    public static String ScientificAreaToString(ScientificArea area) {
        switch (area) {
            case INFORMATICA:
                return "Informatica";
            case BIOMEDICINA:
                return "Biomedicina";
            default:
                return "error";
        }

    }
    
}
