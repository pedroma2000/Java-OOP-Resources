/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package People;

import Courses.Course;
import Courses.CourseManagement;
import Courses.Subject;
import Courses.TeacherSubject;
import enums.AcademicDegree;
import enums.ScientificArea;

import java.time.LocalDateTime;

/**
 * @author Pedro Machado "pedroma2000"
 */
public class Teacher extends Person {

    private final int MAX_SUBJECTS = 5;
    private AcademicDegree tdegree;
    private ScientificArea scarea;
    private LocalDateTime beginContract;
    private LocalDateTime endContract;
    private CourseManagement manage = new CourseManagement(MAX_SUBJECTS);

    public Teacher(AcademicDegree tdegree, ScientificArea scarea,
                   LocalDateTime beginContract, LocalDateTime endContract,
                   String code, String name, String address, int phoneNumb) {
        super(code, name, address, phoneNumb);
        this.tdegree = tdegree;
        this.scarea = scarea;
        this.beginContract = beginContract;
        this.endContract = endContract;
    }

    public boolean addSubject(Subject subject, double hours) {
        TeacherSubject mySubject = new TeacherSubject(subject, hours);
        return manage.addSubject(subject, mySubject);
    }


    @Override
    public double CalcHours() {
        double hours = 0.0;
        Object[] tmp = manage.getSubjects();
        for (Object out : tmp) {
            TeacherSubject sub = (TeacherSubject) out;
            hours += sub.getHours();
        }
        return hours;
    }

    @Override
    public String toString() {
        String text = "";

        text += super.toString();
        text += "Habilitações : " + AcademicDegree.AcademicDegreeToString(tdegree) + "\n";
        text += "Area de estudos : " + ScientificArea.ScientificAreaToString(scarea) + "\n";
        text += "Inicio do Contrato : " + beginContract + "\n";
        text += "Fim do Contrato : " + endContract + "\n";

        return text;
    }

    public void printSubjects() {
        manage.printAll();
    }

}
