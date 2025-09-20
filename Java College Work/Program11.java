// Input marks and print the grade
import java.util.Scanner;;
public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        char grade;
        if(marks>=90 && marks<=100)
        {
            grade = 'A';
        }
        else if(marks>=80 && marks<=89)
        {
            grade = 'B';
        }
        else if(marks>=70 && marks<=79)
        {
            grade = 'C';
        }
        else if(marks>=60 && marks<=69)
        {
            grade = 'D';
        }
        else{
            grade = 'F';
        }
        System.out.println("The grade of the student is : "+grade);
        sc.close();
    }   
}
