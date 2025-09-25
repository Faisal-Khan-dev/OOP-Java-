package Program;

import java.util.Scanner;

import LMS.Courses;
import LMS.Student;
import LMS.Student_List;

public class Main {
    public static void main(String[] args) {

        Student_List studentList = new Student_List(5);

        Student s1 = new Student(6);
        s1.setStudentName("Faisal");
        s1.setSeatNo(6041);
        s1.addCourse("OOP", 352);
        s1.addCourse("Descrete", 365);

        Student s2 = new Student(6);
        s2.setStudentName("Azhan");
        s2.setSeatNo(6040);
        s2.addCourse("OOP", 352);
        s2.addCourse("Descrete", 365);

        studentList.AddStudent(s1);
        studentList.AddStudent(s2);
        
        System.out.println(studentList);
    }
}
