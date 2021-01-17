/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg2;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrix = new int[3][3];
        
        int i;
        int j;
        int sum = 0;
        int pos = 0;
        double media;
        
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <=2; j++) {
                matrix[0][0] = 11;
                matrix[0][1] = 7;
                matrix[0][2] = 333;
                
                matrix[1][0] = -20;
                matrix[1][1] = -23;
                matrix[1][2] = 63;
                
                matrix[2][0] = -22;
                matrix[2][1] = 501;
                matrix[2][2] = 10000;
            }
        }
        
        for (i = 0; i <= 2; i++) {
            System.out.println("");
            for (j = 0; j <=2; j++) {
                System.out.print(matrix[i][j]+"\t");
                sum += matrix[i][j];
                pos++;
            }
        }
        
        media = sum / pos;

        System.out.println("");
        System.out.println("soma = "+sum);
        System.out.println("media = "+media);
    }
}
