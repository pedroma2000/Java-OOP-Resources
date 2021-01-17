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
public enum StudentType {
    TRABALHADOR_ESTUDANTE, ESTUDANTE_NORMAL;
    
    /**
     * Metodo que imprime o tipo de estudante
     * @param type
     * @return 
     */
    public static String StudentTypeToString(StudentType type) {
        switch (type) {
            case TRABALHADOR_ESTUDANTE:
                return "Trabalhador estudante";
            case ESTUDANTE_NORMAL:
                return "Estudante Normal";
            default:
                return "error";
        }

    }
    
    
}
