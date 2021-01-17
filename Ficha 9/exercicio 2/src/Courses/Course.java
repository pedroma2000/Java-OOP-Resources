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
public class Course {
    private String name;
    private int id;

    public Course(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public String toString(){
        String text="";
        text += "Curso : " + name + "\n";
        text += "ID : " + id + "\n";    
        return text;
    }
    
}
