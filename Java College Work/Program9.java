// Check weather a no is odd or even
import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        if(number%2==0)
        {
            System.out.println("Number is even...");
        } 
        else{
            System.out.println("Number is odd...");
        }
        sc.close();
    }
}
