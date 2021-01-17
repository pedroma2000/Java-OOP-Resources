/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg3;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        
        int i=0;
        int mult = 1;
        int count = 0;
        int max = lista[0];
        
        for (; i < lista.length; i++){
            if(lista[i] > 0){
                mult *= lista[i];
            }
            
            if (lista[i] < 0){
                count++;
            }
            
            if (lista[i] > max){
                max = lista[i];
            }
            
            
            
        }
        
        System.out.println("Multiplicacao = "+mult);
        System.out.println("Elementos negativos = "+count);
        System.out.println("maior numero = "+max);
    }
    
}
