/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animais;

import Enums.Genero;
import Enums.TipoGato;
import static Enums.TipoGato.TipoToString;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Gato extends Animal{
    private TipoGato tipo;

    /**
     * Metodo Construtor de Gato
     * @param tipo
     * @param nome
     * @param genero
     * @param idade
     * @param id
     */
    public Gato(TipoGato tipo, String nome, Genero genero, int idade, String id) {
        super(nome, genero, idade, id);
        this.tipo = tipo;
    }

    @Override
    public int CalcPontos(int dias) {
        int pontos = 0;
        pontos = 3 * dias;
        return pontos;
    }
    
    @Override
    public String toString(){
        String text = super.toString();
        text += "Tipo de Gato : " + TipoToString(tipo) + "\n";
        return text;
    }
    
    
}
