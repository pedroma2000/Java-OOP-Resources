/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestao;

import enums.PorteCao;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Cao extends Animal {
    private PorteCao porte;

    public Cao(int id, String nome, String genero, int idade, PorteCao porte) {
        super(id, nome, genero, idade);
        this.porte = porte;
    }
    
    
    
    
    
    @Override
    public String toString(){
        String text = " ";
        
        text += super.toString();
        text += "Porte : " + porte + "\n";
        
        
        return text;
    }
    
}
