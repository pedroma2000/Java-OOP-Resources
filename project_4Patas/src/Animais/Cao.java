/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animais;

import Enums.Genero;
import Enums.PorteCao;
import static Enums.PorteCao.PorteToString;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Cao extends Animal {
    private PorteCao porte;

    /**
     * Metodo construtor de Cao
     * @param porte
     * @param nome
     * @param genero
     * @param idade
     * @param id
     */
    public Cao(PorteCao porte, String nome, Genero genero, int idade, String id) {
        super(nome, genero, idade, id);
        this.porte = porte;
    }

    @Override
    public int CalcPontos(int dias) {
      int pontos = 0;
      pontos = 2 * dias;
      return pontos;
    }
    
    @Override
    public String toString(){
        String text = super.toString();
        text += "Porte : " + PorteToString(porte) + "\n";
        return text;
    }
}
