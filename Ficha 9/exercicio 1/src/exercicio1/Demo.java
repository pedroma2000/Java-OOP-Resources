package exercicio1;

import Gestao.Cao;
import Gestao.Gato;
import Gestao.GestordeReservas;
import Gestao.reserva;
import static enums.EstadoReserva.*;
import static enums.PorteCao.*;
import static enums.Servicos.*;
import static enums.TipoGato.*;
import java.time.LocalDateTime;
import java.time.Month;


/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cao dog1 = new Cao(1, "Fido", "Masculino", 2, MEDIO);
        Cao dog2 = new Cao(2, "Fida", "Feminino", 1, PEQUENO);
        Gato cat1 = new Gato(3, "catcat", "Masculino", 3, INTERIOR);
        Gato cat2 = new Gato(4, "lolcat", "Feminino", 2, EXTERIOR);
//        System.out.println(dog1.toString());
//        System.out.println(dog2.toString());
//        System.out.println(cat1.toString());
//        System.out.println(cat2.toString());
        
        reserva r1 = new reserva(LocalDateTime.of(2019, Month.MARCH, 1, 13, 35), 1, "Jorge", cat1, CONCLUIDO);
        reserva r2 = new reserva(LocalDateTime.of(2019, Month.FEBRUARY, 2, 12, 20), 2, "Marcelo", dog1, PROGRESSO);
        reserva r3 = new reserva(LocalDateTime.of(2019, Month.FEBRUARY, 3, 9, 55), 3, "Miguel", dog2, PROGRESSO);
        reserva r4 = new reserva(LocalDateTime.of(2019, Month.MARCH, 4, 21, 20), 3, "Nigga", cat2, PROGRESSO);
        r1.addService(BANHO);
        r1.addService(PASSEIOS);
        r2.addService(ALOJAMENTO);
        r2.addService(TOSQUIA);
        
        reserva[] list1 = {r1, r2, r3};
        reserva[] list2 = {r3, r2, r1};
        
        Gestao.GestordeReservas gest1 = new GestordeReservas(list1);
        Gestao.GestordeReservas gest2 = new GestordeReservas(list2);
        
        //gest1.addreserva(r3);
        //gest1.ValidateRes(r3);
        
        gest1.PrintAllRes(list1);       
        
        
    }
    
}
