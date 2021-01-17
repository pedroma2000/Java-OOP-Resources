/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestao;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Animal {
    private int id;
    private String nome;
    private String genero;
    private int idade;

    public Animal(int id, String nome, String genero, int idade) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }
    
    @Override
    public String toString(){
        String text = " ";
        
        text += "ID : " + id + "\n";
        text += "Nome : " + nome + "\n";
        text += "Genero : " + genero + "\n";
        text += "Idade : " + idade + "\n";
        
        return text;
    }
    
    
}
