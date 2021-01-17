/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg8;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double m = Double.parseDouble(args[0]);
        double umEuro = 0;
        double doisEuro = 0;
        double Cinqucent = 0;
//        double Vintcent = 0;
//        double Dezcent = 0;
//        double CincCent = 0;

        while (m != 0) {
            if (m >= 2) {
                m -= 2;
                doisEuro += 1;
                System.out.print(doisEuro+" moedas de dois euros ");
            } else if (m >= 1) {
                m -= 1;
                umEuro += 1;
                System.out.print(umEuro+" moedas de um euros ");
            } else if (m >= 0.50) {
                m -= 0.50;
                Cinqucent += 1;
                System.out.print(Cinqucent+" moedas de cinquenta centimos ");
            }
        }
        
        if (m >= 2) {
                System.out.print(doisEuro+" moedas de dois euros ");
            } else if (m >= 1) {
                System.out.print(umEuro+" moedas de um euros ");
            } else if (m >= 0.50) {
                System.out.print(Cinqucent+" moedas de cinquenta centimos ");
            }
    }

}
