package LMS;

public class Student {

    private String studentName;
    private int seatNo;
    private Courses[] courseList;
    int coursesCount;

    public Student(int maxCourses) {
        courseList = new Courses[maxCourses];
        coursesCount = 0;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void addCourse(String courseName, int courseCode) {
        if (coursesCount < courseList.length) {
            Courses c = new Courses();
            c.setCourseName(courseName);
            c.setCourseCode(courseCode);
            courseList[coursesCount] = c;
            coursesCount++;
        } else {
            System.out.println("Courses list is full!");
        }

    }
    
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Student Name: ").append(studentName).append("\n");
    sb.append("Seat No: ").append(seatNo).append("\n");
    sb.append("Courses:\n");

    for (int i = 0; i < coursesCount; i++) {
        sb.append(i+1+ ". Course: " + courseList[i].getCourseName())
          .append(" ,  Code: ")
          .append(courseList[i].getCourseCode())
          .append("\n");
        }

        return sb.toString();
    }

}