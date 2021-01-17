/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package People;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
abstract class Person {

    private String code;
    private String name;
    private String address;
    private int phoneNumb;

    public Person(String code, String name, String address, int phoneNumb) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.phoneNumb = phoneNumb;
    }

    abstract double CalcHours();

    @Override
    public String toString() {
        String text = "";

        text += "Codigo : " + code + "\n";
        text += "Nome : " + name + "\n";
        text += "Morada : " + address + "\n";
        text += "Numero Telfone : " + phoneNumb + "\n";

        return text;
    }

}
