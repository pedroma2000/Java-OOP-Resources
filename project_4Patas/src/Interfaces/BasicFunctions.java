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
public interface BasicFunctions {
    
    /**
     * Metodo de adicionar Reservas
     * @param r
     * @return
     */
    public boolean addreserva(Reserva r);
    
    /**
     * Metodo de Remover Reservas
     * @param r
     * @return
     */
    public Reserva removeReserva(Reserva r);
    
    /**
     * Metodo de Imprimir todas as reservas
     * @param list
     */
    public void PrintAllRes(Reserva[] list);
}
