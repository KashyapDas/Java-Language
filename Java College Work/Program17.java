// find the factorial of a number
import java.util.Scanner;
public class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=n; i++)
        {
            fact*= i;
        }
        System.out.println("Factorial : "+fact);
        sc.close();
    }
}
