class Studentsss {
    int rollNo;
    int marks;

    public void setValues(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentTest {
    public static void main(String args[]) {
        Studentsss student = new Studentsss();
        student.setValues(101, 95);  // Example values
        student.display();
    }
}
