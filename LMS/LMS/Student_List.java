package LMS;

public class Student_List {

    private Student[] students;
    private int count;

    public Student_List(int maxStd) {
        students = new Student[maxStd];
    }

    public void AddStudent(Student s) {
        if (count < students.length) {
            students[count] = s;
            count++;
        } else {
            System.out.println("Student list is full!");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student List:\n");

        for (int i = 0; i < count; i++) {
          
                sb.append("---- Student ").append(i + 1).append(" ----\n");
                sb.append(students[i].toString());
                sb.append("\n");
            }
        
        return sb.toString();

    }
}