package Gestao;

import enums.EstadoReserva;
import enums.Servicos;
import java.time.LocalDateTime;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class reserva extends containerofobjectsapi.ContainerOfObjects {

    private LocalDateTime date;
    private int id;
    private String dono;
    private Animal animal;
    private EstadoReserva estado;
    
    /**
     * 
     * @param date
     * @param id
     * @param dono
     * @param animal
     * @param estado 
     */
    public reserva(LocalDateTime date, int id, String dono, Animal animal,
            EstadoReserva estado) {
        super(10);
        this.date = date;
        this.id = id;
        this.dono = dono;
        this.animal = animal;
        this.estado = estado;
    }
    
    /**
     * 
     * @param s
     * @return 
     */
    public boolean addService(Servicos s) {
        return super.addObject(s);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String text = " ";

        text += "ID : " + id + "\n";
        text += "Data : " + date + "\n";
        text += "dono : " + dono + "\n";
        text += "animal : " + animal + "\n";
        text += "Estado : " + EstadoReserva.ReservaToString(estado) + "\n";

        return text;
    }

    /**
     *
     * @return
     */
    public EstadoReserva getEstado() {
        return estado;
    }

    /**
     *
     * @param estado
     */
    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

}
