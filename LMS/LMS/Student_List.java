package LMS;

public class Student_List {

    private Student[] students;
    private int size;
    private int capacity;

    public Student_List(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        students = new Student[capacity];
    }

    public void addStudent(Student s) {
        if (size < capacity) {
            students[size] = s;
            size++;
        } else {
            System.out.println("Student list is full!");
        }
    }

    public boolean addStudent(int index, Student newStudent) {
        if (index < 0 || index > size) {
            System.out.println("ERROR: Index out of bound exception.");
            return false;
        }

        // Optional: check for duplicate seat number if needed
        for (int i = 0; i < size; i++) {
            if (students[i].getSeatNo() == newStudent.getSeatNo()) {
                System.out.println("ERROR: Seat number already exists!");
                return false;
            }
        }

        if (size >= capacity) {
            System.out.println("ERROR: No more capacity.");
            return false;
        }

        // Shift elements to the right
        for (int i = size - 1; i >= index; i--) {
            students[i + 1] = students[i];
        }

        // Insert new student
        students[index] = newStudent;
        size++;

        return true;
    }

    public void removeBySeatNo(String seatNo) {

        for (int i = 0; i < size; i++) {
            if (students[i].getSeatNo().equals(seatNo)) {
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--size] = null;
                System.out.println("Student of seatNo (" + seatNo + ") removed!");
                return;
            }
        }

    }

    public void searchByName(String name) {
        for (int i = 0; i < size; i++) {
            if (students[i].getStudentName().equals(name)) {
                // System.out.println(students[i]);
                return;
            }
        }
        // System.out.println("Student not found of the name " + name);

    }
    
    public void searchBySeatNo(String seatNo) {
        for (int i = 0; i < size; i++) {
            if (students[i].getSeatNo().equals(seatNo)) {
                // System.out.println(students[i]);
                return;
            }
        }
        // System.out.println("Student not found at this Seat number " + seatNo);

    }

    public void updateName(String seatNo, String newName) {
        for (int i = 0; i < size; i++) {
            if (students[i].getSeatNo().equals(seatNo)) {
                students[i].setStudentName(newName);
                System.out.println(students[i]);
                return;
            }
        }
    }

    public void sortBySeatNo() {
    for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - i - 1; j++) {
            if (students[j].getSeatNo().compareTo(students[j + 1].getSeatNo()) > 0) {
                // swap
                Student temp = students[j];
                students[j] = students[j + 1];
                students[j + 1] = temp;
            }   
        }
    }
}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student List:\n");

        for (int i = 0; i < size; i++) {
          
                sb.append("---- Student ").append(i + 1).append(" ----\n");
                sb.append(students[i].toString());
                sb.append("\n");
            }
        
        return sb.toString();

    }
}