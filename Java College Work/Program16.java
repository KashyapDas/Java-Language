// print the sum of n natural number
import java.util.Scanner;
public class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++)
        {
            sum += i;
        }
        System.out.print("Sum of n natural number is : "+sum);
        sc.close();
    }
}
