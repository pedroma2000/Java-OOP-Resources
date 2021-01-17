/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.cd;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class CD {

     public String name;
     public int year;
     public String editor;
     public Tracks[] tracks;
     public double price;

    CD(String tempname, int tempyear, String tempeditor, Tracks[] temptracks) {

        name = tempname;
        year = tempyear;
        editor = tempeditor;
        tracks = temptracks;
    }

    public CD(String tempname, int tempyear, String tempeditor, Tracks[] temptracks, double tempprice) {

        name = tempname;
        year = tempyear;
        editor = tempeditor;
        tracks = temptracks;
        price = tempprice;
    }

    public void printCDinfo() {
        if (price != 0.0) {
            System.out.println("Nome do CD: " + name);
            System.out.println("Ano de lançamento: " + year);
            System.out.println("Editora: " + editor);
            System.out.println("Preco: " + price + " €");
        } else {
            System.out.println("Nome do CD: " + name);
            System.out.println("Ano de lançamento: " + year);
            System.out.println("Editora: " + editor);
            System.out.println("Preco: SEM PREÇO");
        }

        for (Tracks track : tracks) {
            track.printTrack();
        }

    }
}
