/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg5;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cambioDolar = 0.88;
        double cambioEuro = 1.14;
        String euro = "e", dolar = "d";
        
        double valor = Double.parseDouble(args[0]);
        double valor2;
        
        if (args[1].equals(euro)){
            valor2 = valor * cambioEuro;
            System.out.println("Valor em euros: "+valor2);
        } else if (args[1].equals(dolar)){
            valor2 = valor * cambioDolar;
            System.out.println("Valor em dolar: "+valor2);
        }
        
    }
    
}
