import java.util.*;
import java.util.Scanner;

// Pure Class (Model Class)
class Student {
    String name;
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
}

// Service Class
class StudentService {

    // a) Accept list of students (passed as argument)
    // b) Calculate average marks
    int calculateAverage(List<Student> students) {
        int sum = 0;
        for (Student s : students) {
            sum += s.marks;
        }
        return sum / students.size();
    }

    // c) Print students with marks greater than average
    void printAboveAverage(List<Student> students, double average) {
        System.out.println("\nStudents with marks greater than average (" + average + "):");
        for (Student s : students) {
            if (s.marks > average) {
                System.out.println(s.name + " (Roll: " + s.rollNumber + ", Marks: " + s.marks + ")");
            }
        }
    }
}

// Main Class
public class Program37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            System.out.print("Marks: ");
            double marks = sc.nextDouble();
            sc.nextLine(); // consume newline

            studentList.add(new Student(name, roll, marks));
        }

        StudentService service = new StudentService();
        int avg = service.calculateAverage(studentList);
        System.out.println("\nAverage Marks = " + avg);

        service.printAboveAverage(studentList, avg);

        sc.close();
    }
}
