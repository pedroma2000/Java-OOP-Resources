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
    
    protected String name;
    protected int year;
    protected String editor;
    protected Tracks[] tracks;
    
    CD(String tempname, int tempyear, String tempeditor, Tracks[] temptracks){
        
        name = tempname;
        year = tempyear;
        editor = tempeditor;
        tracks = temptracks;
    }
    
    public void printCDinfo(){
        System.out.println("Nome do CD: " + name);
        System.out.println("Ano de lançamento: " + year);
        System.out.println("Editora: " + editor);
        
        
        
        for (Tracks track : tracks) {
            track.printTrack();
        }
        
    }
}
