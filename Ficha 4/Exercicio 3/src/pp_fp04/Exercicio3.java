/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp04;

import pp_fp04.exchange.User;
import pp_fp04.exchange.CurrencyRates;

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

        System.out.println("Valores de Cambio");
        for (int i = 0; i < CurrencyRates.TaxMatrix.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < CurrencyRates.TaxMatrix[i].length; j++) {
                System.out.print((CurrencyRates.TaxMatrix[i][j]) + "\t" + "\t");
            }
        }

        User user1 = new User();

        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';
        user1.name = new char[]{'B', 'r', 'u', 'n', 'o'};
        user1.email = new char[]{'b', 'm', 'o', '@', 'e', 's', 't', 'g',
            'f', '.', 'i', 'p', 'p', '.', 'p', 't'};

        user1.E.setCarValues(100.99, 0);
        user1.E.setCarValues(200.99, 2);
        user1.E.setCarValues(140.99, 3);
        user1.E.setCarValues(101.50, 6);
        user1.E.setNumber1(4);

        user1.E.setFoodValues(10, 0);
        user1.E.setFoodValues(20, 1);
        user1.E.setFoodValues(30, 2);
        user1.E.setFoodValues(40, 3);
        user1.E.setNumber2(4);

        char[] carro = new char[]{'M', 'e', 'r', 'c', 'e', 'd', 'e', 's'};
        user1.E.setDescriptionCar(carro);

        user1.E.costCar();
        CurrencyRates.ConversaoValor();
        CurrencyRates.ConversaoMedia();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("-------------User 1------------");
        System.out.println("Total Despesas carro: ");
        System.out.println("Em Euros: " + user1.E.getSoma() + " €");
        System.out.println("Em Dolar: " + CurrencyRates.getValorDolar() + " $");
        System.out.println("Em Iene: " + CurrencyRates.getValorIene() + " Ienes");
        System.out.println("Em Libras: " + CurrencyRates.getValorLibra() + " £");

        System.out.println(" ");

        System.out.println("Medias Despesas carro: ");
        System.out.println("Em Euros: " + user1.E.getMedia() + " €");
        System.out.println("Em Dolar: " + CurrencyRates.getMediaDolar() + " $");
        System.out.println("Em Iene: " + CurrencyRates.getMediaIene() + " Ienes");
        System.out.println("Em Libras: " + CurrencyRates.getMediaLibra() + " £");
        
        System.out.println(" ");
        
        user1.E.costFood();
        CurrencyRates.ConversaoValor();
        CurrencyRates.ConversaoMedia();
        
        System.out.println("Total Despesas comida: ");
        System.out.println("Em Euros: " + user1.E.getSoma() + " €");
        System.out.println("Em Dolar: " + CurrencyRates.getValorDolar() + " $");
        System.out.println("Em Iene: " + CurrencyRates.getValorIene() + " Ienes");
        System.out.println("Em Libras: " + CurrencyRates.getValorLibra() + " £");
        
        System.out.println(" ");
        
        System.out.println("Medias Despesas comida: ");
        System.out.println("Em Euros: " + user1.E.getMedia() + " €");
        System.out.println("Em Dolar: " + CurrencyRates.getMediaDolar() + " $");
        System.out.println("Em Iene: " + CurrencyRates.getMediaIene() + " Ienes");
        System.out.println("Em Libras: " + CurrencyRates.getMediaLibra() + " £");
    }
    
    //3.2 se colocarmos protected, o package pp_fp04 deixa de poder aceder as variaveis do outro package
}
