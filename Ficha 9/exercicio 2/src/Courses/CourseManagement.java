/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Courses;

import java.util.Objects;

/**
 * @author Pedro Machado "pedroma2000"
 */
public class CourseManagement extends containerofobjectsapi.ContainerOfObjects {

    public CourseManagement(int maxSize) {
        super(maxSize);
    }

    public boolean addSubject(Subject subject, TeacherSubject Tsubject) {
        
        boolean test = this.equals(subject, Tsubject);
        
        if (test = true){
            super.addObject(Tsubject);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeSubject(Subject s) {
        int i = super.findObject(s);
        return (boolean) super.removeObject(i);
    }

    public void print() {
        super.printall();
    }

    public Object[] getSubjects() {
        return super.getObjects();
    }

    public void printAll() {
        super.printall();
    }

    public boolean equals(Subject subject, TeacherSubject t) {

        if (subject.getId() == t.getSubject().getId()) {
            if (subject.getName() == t.getSubject().getName()) {
                return true;
            }
        } else {
        }
        return false;
    }

}
