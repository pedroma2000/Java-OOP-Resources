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
public enum EstadoReserva {

    /**
     * Reserva conlcuida
     */
    CONCLUIDO,

    /**
     * Reserva nao concluida
     */
    NAO_CONCLUIDO,

    /**
     * Reserva em processamento
     */
    EM_PROCESSAMENTO;

    /**
     * Metodo que retorna uma string com o estado da reserva
     * @param res
     * @return
     */
    public static String ReservaToString(EstadoReserva res) {
        switch (res) {
            case CONCLUIDO:
                return "Reserva concluida";
            case NAO_CONCLUIDO:
                return "Reserva não Concluida";
            case EM_PROCESSAMENTO:
                return "Reserva a ser processada";
            default:
                return "Error";
        }
    }
}
