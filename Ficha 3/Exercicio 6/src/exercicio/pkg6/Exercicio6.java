/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg6;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double Input = Double.parseDouble(args[0]);
        double valor, valor1, valor2;
        
        valor = Input / 100;
        valor1 = (int) valor;
        valor2 = Input % 100;
        
        System.out.print(valor1);
        System.out.print(" euros e ");
        System.out.print(valor2);
        System.out.print(" centimos ");
        
    }
    
}
