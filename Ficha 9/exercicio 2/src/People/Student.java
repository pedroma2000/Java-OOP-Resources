/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package People;

import Courses.Course;
import enums.StudentType;
import java.time.LocalDateTime;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Student extends Person {
    private LocalDateTime firstRegist;
    private StudentType stype;
    private Course course;

    public Student(LocalDateTime firstRegist, StudentType stype, 
                   String code, String name, String address, int phoneNumb, Course course) {
        super(code, name, address, phoneNumb);
        this.firstRegist = firstRegist;
        this.stype = stype;
        this.course = course;
    }

    @Override
    double CalcHours() {
        return 0;
    }

    @Override
    public String toString() {
        String text = "";
        
        text += super.toString();
        text += "Primeira Matricula" + firstRegist + "\n";
        text += "Tipo de estudante" + StudentType.StudentTypeToString(stype) + "\n";
        text += "Curso : " + course + "\n";
        return text;
    }
    
}
