package LMS;

public class Courses {

    private String courseName;
    private int courseCode;

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        
        return this.getCourseName() + "\t" + this.getCourseCode() + "\n";
    }

}

