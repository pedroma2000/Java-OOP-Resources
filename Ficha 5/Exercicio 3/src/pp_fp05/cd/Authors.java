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
public class Authors {
    
    public String name;
    public int age;
    public String address;
    public int nif;
    public int nib;
    public String authortype;
    public static int objcount = 0;
    
    public Authors(String tempname, int tempage, String tempaddress, int tempnif, int tempnib, String tempauthortype ){
        
        name = tempname;
        age = tempage;
        address = tempaddress;
        nif = tempnif;
        nib = tempnib;
        authortype = tempauthortype;
        objcount++;
    }
    
    public Authors(String tempname, int tempage, String tempauthortype){
        name = tempname;
        age = tempage;
        authortype = tempauthortype;
        objcount++;
    }
    
    public void authorPrint(){
        if ("Seller".equals(authortype)){
            System.out.println("Nome do autor: "+name);
            System.out.println("Idade: "+age);
            System.out.println("Morada: "+address);
            System.out.println("NIF: "+nif);
            System.out.println("NIB: "+nib);
            System.out.println("Tipo de autor: "+authortype);
        } else {
            System.out.println("Nome do autor: "+name);
            System.out.println("Idade: "+age);
            System.out.println("Tipo de autor: "+authortype);
        }
    }
    
    
}
