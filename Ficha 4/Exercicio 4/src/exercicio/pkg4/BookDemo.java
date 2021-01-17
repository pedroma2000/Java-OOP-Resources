/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg4;

import java.util.Arrays;
import pp_fp04.book.Book;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class BookDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book book1 = new Book();

        book1.Titulo = "Java 8";
        book1.Editor = "FCA";
        book1.A.Acro = new char[]{'F', 'M', 'M'};
        book1.A.Nome = "Mario Martins";
        book1.A.Nacionalidade = "Portuguesa";
        book1.A.Acro2 = new char[]{'J', 'M', 'M'};
        book1.A.Nome2 = "Jorge Moreira";
        book1.A.Nacionalidade2 = "Portuguesa";
        book1.Ano = 2018;
        book1.Paginas = 675;
        book1.Cotacao = 9;

        System.out.println("");
        System.out.println("-----------book 1----------");
        System.out.print("Titulo :");
        System.out.println(book1.Titulo);
        System.out.print("Editor :");
        System.out.println(book1.Editor);
        System.out.println("Autor 1:");
        System.out.println("Nome : " + book1.A.Nome);
        System.out.println("Acronimo : " + Arrays.toString(book1.A.Acro));
        System.out.println("Nacionalidade : " + book1.A.Nacionalidade);
        System.out.println("Autor 2:");
        System.out.println("Nome : " + book1.A.Nome2);
        System.out.println("Acronimo : " + Arrays.toString(book1.A.Acro2));
        System.out.println("Nacionalidade : " + book1.A.Nacionalidade2);
        System.out.print("Ano : ");
        System.out.println(book1.Ano);
        System.out.print("Paginas : ");
        System.out.println(book1.Paginas);
        System.out.print("Cotacao : ");
        System.out.println(book1.Cotacao);

    }

}
