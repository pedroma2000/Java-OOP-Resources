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
public enum MountainBikeSuspension {

    /**
     * suspension type
     */
    SIMPLES,

    /**
     * suspension type
     */
    DUPLA,

    /**
     *  no suspension type
     */
    SEM;

    /**
     * Enumeração para escolher suspension de MountainBike
     * @param tipo de suspension
     * @return tipo de suspension
     */
    public static String MountainBikeSuspensionToString(MountainBikeSuspension tipo) {

        switch (tipo) {
            case SIMPLES:
                return "Suspensao simples";
            case DUPLA:
                return "suspensao dupla";
            default:
               return "sem suspensão"; 
        }
    }

}
