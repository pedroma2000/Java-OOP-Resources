/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestReserva;

import Enums.EstadoReserva;
import Interfaces.ReservaFunctions;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class GestorReservas extends containerofobjectsapi.ContainerOfObjects
        implements ReservaFunctions {

    /**
     * Metodo de adicionar Reservas
     * @param r
     * @return
     */
    @Override
    public boolean addreserva(Reserva r) {
        return super.addObject(r);
    }

    /**
     * Metodo de Remover Reservas
     * @param r
     * @return
     */
    @Override
    public Reserva removeReserva(Reserva r) {
        int pos = super.findObject(r);
        return (Reserva) super.removeObject(pos);
    }

    /**
     * Metodo de Imprimir todas as reservas
     * @param list
     */
    @Override
    public void PrintAllRes(Reserva[] list) {
        super.printall();
    }

    /**
     * Metodo de validar reservas
     * @param r
     * @return
     */
    @Override
    public String ValidateRes(Reserva r) {
        int a;
        a = super.findObject(r);
        if (a != -1) {
            r.setEstado(EstadoReserva.CONCLUIDO);
            super.removeObject(a);
            return "Sucesso";
        } else {
            return "Task Failed Successfully!!";
        }
    }

    /**
     * Metodo que guarda as reservas não concluidas num hitorico
     * @param list
     * @return
     */
    @Override
    public Reserva Historico(Reserva[] list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

