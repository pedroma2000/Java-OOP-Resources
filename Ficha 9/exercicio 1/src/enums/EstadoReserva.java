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
 */
public enum EstadoReserva {
    PROGRESSO, CONCLUIDO;

    public static String ReservaToString(EstadoReserva res) {
        switch (res) {
            case PROGRESSO:
                return "Em Progresso.";
            case CONCLUIDO:
                return "Concluido";
            default:
                return "Error";
        }
    }
}
