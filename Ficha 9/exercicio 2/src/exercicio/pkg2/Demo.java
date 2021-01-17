package exercicio.pkg2;

import Courses.Course;
import Courses.Subject;
import Courses.TeacherSubject;
import People.Student;
import People.Teacher;
import People.Worker;

import java.time.LocalDateTime;
import java.time.Month;

import static enums.StudentType.*;
import static enums.AcademicDegree.*;
import static enums.ScientificArea.*;
import static enums.AdminArea.*;

/**
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Testes - Curso: ");
        Course lei = new Course("Engenharia Informática", 1);
        System.out.println(lei.toString());
        System.out.println("-----------------");

        System.out.println("teste people objects: ");
        System.out.println(" ");

        Teacher t1 = new Teacher(DOUTORAMENTO, INFORMATICA, LocalDateTime.now(),
                LocalDateTime.of(2019, Month.JANUARY, 16, 16, 40, 33), "123", "ZÉ",
                "Rua das couves", 2445678);

        Teacher t2 = new Teacher(DOUTORAMENTO, BIOMEDICINA, LocalDateTime.now(),
                LocalDateTime.of(2019, Month.JANUARY, 16, 16, 40, 33), "123", "Tone",
                "Rua das cebolas", 2445678);

        Student s1 = new Student(LocalDateTime.of(2019, Month.JANUARY, 16, 16, 40, 33),
                ESTUDANTE_NORMAL, "3456", "Joaquim tone", "Rua das cenouras", 9876543, lei);

        Worker w1 = new Worker(LICENCIATURA, SECRETARIA,
                LocalDateTime.of(2019, Month.FEBRUARY, 16, 16, 40, 33), 25.65,
                LocalDateTime.of(2019, Month.DECEMBER, 16, 16, 40, 33), "567843",
                "Zequinha", "Rua muito longe", 91674432);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(s1.toString());
        System.out.println(w1.toString());
        System.out.println("-----------------");
        System.out.println("Test Subjects : ");

        Subject sub1 = new Subject("Paradigmas", 12);
        Subject sub2 = new Subject("ESoftware", 13);
        Subject sub3 = new Subject("Matematica", 14);
        Subject sub4 = new Subject("Matematica2", 15);
        Subject sub5 = new Subject("Matematica3", 16);

        t1.addSubject(sub1, 2.30);
        t1.addSubject(sub2, 4.30);
        t1.addSubject(sub3, 1.50);
        t1.addSubject(sub4, 1.50);
        t1.addSubject(sub5, 1.50);

        t1.CalcHours();


    }

}
