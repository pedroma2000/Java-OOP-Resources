/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestReserva;

import Animais.Animal;
import Enums.EstadoReserva;
import static Enums.EstadoReserva.ReservaToString;
import Enums.Servicos;
import static Enums.Servicos.ServicoToString;
import java.time.LocalDateTime;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Reserva extends containerofobjectsapi.ContainerOfObjects{
    private LocalDateTime data;
    private String id;
    private String Dono;
    private Animal animal;
    private EstadoReserva estado;
    private Servicos s;
    
    /**
     * Metodo Construtor de Reservas
     * @param data
     * @param id
     * @param Dono
     * @param animal
     * @param estado
     */
    public Reserva(LocalDateTime data, String id, String Dono, Animal animal, 
            EstadoReserva estado){
        super();
        this.data = data;
        this.id = id;
        this.Dono = Dono;
        this.animal = animal;
        this.estado = estado;
    }

    @Override
    public String toString() {
        String text = "Data : " + data + "\n";
        text += "ID de reserva : " + id + "\n";
        text += "Dono : " + Dono + "\n";
        text += "Estado : " + ReservaToString(estado) + "\n";
        text += "Servico : " + ServicoToString(s) + "\n";
        text += "Animal ---------- " + "\n";
        text += animal.toString();
        return text;
    }
    
    /**
     * Metodo para adicionar um servico
     * @param s
     * @return
     */
    public boolean adServico(Servicos s){
        this.s = s;
        return super.addObject(s);
    }

    /**
     * Metodo que recebe o estado da reserva
     * @return
     */
    public EstadoReserva getEstado() {
        return estado;
    }

    /**
     * Metodo para definir o estado da reserva
     * @param estado
     */
    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }
    
    
    
}
