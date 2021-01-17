/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg4;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = Integer.parseInt(args[0]);
        
        double radianos;
        
        radianos = numero * (Math.PI / 180);
        
        System.out.println(radianos);

    }
    
}
