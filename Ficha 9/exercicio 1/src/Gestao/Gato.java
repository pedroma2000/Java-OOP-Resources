package Gestao;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */

import enums.TipoGato;

public class Gato extends Animal{
    private TipoGato tipo;

    public Gato(int id, String nome, String genero, int idade, TipoGato tipo) {
        super(id, nome, genero, idade);
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        String text = " ";
        
        text += super.toString();
        text += "Tipo : " + tipo + "\n";
        
        
        return text;
    }
    
}
