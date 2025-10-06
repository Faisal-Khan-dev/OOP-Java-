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
        s1.setSeatNo("6041");
        s1.addCourse("OOP", 352);
        s1.addCourse("Descrete", 365);

        Student s2 = new Student(6);
        s2.setStudentName("Azhan");
        s2.setSeatNo("6040");
        s2.addCourse("OOP", 352);
        s2.addCourse("Descrete", 365);

        Student s3 = new Student(6);
        s3.setStudentName("Umer");
        s3.setSeatNo("6042");
        s3.addCourse("LI", 355);
        s3.addCourse("DLD", 355);

        Student s4 = new Student(6);
        s4.setSeatNo("6043");
        s4.setStudentName("Shahab");
        s4.addCourse("PST", 355);
        s4.addCourse("Communication", 355);

        studentList.addStudent(s1);
        studentList.addStudent(s2);
        studentList.addStudent(s4);
        studentList.addStudent(1, s3);

        // studentList.removeBySeatNo("6043");
        // studentList.searchByName("Azhan");
        // studentList.searchBySeatNo("6042");
        // studentList.updateName("6043", "Abdullah");
        // studentList.sortBySeatNo();
        
        
        System.out.println(studentList);
    }
}
