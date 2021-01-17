/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Courses;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Subject {

    private String name;
    private int id;

    public Subject(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    
    @Override
    public String toString() {
        String text = "";

        text += "Disciplina : " + name + "\n";
        text += "ID disciplina :" + id + "\n";

        return text;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
