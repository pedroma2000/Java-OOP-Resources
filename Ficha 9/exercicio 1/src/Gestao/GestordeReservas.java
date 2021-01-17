package Gestao;

import enums.EstadoReserva;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class GestordeReservas extends containerofobjectsapi.ContainerOfObjects {
    
    /**
     * 
     * @param list 
     */
    public GestordeReservas(reserva[] list) {
        super(list);
    }
    
    /**
     * 
     * @param r
     * @return 
     */
    public boolean addreserva(reserva r) {
        if (super.hasObject(r)) {
            return false;
        } else {
            return super.addObject(r);
        }
    }
    
    /**
     * 
     * @param r
     * @return 
     */
    public reserva removeReserva(reserva r) {
        int pos = super.findObject(r);
        return (reserva) super.removeObject(pos);
    }
    

    /**
     * 
     * @param list 
     */
    public void PrintAllRes(reserva[] list) {
        super.printall();
    }
    
    /**
     * 
     * @param r
     * @return 
     */
    public String ValidateRes(reserva r) {
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

}
