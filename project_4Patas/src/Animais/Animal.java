/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animais;

import Enums.Genero;
import static Enums.Genero.GeneroToString;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public abstract class Animal {
    private String nome;
    private Genero genero;
    private int idade;
    private String id;

    /**
     * Metodo construtor de Animal
     * @param nome
     * @param genero
     * @param idade
     * @param id
     */
    public Animal(String nome, Genero genero, int idade, String id) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.id = id;
    }
    
    /**
     * Metodo criador por mim para dar pontos aos animais.O gato recebe 3 pontos por cada dia que esteja na empresa.
     * O cao recebe 2 pontos por cada dia que esteja na empresa.
     * O Metodo recebe ou os dias ou as horas e retorna o numero de pontos
     * do animal.
     * @param dias
     * @return
     */
    public abstract int CalcPontos(int dias);
    
    @Override
    public String toString(){
        String text ="Nome : "+ nome +"\n";
        text += "Genero : "+ GeneroToString(genero) + "\n";
        text += "Idade : "+ idade + "\n";
        text += "ID : " + id + "\n";
        return text;
    }
    
}
