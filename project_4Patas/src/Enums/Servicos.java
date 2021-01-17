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
public enum Servicos {

    /**
     * Servico de passeios
     */
    PASSEIOS,

    /**
     * Servico de alojamento
     */
    ALOJAMENTO,

    /**
     * Servico de transporte
     */
    TRANSPORTE,

    /**
     * Servico de Banho
     */
    BANHO,

    /**
     * Servico de Tosquia
     */
    TOSQUIA,

    /**
     * Servico de sessao de fotos
     */
    SESSAO_FOTO;

    /**
     * Metodo que retorna uma string com o servico corrspondente
     * @param serv
     * @return
     */
    public static String ServicoToString(Servicos serv) {

        switch (serv) {
            case PASSEIOS:
                return "Passeios";
            case ALOJAMENTO:
                return "Alojamento";
            case TRANSPORTE:
                return "Transporte";
            case BANHO:
                return "Banho";
            case TOSQUIA:
                return "Tosquia";
            case SESSAO_FOTO:
                return "Sessao de Fotos";
            default:
                return "Error";
        }

    }
}
