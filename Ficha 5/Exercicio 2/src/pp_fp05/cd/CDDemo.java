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
public class CDDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tracks[] t = {new Tracks(1, "Ho Hey", 90, "Lumineers"), 
                      new Tracks(2, "Stubborn Love", 105, "Wesley Schultz")};
        
        CD cd = new CD("The Lumineers", 2012, "Dualtone Records", t);
        
        cd.printCDinfo();
    }

}
