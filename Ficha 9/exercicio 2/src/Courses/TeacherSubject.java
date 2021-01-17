package Courses;

import java.util.Objects;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class TeacherSubject {

    private double hours;
    private Subject subject;


    public TeacherSubject(Subject subject, double   hours) {
        this.subject = subject;
        this.hours = hours;
    }

    @Override
    public String toString() {
        String text = "------------------------------------" + "\n"
                + "ID: " + subject.getId() + "\n"
                + "Nome: " + subject.getName() + "\n"
                + "Horas de aula: " + this.hours + "\n";
        text += "------------------------------------";
        return text;
    }

    public double getHours() {
        return hours;
    }

    public Subject getSubject() {
        return subject;
    }

    
    
    
    
}
