/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoPkg;

import Animais.Cao;
import Animais.Gato;
import static Enums.EstadoReserva.*;
import static Enums.Genero.*;
import static Enums.PorteCao.*;
import Enums.Servicos;
import static Enums.TipoGato.*;
import GestReserva.GestorReservas;
import GestReserva.Reserva;
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
        
        Cao c1 = new Cao(PEQUENO, "Fido", MASCULINO, 4, "55423");
        Cao c2 = new Cao(GRANDE, "LULU", FEMININO, 5, "78912");
        Gato g1 = new Gato(INTERIOR, "Bolinhas", MASCULINO, 2, "112980");
        Gato g2 = new Gato(EXTERIOR, "LUNA", FEMININO, 3, "222222"); 
        
//        System.out.println(c1.toString());
//        System.out.println(c2.toString());
//        System.out.println(g1.toString());
//        System.out.println(g2.toString());
        Reserva r1 = new Reserva(LocalDateTime.of(2019, Month.JANUARY, 16, 13, 20), 
                "001", "Jorge", c1, EM_PROCESSAMENTO);
        r1.adServico(Servicos.ALOJAMENTO);
        
        Reserva r2 = new Reserva(LocalDateTime.of(2019, Month.JANUARY, 17, 13, 20), 
                "002", "Miguel", c2, CONCLUIDO);
        r2.adServico(Servicos.PASSEIOS);
        
        Reserva r3 = new Reserva(LocalDateTime.of(2019, Month.JANUARY, 16, 13, 18), 
                "003", "Joao", g1, NAO_CONCLUIDO);
        r3.adServico(Servicos.SESSAO_FOTO);
        
        Reserva r4 = new Reserva(LocalDateTime.of(2019, Month.JANUARY, 16, 13, 18), 
                "004", "Hugo", g2, NAO_CONCLUIDO);
        r4.adServico(Servicos.TRANSPORTE);
        
        Reserva[] list = {r1, r2, r3, r4};
        
        GestorReservas manage = new GestorReservas();
        manage.addreserva(r1);
        manage.addreserva(r2);
        manage.addreserva(r3);
        manage.addreserva(r4);
        
        manage.PrintAllRes(list);
        
// teste de remover        
//        manage.removeReserva(r4);
//        manage.PrintAllRes(list);

// teste de validar reserva
//        manage.ValidateRes(r1);
//        System.out.println(r1.toString());
    }

}
