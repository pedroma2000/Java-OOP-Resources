/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.enums;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public enum Material {
    
    /**
     *tipo de material
     */
    CARBONO,

    /**
     *tipo de material
     */
    ALUMINIO,

    /**
     * sem tipo de material
     */
    SEM;
    
    /**
     * enum para tipo de material
     * @param tipo material
     * @return material
     */
    public static String MaterialToString(Material tipo){
       
        switch(tipo){
            case CARBONO:
                return "Bicicleta Feita de Carbono";
            case ALUMINIO:
                return "Bicicleta Feita de Aluminio";
            default:
                return "Material Invalido";
        }
    }
    
}
