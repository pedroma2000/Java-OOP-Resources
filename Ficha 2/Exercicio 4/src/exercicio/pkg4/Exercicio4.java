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
        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
        char letra;
        int vogais = 0;
        int consoantes = 0;
        char espaco = ' ';

        for (int i = 0; i < nome.length; i++) {
            letra = nome[i];

            if (letra == 'A' || letra == 'a' || letra == 'e' || letra == 'E'
                    || letra == 'i' || letra == 'I' || letra == 'o' || letra == 'O'
                    || letra == 'u' || letra == 'U') {
                vogais++;
            } else if (letra != 'A' && letra != 'a' && letra != 'e' && letra != 'E'
                    && letra != 'i' && letra != 'I' && letra != 'o' && letra != 'O'
                    && letra != 'u' && letra != 'U' && letra != espaco && letra != '\n') {
                consoantes++;
            }

        }

//        String frase = String.valueOf(nome);
//
//        String[] divide = frase.split(" ");
//        String Name1 = divide[0];
//        String Name2 = divide[1];
//        
//        Name2 = Name2.concat(","+Name1);
//        
//        
//        System.out.println("Vogais = " + vogais);
//        System.out.println("Consoantes = " + consoantes);
//        
//        System.out.println(Name2);
        System.out.print("Apelido,Nome: ");
        for(int i = 4; i < nome.length - 1; i++){
            System.out.print(nome[i]);
        }
        
        System.out.print(",");
        
        for (int i = 0; i < 3; i++){
            System.out.print(nome[i]);
        }
        System.out.println("");
    }

}
