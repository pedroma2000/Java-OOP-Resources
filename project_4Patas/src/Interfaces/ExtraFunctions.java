/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import GestReserva.Reserva;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public interface ExtraFunctions {
    
    /**
     * Metodo de validar reservas
     * @param r
     * @return
     */
    public String ValidateRes(Reserva r);
     
    /**
     * Metodo que guarda as reservas não concluidas num hitorico
     * @param list
     * @return
     */
    public Reserva Historico(Reserva list[]);
     
}
