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
public enum AcademicDegree {
    LICENCIATURA, MESTRADO, DOUTORAMENTO;

    
    /**
     * Método que imprime o grau academico
     * @param degree
     * @return 
     */
    public static String AcademicDegreeToString(AcademicDegree degree) {
        switch (degree) {
            case LICENCIATURA:
                return "Licenciatura";
            case MESTRADO:
                return "Mestrado";
            case DOUTORAMENTO:
                return "Doutoramento";
            default:
                return "error";
        }

    }
}
