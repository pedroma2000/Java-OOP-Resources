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
        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numeros.length; i++) {
            boolean Primo = true;
            if (numeros[i] == 1) { //excluir o n 1
                Primo = false;
            }

            for (int j = 2; j < numeros[i]; j++) { //comecar a dividir por 2 pk por 1 da sempre 0
                if (numeros[i] % j == 0) { //vai dividir por todos os numeros a baixo de numero[i]
                    Primo = false;
                    break;
                }
            }
            
            if (Primo) {
                System.out.println(numeros[i] + " e primo");
            } else {
                System.out.println(numeros[i] + " nao e primo");
            }
        }

        System.out.println("");

        for (int i = 0; i < numeros.length; i++) {
            int a = 0;
            for (int k = 1; k < numeros[i]; k++) {
                if (numeros[i] % k == 0) { //soma os divisores em a
                    a += k;
                }
            }
            if (a == numeros[i]) { //se a for igual ao numero, o numero é perfeito
                System.out.println(numeros[i] + " e numero perfeito");
            }
        }
    }
}
