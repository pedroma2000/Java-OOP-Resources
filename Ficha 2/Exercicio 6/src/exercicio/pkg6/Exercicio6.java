/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg6;

import java.util.Arrays;
import java.util.stream.IntStream;

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
        int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] listaB = {6, 99, -1, 12, 1, -2};
        int duplicados = 0;

        int[] listaC = IntStream.concat(Arrays.stream(listaA), Arrays.stream(listaB)).toArray();
        int L = listaC.length;

        for (int i = 0; i <= listaC.length; i++) {
            for (int j = i + 1; j < listaC.length; j++) {
                if (listaC[i] == listaC[j] && i != j) {
                    duplicados++;
                }
            }
        }

        System.out.println(Arrays.toString(listaC));

        Arrays.sort(listaC);
        for (int i = 0; i <= listaC.length; i++) {
            for (int j = i + 1; j < listaC.length; j++) {
                if (listaC[i] == listaC[j]) {
                    listaC[j] = listaC[L - 1];
                    --L;
                }
            }
        }

//        int posicaoC = 0;

//        for (int i = 0; i < listaA.length; i++) {
//            if (posicoes[i] != 1) {
//                listaC[posicaoC] = listaA[i];
//                posicaoC += 1;
//            }
//        }

        
        System.out.println(duplicados);

    }

//        int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
//        int[] listaB = {6, 99, -1, 12, 1, -2};
//        int[] posicoes = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //posições iguais ao A
//
//        int repetidos = 0;
//
//        for (int i = 0; i < listaA.length; i++) {
//            for (int j = 0; j < listaB.length; j++) {
//                if (listaA[i] == listaB[j]) {
//                    posicoes[i] = 1;
//                    repetidos += 1;
//                }
//            }
//
//        }
//
//        int[] listaC = new int[listaA.length + listaB.length - 1];
//        int posicaoC = 0;
//
//        for (int i = 0; i < listaA.length; i++) {
//            if (posicoes[i] != 1) {
//                listaC[posicaoC] = listaA[i];
//                posicaoC += 1;
//            }
//        }
//
//        for (int i = 0; i < listaB.length; i++) {
//            listaC[posicaoC] = listaB[i];
//            posicaoC += 1;
//        }
//
//        for (int i = 0; i < 15; i++) {
//            System.out.print(" " + listaC[i] + ",");
//        }
//
//        System.out.println(" ");
//    }
}
